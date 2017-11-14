package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentsPage extends MainAdminPage {

    //Элементы
    private WebElement headingText;
    private WebElement headerGroupId;
    private WebElement headerName;
    private WebElement headerLastName;
    private WebElement headerEnglishLevel;
    private WebElement headerCvUrl;
    private WebElement headerImageUrl;
    private WebElement headerEntryScore;
    private WebElement headerApprovedBy;
    private WebElement headerActions;

    //Конструктор
    public StudentsPage(WebDriver driver) {
        super(driver);
        getStudentsTab().click();
        this.headingText = driver.findElement(By.tagName("h2"));
        this.headerGroupId = driver.findElement((By.xpath("//th[text()='groupId']")));
        this.headerName = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[2]")));
        this.headerLastName = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[3]")));
        this.headerEnglishLevel = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[4]")));
        this.headerCvUrl = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[5]")));
        this.headerImageUrl = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[6]")));
        this.headerEntryScore = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[7]")));
        this.headerApprovedBy = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[8]")));
        this.headerActions = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[9]")));
    }

    //Геттеры элементов
    public WebElement getHeading()
    {
        return headingText;
    }
    public WebElement getHeaderGroupId()
    {
        return headerGroupId;
    }
    public WebElement getHeaderName()
    {
        return headerName;
    }
    public WebElement getHeaderLastName()
    {
        return  headerLastName;
    }
    public WebElement getHeaderEnglishLevel()
    {
        return headerEnglishLevel;
    }
    public WebElement getHeaderCvUrl()
    {
        return headerCvUrl;
    }
    public WebElement getHeaderImageUrl()
    {
        return headerImageUrl;
    }
    public WebElement getHeaderEntryScore()
    {
        return headerEntryScore;
    }
    public WebElement getHeaderApprovedBy()
    {
        return headerApprovedBy;
    }
    public WebElement getHeaderActions()
    {
        return headerActions;
    }



    //Геттеры текста элементов
    public String getHeadingText()
    {
        return getHeading().getText();
    }

    public String getHeaderGroupIdText()
    {
        return getHeaderGroupId().getText();
    }
    public String getHeaderNameText()
    {
        return getHeaderName().getText();
    }
    public String getHeaderLastNameText()
    {
        return getHeaderLastName().getText();
    }
    public String getHeaderEnglishLevelText()
    {
        return getHeaderEnglishLevel().getText();
    }
    public String getHeaderCvUrlText()
    {
        return getHeaderCvUrl().getText();
    }
    public String getHeaderImageUrlText()
    {
        return getHeaderImageUrl().getText();
    }
    public String getHeaderEntryScoreText()
    {
        return getHeaderEntryScore().getText();
    }
    public String getHeaderApprovedByText()
    {
        return getHeaderApprovedBy().getText();
    }
    public String getHeaderActionsText()
    {
        return getHeaderActions().getText();
    }



}
