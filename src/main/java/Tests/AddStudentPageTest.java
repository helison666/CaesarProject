package Tests;

import Pages.AddStudentPage;
import Pages.AddStudentPage.ChangeEnglishLevelFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

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

    @Test
    public void getHeaderAddPage()
    {
        String expected = "Create/Edit students";
        String actual;
        actual = addStudent.getHeaderAdd().getText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void clickXCloseBtn()
    {
        addStudent.getxCloseBtn().click();
        Assert.assertTrue(addStudent.getxCloseBtn().isDisplayed());
    }

    @Test
    public void clickCloseBtn()
    {
        addStudent.getCloseBtn().click();
        Assert.assertTrue(addStudent.getCloseBtn().isDisplayed());
    }

    @Test
    public void setAddStudent() throws Exception
    {
        ArrayList<String> studentExpected = addStudent.addStudent("Groupid", "Name", "Lastname",
                "Upper-intermediate","", "", "4","Ivanov");

        addStudent.getSubmitBtn().click();
        ArrayList<String> studentActual = addStudent.getStudActual();
        Assert.assertEquals(studentActual, studentExpected);
    }
}

////*[@id="students"]/div/table/tbody/tr[10]
//addStudent.setChangeLanguage(ChangeEnglishLevelFields.INTERMEDIATE);