package Pages;

import Data.IUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AddUserPage extends UsersTab {

    private WebElement firstNameField;
    private WebElement lastNameField;
    private Select roleField;
    private Select locationField;
    private WebElement photoField;
    private WebElement loginField;
    private WebElement passwordField;
    private WebElement submitBtn;
    private WebElement closeBtn;
    private WebElement xCloseBtn;
    private WebElement header;

    public static enum ChangeRoleFields {
        TEACHER("Teacher"),
        COORDINATOR("Coordinator"),
        ADMINISTRATOR("Administrator");
        //
        private String field;
        private ChangeRoleFields(String field) {
            this.field = field;
        }

        @Override
        public String toString() {
            return this.field;
        }
    }

    public static enum ChangeLocationFields {
        CHERNIVTSY("Chernivtsy"),
        DNIPRO("Dnipro"),
        IVANO_FRANKIVSK("Ivano-Frankivsk"),
        KYIV("Kyiv"),
        LVIV("Lviv"),
        RIVNE("Rivne"),
        SOFIA("Sofia");
        //
        private String field;
        private ChangeLocationFields(String field) {
            this.field = field;
        }

        @Override
        public String toString() {
            return this.field;
        }
    }

    public AddUserPage(WebDriver driver) {
        super(driver);
//        clickAddUser();

    }

    public WebElement getFirstNameField() {
        return this.firstNameField = driver.findElement(By.name("firstName"));
    }

    public WebElement getLastNameField() {
        return this.lastNameField = driver.findElement(By.name("lastName"));
    }

    public Select getRoleField() {
        return  this.roleField = new Select (driver.findElement(By.name("role")));
    }

    public Select getLocationField() {
        return this.locationField = new Select (driver.findElement(By.name("location")));
    }

    public WebElement getPhotoField() {
        return this.photoField = driver.findElement(By.name("photo"));
    }

    public WebElement getLoginField() {
        return this.loginField = driver.findElement(By.name("login"));
    }

    public WebElement getPasswordField() {
        return this.passwordField = driver.findElement(By.name("password"));
    }

    public WebElement getSubmitBtn() {
        return this.submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
    }

    public void clickSubmitBtn(){
        getSubmitBtn().click();
    }

    public WebElement getCloseBtn() {
        return this.closeBtn = driver.findElement(By.xpath("//button[text()='Close']"));
    }

    public WebElement getxCloseBtn() {
        return this.xCloseBtn = driver.findElement(By.xpath("//button/span[text()='×']"));
    }

    public WebElement getHeader() {
        return this.header = driver.findElement(By.className("modal-title"));
    }
    public String getHeaderText(){
        return getHeader().getText();
    }




//    public ArrayList<String> addUser(String firstName, String lastName, String role, String location,
//                                        String photo, String login, String passwors)
//    {
//        getFirstNameField().sendKeys(firstName);
//        getLastNameField().sendKeys(lastName);
//        getRoleField().selectByValue(role);
//        getLocationField().selectByValue(location);
//        getPhotoField().sendKeys(photo);
//        getLoginField().sendKeys(login);
//        getPasswordField().sendKeys(passwors);
//
//        ArrayList<String> studentsList = new ArrayList<String>();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        studentsList.add("");
//        studentsList.add(firstName);
//        studentsList.add(lastName);
//        studentsList.add(role);
//        studentsList.add(location);
//        studentsList.add(photo);
//        studentsList.add(login);
//        studentsList.add(passwors);
//
//        return studentsList;
//    }

    public void addUser(IUser user)
    {
        getFirstNameField().sendKeys(user.getFirstname());
        getLastNameField().sendKeys(user.getLastname());
        getRoleField().selectByValue(user.getRole());
        getLocationField().selectByValue(user.getLocation());
        getPhotoField().sendKeys(user.getPhoto());
        getLoginField().sendKeys(user.getLogin());
        getPasswordField().sendKeys(user.getPassword());
    }

    public void clearFields(IUser user)
    {
        getFirstNameField().clear();
        getLastNameField().clear();
        getPhotoField().clear();
        getLoginField().clear();
        getPasswordField().clear();
    }
}
