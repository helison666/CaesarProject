package Tests;


import Pages.AddStudentPage;
import Pages.StudentsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;


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
        driver.quit();
    }

    @Test
    public void HeadText()
    {
        String expected = "Caesar Admin Panel";
        String actual;
        actual = studPage.getHeadingText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HeaderGroupIdText()
    {
        String expected = "groupId";
        String actual;
        actual = studPage.getHeaderGroupIdText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HeaderNameText()
    {
        String expected = "name";
        String actual;
        actual = studPage.getHeaderNameText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HeaderLastNameText()
    {
        String expected = "lastName";
        String actual;
        actual = studPage.getHeaderLastNameText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HeaderEnglishLvlText()
    {
        String expected = "englishLevel";
        String actual;
        actual = studPage.getHeaderEnglishLevelText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HeaderCvUrlText()
    {
        String expected = "CvUrl";
        String actual;
        actual = studPage.getHeaderCvUrlText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HeaderImageUrlText()
    {
        String expected = "imageUrl";
        String actual;
        actual = studPage.getHeaderImageUrlText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HeaderEntryScoreText()
    {
        String expected = "entryScore";
        String actual;
        actual = studPage.getHeaderEntryScoreText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HeaderApprovedByText()
    {
        String expected = "approvedBy";
        String actual;
        actual = studPage.getHeaderApprovedByText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void HeaderActionsText()
    {
        String expected = "actions";
        String actual;
        actual = studPage.getHeaderActionsText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void AddStudentBtnText()
    {
        String expected = "Add student";
        String actual;
        actual = studPage.getAddStudentBtnText();
        Assert.assertEquals(actual, expected);
    }


}
