package Tests;

import Pages.MainAdminPage;
import Pages.StudentsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class StudentsPageTest {

    StudentsPage studPage;
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/admin");
        studPage = new StudentsPage(driver);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        //driver.quit();
    }

    @Test
    public void getHeadText()
    {
        String expected = "Caesar Admin Panel";
        String actual;
        actual = studPage.getHeadingText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getHeaderGroupIdText()
    {
        String expected = "groupId";
        String actual;
        actual = studPage.getHeaderGroupIdText();
        Assert.assertEquals(actual, expected);
        //System.out.println(driver.findElement((By.xpath("//table/thead/tr/th[text()='groupId']"))).getText());
    }

    @Test
    public void getHeaderNameText()
    {
        String expected = "name";
        String actual;
        actual = studPage.getHeaderNameText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void groupIdIsDisplayed() {

            studPage.clickDeleteBtnNewStudent();

    }
}
////*[@id="students"]/div/table/tbody/tr[10]/td[1]
////*[@id="students"]/div/table/tbody/tr[10]/td[9]/button[1]
////*[@id="students"]/div/table/tbody/tr[10]/td[9]/button[2]