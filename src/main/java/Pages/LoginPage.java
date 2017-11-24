package Pages;

import Data.IUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage  {

    protected WebDriver driver;
    // Fields
    private WebElement loginLabel;
    private WebElement loginInput;
    private WebElement passwordLabel;
    private WebElement passwordInput;
    private WebElement signin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // PageObject

    // get Data

    public WebElement getLoginLabel() {
        return this.loginLabel = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/span[2]/label"));
    }

    public WebElement getLoginInput() {
        return this.loginInput = driver.findElement(By.name("login"));
    }

    public WebElement getPasswordLabel() {
        return this.passwordLabel = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/span[3]/label"));
    }

    public WebElement getPasswordInput() {
        return this.passwordInput = driver.findElement(By.name("password"));
    }

    public WebElement getSignin() {
        return this.signin = driver.findElement(By.className("submit"));
    }

    // Functional

    public String getLoginLabelText() {
        return getLoginLabel().getText().trim();
    }

    public String getLoginInputText() {
        return getLoginInput().getText();
    }

    public String getPasswordLabelText() {
        return getPasswordLabel().getText().trim();
    }

    public String getPasswordInputText() {
        return getPasswordInput().getText();
    }

    public String getSignintText() {
        return getSignin().getText().trim();
    }

    // set Data

    public void setLoginInput(String login) {
        getLoginInput().sendKeys(login);
    }

    public void setLoginInputClear(String login) {
        clearLoginInput();
        setLoginInput(login);
    }

    public void setPasswordInput(String password) {
        getPasswordInput().sendKeys(password);
    }

    public void setPasswordInputClear(String password) {
        clearPasswordInput();
        setPasswordInput(password);
    }

    public void clearLoginInput() {
        getLoginInput().clear();
    }

    public void clearPasswordInput() {
        getPasswordInput().clear();
    }

    public void clickLogin() {
        getLoginInput().click();
    }

    public void clickPassword() {
        getPasswordInput().click();
    }

    public void clickSignin() {
        getSignin().click();
    }

    // Business Logic

    private void setLoginData(IUser user) {
        setLoginInputClear(user.getLogin());
        setPasswordInputClear(user.getPassword());
        clickSignin();
    }

    public MainAdminPage successAdminLogin(IUser admin) {
        setLoginData(admin);
        // Return a new page object representing the destination.
        return new MainAdminPage(driver);
    }






}
