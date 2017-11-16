package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class AddStudentPage extends StudentsPage{

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
        getAddStudentBtn().click();
        this.groupIdField = driver.findElement(By.name("groupId"));
        this.nameField = driver.findElement(By.name("name"));
        this.lastNameField = driver.findElement(By.name("lastName"));
        this.englishLevelField = new Select (driver.findElement(By.name("englishLevel")));
        this.cvUrlField = driver.findElement(By.name("CvUrl"));
        this.imageUrlField = driver.findElement(By.name("imageUrl"));
        this.entryScoreField = driver.findElement(By.name("entryScore"));
        this.approvedByField = driver.findElement(By.name("approvedBy"));
        this.submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
        this.closeBtn = driver.findElement(By.xpath("//button[text()='Close']"));
        this.xCloseBtn = driver.findElement(By.xpath("//button/span[text()='×']"));
        this.headerAdd = driver.findElement(By.className("modal-title"));

    }

    public WebElement getGroupIdField()
    {
        return groupIdField;
    }
    public WebElement getNameField()
    {
        return nameField;
    }
    public WebElement getLastNameField()
    {
        return lastNameField;
    }
    public Select getEnglishLevelField()
    {
        return englishLevelField;
    }
    public WebElement getCvUrlField()
    {
        return cvUrlField;
    }
    public WebElement getImageUrlField()
    {
        return imageUrlField;
    }
    public WebElement getEntryScoreField()
    {
        return entryScoreField;
    }
    public WebElement getApprovedByField()
    {
        return approvedByField;
    }
    public WebElement getSubmitBtn()
    {
        return submitBtn;
    }
    public WebElement getCloseBtn()
    {
        return closeBtn;
    }
    public WebElement getxCloseBtn()
    {
        return xCloseBtn;
    }
    public WebElement getHeaderAdd(){
        return headerAdd;
    }

    public void setChangeLanguage(ChangeEnglishLevelFields level) {
        getEnglishLevelField().selectByVisibleText(level.toString());
    }

    public ArrayList<String> addStudent(String groupID, String name, String lastName, String englishLvl, String cvUrl,
                                        String imgUrl, String entryScore, String approvedBy)
    {
        getGroupIdField().sendKeys(groupID);
        getNameField().sendKeys(name);
        getLastNameField().sendKeys(lastName);
        getEnglishLevelField().selectByValue(englishLvl);
        getCvUrlField().sendKeys(cvUrl);
        getImageUrlField().sendKeys(imgUrl);
        getEntryScoreField().sendKeys(entryScore);
        getApprovedByField().sendKeys(approvedBy);

        ArrayList<String> studentsList = new ArrayList<String>();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        studentsList.add("");
        studentsList.add(groupID);
        studentsList.add(name);
        studentsList.add(lastName);
        studentsList.add(englishLvl);
        studentsList.add(cvUrl);
        studentsList.add(imgUrl);
        studentsList.add(entryScore);
        studentsList.add(approvedBy);

        return studentsList;
    }




}
