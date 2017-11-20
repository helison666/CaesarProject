package Tests;

import Pages.AddStudentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class AddStudentPageTest {

    AddStudentPage addStudent;
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/admin");
        addStudent = new AddStudentPage(driver);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test(priority = 1)
    public void getHeaderAddPage()
    {
        String expected = "Create/Edit students";
        String actual;
        actual = addStudent.getHeaderAdd().getText();
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 2)
    public void clickXCloseBtn() throws Exception
    {
        addStudent.getxCloseBtn().click();
        Assert.assertTrue(addStudent.getxCloseBtn().isDisplayed());
    }

    @Test(priority = 3)
    public void clickCloseBtn()
    {
        addStudent.getCloseBtn().click();
        Assert.assertTrue(addStudent.getCloseBtn().isDisplayed());
    }

    @Test(priority = 4)
    public void setAddStudent() throws Exception
    {
        ArrayList<String> studentExpected = addStudent.addStudent();

        addStudent.getSubmitBtn().click();
        ArrayList<String> studentActual = addStudent.getStudActual();
        Assert.assertEquals(studentActual, studentExpected);
    }

    @Test(priority = 5)
    public void editNewStudent() throws Exception
    {
        addStudent.getCloseBtn().click();
        addStudent.clickEditBtnNewStudent();
        ArrayList<String> studentExpected = addStudent.editStudent();

        addStudent.getSubmitBtn().click();
        ArrayList<String> studentActual = addStudent.getStudActual();
        Assert.assertEquals(studentActual, studentExpected);
    }

    @Test(priority = 6)
    public void deleteNewStudent() throws Exception
    {
        addStudent.getCloseBtn().click();
        int firstCountTr = addStudent.getTrCount();
        addStudent.clickDeleteBtnNewStudent();
        int afterCountTr = addStudent.getTrCount();

        Assert.assertNotEquals(firstCountTr, afterCountTr);
    }
}
