package Tests;

import Pages.MainAdminPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class MainAdminPageTest {

    MainAdminPage mainPage = null;
    WebDriver driver = null;

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/admin");
        mainPage = new MainAdminPage(driver);

    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void mainLogoTitleTest(){
        assertNotNull(mainPage.getMainLogoTitle());
    }

    @Test
    public void getUsersTabTest(){
        assertNotNull(mainPage.getUsersTab());
    }

    @Test
    public void getGroupsTabTest(){
        assertNotNull(mainPage.getGroupsTab());
    }

    @Test
    public void getStudentsTabTest(){
        assertNotNull(mainPage.getStudentsTab());
    }

    @Test
    public void groupsTabClickTest(){
        mainPage.groupsTabClick();
        assertNotNull(driver.findElement(By.xpath(" //*[@id=\"groups\"]/div/table/thead/tr/th[1]")));
    }

    @Test
    public void studentsTabClickTest(){
        mainPage.studentsTabClick();
        assertNotNull(driver.findElement(By.xpath(" //*[@id=\"students\"]/div/table/thead/tr/th[1]")));
    }

    @Test
    public void  homeButtonbClickTest(){
        mainPage.homeButtonbClick();
        assertNotNull(driver.findElement(By.className("groupLocation")));
    }


}