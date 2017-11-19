package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainAdminPage {

    public WebDriver driver = null;


    WebElement mainLogoTitle;
    WebElement usersTab;
    WebElement groupsTab;
    WebElement studentsTab;
    WebElement homeButton;


    public MainAdminPage(WebDriver driver) {
        this.driver = driver;
        login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://localhost:3000/admin");
    }

    private void init(WebDriver driver) {


    }

    public WebElement getMainLogoTitle() {
        mainLogoTitle = driver.findElement(By.xpath("/html/body/div[1]/h2"));
        return mainLogoTitle;
    }

    public WebElement getUsersTab() {
        usersTab = driver.findElement(By.partialLinkText("users"));
        return usersTab;
    }

    public WebElement getGroupsTab() {
        groupsTab = driver.findElement(By.partialLinkText("group"));
        return groupsTab;
    }

    public WebElement getStudentsTab() {
        studentsTab = driver.findElement(By.partialLinkText("students"));
        return studentsTab;
    }

    public WebElement getHomeButton() {
        homeButton = driver.findElement(By.xpath("/html/body/button"));
        return homeButton;
    }

    public void login(){
        driver.findElement(By.name("login")).sendKeys("dmytro");
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.className("submit ")).click();
    }

    public void  usersTabClick(){
        getUsersTab().click();
    }

    public void  groupsTabClick(){
        getGroupsTab().click();
    }

    public void  studentsTabClick(){
        getStudentsTab().click();
    }

    public void  homeButtonbClick(){
        getHomeButton().click();
    }

}
