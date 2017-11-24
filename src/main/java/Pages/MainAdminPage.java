package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainAdminPage {

    protected WebDriver driver;

    private WebElement mainLogoTitle;
    private WebElement usersTab;
    private WebElement groupsTab;
    private WebElement studentsTab;
    private WebElement homeButton;
    private WebElement addNewUserButton;






    public MainAdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainAdminPage() {

    }

    public WebElement getMainLogoTitle() {
        return  this.mainLogoTitle = driver.findElement(By.xpath("/html/body/div[1]/h2"));
    }

    public WebElement getUsersTab() {
        return this.usersTab = driver.findElement(By.partialLinkText("users"));
    }

    public WebElement getGroupsTab() {
        return this.groupsTab = driver.findElement(By.partialLinkText("group"));
    }

    public WebElement getStudentsTab() {
        return this.studentsTab = driver.findElement(By.cssSelector("body > div.container > ul > li:nth-child(3) > a"));
    }

    public WebElement getHomeButton() {
        return this.homeButton = driver.findElement(By.xpath("/html/body/button"));
    }

    public WebElement getAddNewUserButton() {
        return this.addNewUserButton = driver.findElement(By.id("add-new-user"));
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

    public void  clickAddUser(){
        getAddNewUserButton().click();
    }

    public String  getTextclickAddUser(){
        return getAddNewUserButton().getText();
    }

    public void getUser(){

    }



}
