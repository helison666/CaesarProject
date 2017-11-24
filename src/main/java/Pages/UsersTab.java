package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsersTab extends MainAdminPage {



    private WebElement headerFirstName;
    private WebElement headerLastName;
    private WebElement headerRole;
    private WebElement headerLocation;
    private WebElement headerPhoto;
    private WebElement headerLogin;
    private WebElement headerPassword;
    private WebElement headerActions;
    private WebElement addUserBtn;

    private WebElement editBtn;
    private WebElement deleteBtn;

    private WebElement userFirstName;
    private WebElement userLastName;
    private WebElement userRole;
    private WebElement userLocation;
    private WebElement userPhoto;
    private WebElement userLogin;
    private WebElement userPassword;

    public UsersTab(WebDriver driver) {
        super(driver);
    }


    public WebElement getHeaderFirstName() {
        return this.headerFirstName = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/thead/tr/th[1]"));
    }

    public WebElement getHeaderLastName() {
        return this.headerLastName = driver.findElement((By.xpath("//*[@id=\"users\"]/div/table/thead/tr/th[2]")));
    }

    public WebElement getHeaderRole() {
        return this.headerRole = driver.findElement((By.xpath("//*[@id=\"users\"]/div/table/thead/tr/th[3]")));
    }

    public WebElement getHeaderLocation() {
        return this.headerLocation = driver.findElement((By.xpath("//*[@id=\"users\"]/div/table/thead/tr/th[4]")));
    }

    public WebElement getHeaderPhoto() {
        return this.headerPhoto = driver.findElement((By.xpath("//*[@id=\"users\"]/div/table/thead/tr/th[5]")));
    }

    public WebElement getHeaderLogin() {
        return this.headerLogin = driver.findElement((By.xpath("//*[@id=\"users\"]/div/table/thead/tr/th[6]")));
    }

    public WebElement getHeaderPassword() {
        return this.headerPassword = driver.findElement((By.xpath("//*[@id=\"users\"]/div/table/thead/tr/th[7]")));
    }

    public WebElement getHeaderActions() {
        return this.headerActions = driver.findElement((By.xpath("//*[@id=\"users\"]/div/table/thead/tr/th[8]")));
    }
//buttons
    public WebElement getAddUserBtn() {
        return this.addUserBtn = driver.findElement((By.xpath("//*[@id=\"add-new-user\"]")));
    }

    public WebElement getEditBtn(int lastButton) {
        return this.editBtn  = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr["+ lastButton +"]/td[8]/button[1]"));
    }

    public WebElement getDeleteBtn(int lastButton) {
        return deleteBtn = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr["+ lastButton +"]/td[8]/button[2]"));
    }

    public String getTextHeaderFirstName(){
        return getHeaderFirstName().getText();
    }

    public String getTextHeaderLastName(){
        return getHeaderLastName().getText();
    }

    public String getTextHeaderRole(){
        return getHeaderRole().getText();
    }

    public String getTextHeaderLocation(){
        return getHeaderLocation().getText();
    }

    public String getTextHeaderPhoto(){
        return getHeaderPhoto().getText();
    }

    public String getTextHeaderLogin(){
        return getHeaderLogin().getText();
    }

    public String getTextHeaderPassword(){
        return getHeaderPassword().getText();
    }

    public String getTextHeaderActions(){
        return getHeaderActions().getText();
    }



    //userGetters
    public WebElement getUserFirstName(int userNumber) {
        return this.userFirstName = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr["+ userNumber +"]/td[1]"));
    }

    public WebElement getUserLastName(int userNumber) {
        return this.userLastName = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr["+ userNumber +"]/td[2]"));
    }

    public WebElement getUserRole(int userNumber) {
        return this.userRole = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr["+ userNumber +"]/td[3]"));
    }

    public WebElement getUserLocation(int userNumber) {
        return this.userLocation = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr["+ userNumber +"]/td[4]"));
    }

    public WebElement getUserPhoto(int userNumber) {
        return this.userPhoto = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr["+ userNumber +"]/td[5]"));
    }

    public WebElement getUserLogin(int userNumber) {
        return this.userLogin = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr["+ userNumber +"]/td[6]"));
    }

    public WebElement getUserPassword(int userNumber) {
        return this.userPassword = driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr["+ userNumber +"]/td[7]"));
    }

    public String getUserFirstNameText(int userNumber) {
        return getUserFirstName(userNumber).getText();
    }

    public String getUserLastNameText(int userNumber) {
        return getUserLastName(userNumber).getText();
    }

    public String getUserRoleText(int userNumber) {
        return getUserRole(userNumber).getText();
    }

    public String getUserLocationText(int userNumber) {
        return getUserLocation(userNumber).getText();
    }

    public String getUserPhotoText(int userNumber) {
        return getUserPhoto(userNumber).getText();
    }

    public String getUserLoginText(int userNumber) {
        return getUserLogin(userNumber).getText();
    }

    public String getUserPasswordText(int userNumber) {
        return getUserPassword(userNumber).getText();
    }

    public int getCountOfUsers() {
        int i = 1;
        while (true) {
            if (driver.findElements(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr[" + i + "]")).size() != 0) {
                i++;
            } else {
                i--;
                break;
            }
        }
        return i;
    }

    public void clickDeleteButton(int lastUser){
        getDeleteBtn(lastUser).click();
    }

    public void clickEditButton(int lastUser){
        getEditBtn(lastUser).click();
    }



//    public int getCountOfUsers() {
//        int i = 1;
//        while (true) {
//            if (driver.findElement(By.xpath("//*[@id=\"users\"]/div/table/tbody/tr[" + i + "]")).isDisplayed()) {
//                i++;
//            } else {
//                i--;
//                break;
//            }
//
//        }
//        return i;
//    }

}
