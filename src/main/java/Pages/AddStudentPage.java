package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class AddStudentPage extends StudentsPage {

    private WebElement groupIdField;
    private WebElement nameField;
    private WebElement lastNameField;
    private Select englishLevelField;
    private WebElement cvUrlField;
    private WebElement imageUrlField;
    private WebElement entryScoreField;
    private WebElement approvedByField;
    private WebElement submitBtn;
    private WebElement closeBtn;
    private WebElement xCloseBtn;
    private WebElement headerAdd;
    Student student1 = new Student("DP-040-JS", "Petrick", "Cooler", "Intermediate","","", "100","Ivanov V.");
    Student student2 = new Student("DP-045-JS", "Vasya", "Buffer", "Intermediate","","", "146","Ivanov V.");

    public static enum ChangeEnglishLevelFields {
        ELEMENTERY("Elementary"),
        PRE_INTERMEDIATE_LOW("Pre-intermediate low"),
        PRE_INTERMEDIATE("Pre-intermediate"),
        PRE_INTERMEDIATE_STRONG("Pre-intermediate strong"),
        INTERMEDIATE_LOW("Intermediate low"),
        INTERMEDIATE("Intermediate"),
        INTERMEDIATE_STRONG("Intermediate strong"),
        UPPER_INTERMEDIATE_LOW("Upper-intermediate low"),
        UPPER_INTERMEDIATE("Upper-intermediate"),
        UPPER_INTERMEDIATE_STRONG("Upper-intermediate strong"),
        ADVANCED("Advanced");
        //
        //
        private String field;
        private ChangeEnglishLevelFields(String field) {
            this.field = field;
        }

        @Override
        public String toString() {
            return this.field;
        }
    }

    public AddStudentPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getGroupIdField()
    {
        groupIdField = driver.findElement(By.name("groupId"));
        return groupIdField;
    }
    public WebElement getNameField()
    {
        nameField = driver.findElement(By.name("name"));
        return nameField;
    }
    public WebElement getLastNameField()
    {
        lastNameField = driver.findElement(By.name("lastName"));
        return lastNameField;
    }
    public Select getEnglishLevelField()
    {
        englishLevelField = new Select (driver.findElement(By.name("englishLevel")));
        return englishLevelField;
    }
    public WebElement getCvUrlField()
    {
        cvUrlField = driver.findElement(By.name("CvUrl"));
        return cvUrlField;
    }
    public WebElement getImageUrlField()
    {
        imageUrlField = driver.findElement(By.name("imageUrl"));
        return imageUrlField;
    }
    public WebElement getEntryScoreField()
    {
        entryScoreField = driver.findElement(By.name("entryScore"));
        return entryScoreField;
    }
    public WebElement getApprovedByField()
    {
        approvedByField = driver.findElement(By.name("approvedBy"));
        return approvedByField;
    }
    public WebElement getSubmitBtn()
    {
        submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
        return submitBtn;
    }
    public WebElement getCloseBtn()
    {

        closeBtn = driver.findElement(By.xpath("//button[text()='Close']"));
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOf(closeBtn));

        return closeBtn;
    }
    public WebElement getxCloseBtn()
    {

        xCloseBtn = driver.findElement(By.xpath("//button/span[text()='×']"));
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOf(xCloseBtn));
        return xCloseBtn;
    }
    public WebElement getHeaderAdd(){
        headerAdd = driver.findElement(By.className("modal-title"));
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOf(headerAdd));
        return headerAdd;
    }

    public void setChangeLanguage(ChangeEnglishLevelFields level) {
        getEnglishLevelField().selectByVisibleText(level.toString());
    }


    public ArrayList<String> addStudent() throws Exception {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getGroupIdField().sendKeys(student1.getGroupID());
        Thread.sleep(500);
        getNameField().sendKeys(student1.getName());
        Thread.sleep(500);
        getLastNameField().sendKeys(student1.getLastName());
        Thread.sleep(500);
        getEnglishLevelField().selectByValue(student1.getEnglishLvl());
        Thread.sleep(500);
        getCvUrlField().sendKeys(student1.getCvUrl());
        Thread.sleep(500);
        getImageUrlField().sendKeys(student1.getImgUrl());
        Thread.sleep(500);
        getEntryScoreField().sendKeys(student1.getEntryScore());
        Thread.sleep(500);
        getApprovedByField().sendKeys(student1.getApprovedBy());

        ArrayList<String> studentsList = new ArrayList<String>();
        studentsList.add("");
        studentsList.add(student1.getGroupID());
        studentsList.add(student1.getName());
        studentsList.add(student1.getLastName());
        studentsList.add(student1.getEnglishLvl());
        studentsList.add(student1.getCvUrl());
        studentsList.add(student1.getImgUrl());
        studentsList.add(student1.getEntryScore());
        studentsList.add(student1.getApprovedBy());

        return studentsList;
    }
    public ArrayList<String> editStudent() throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOf(getGroupIdField()));
        getGroupIdField().clear();
        getGroupIdField().sendKeys(student2.getGroupID());
        Thread.sleep(500);
        getNameField().clear();
        getNameField().sendKeys(student2.getName());
        Thread.sleep(500);
        getLastNameField().clear();
        getLastNameField().sendKeys(student2.getLastName());
        Thread.sleep(500);
        getEnglishLevelField().selectByValue(student2.getEnglishLvl());
        Thread.sleep(500);
        getCvUrlField().clear();
        getCvUrlField().sendKeys(student2.getCvUrl());
        Thread.sleep(500);
        getImageUrlField().clear();
        getImageUrlField().sendKeys(student2.getImgUrl());
        Thread.sleep(500);
        getEntryScoreField().clear();
        getEntryScoreField().sendKeys(student2.getEntryScore());
        Thread.sleep(500);
        getApprovedByField().clear();
        getApprovedByField().sendKeys(student2.getApprovedBy());

        ArrayList<String> studentsList = new ArrayList<String>();
        studentsList.add("");
        studentsList.add(student2.getGroupID());
        studentsList.add(student2.getName());
        studentsList.add(student2.getLastName());
        studentsList.add(student2.getEnglishLvl());
        studentsList.add(student2.getCvUrl());
        studentsList.add(student2.getImgUrl());
        studentsList.add(student2.getEntryScore());
        studentsList.add(student2.getApprovedBy());

        return studentsList;
    }




}
