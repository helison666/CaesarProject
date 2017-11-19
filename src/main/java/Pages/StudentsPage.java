package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

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
    private WebElement addStudentBtn;

    //Конструктор
    public StudentsPage(WebDriver driver) {
        super(driver);
        getStudentsTab().click();
    }

    //Геттеры элементов
    public WebElement getHeading()
    {
        headingText = driver.findElement(By.tagName("h2"));
        return headingText;
    }
    public WebElement getHeaderGroupId()
    {
        headerGroupId = driver.findElement((By.xpath("//th[text()='groupId']")));
        return headerGroupId;
    }
    public WebElement getHeaderName()
    {
        headerName = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[2]")));
        return headerName;
    }
    public WebElement getHeaderLastName()
    {
        headerLastName = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[3]")));
        return  headerLastName;
    }
    public WebElement getHeaderEnglishLevel()
    {
        headerEnglishLevel = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[4]")));
        return headerEnglishLevel;
    }
    public WebElement getHeaderCvUrl()
    {
        headerCvUrl = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[5]")));
        return headerCvUrl;
    }
    public WebElement getHeaderImageUrl()
    {
        headerImageUrl = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[6]")));
        return headerImageUrl;
    }
    public WebElement getHeaderEntryScore()
    {
        headerEntryScore = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[7]")));
        return headerEntryScore;
    }
    public WebElement getHeaderApprovedBy()
    {
        headerApprovedBy = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[8]")));
        return headerApprovedBy;
    }
    public WebElement getHeaderActions()
    {
        headerActions = driver.findElement((By.xpath("//*[@id=\"students\"]/div/table/thead/tr/th[9]")));
        return headerActions;
    }
    public WebElement getAddStudentBtn()
    {
        addStudentBtn = driver.findElement(By.xpath("//button[text()='Add student']"));
        return  addStudentBtn;
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

    public int getTrCount()
    {
        int countTr = 1;
        while (true)
        {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            if(driver.findElements(By.xpath("//*[@id=\"students\"]/div/table/tbody/tr["+ countTr +"]/td[1]")).size() != 0)
            {
               countTr++;
            }
            else
            {
                countTr--;
                break;
            }
        }
        return countTr;
    }
    public int getTdCount()
    {
        int countTd = 1;
        while (true)
        {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            if(driver.findElements(By.xpath("//*[@id=\"students\"]/div/table/tbody/tr[1]/td["+countTd+"]")).size() != 0 && !driver.findElement(By.xpath("//*[@id=\"students\"]/div/table/tbody/tr[1]/td["+countTd+"]")).getText().equals("EditDelete"))
            {
                countTd++;
            }
            else
            {
                countTd--;
                break;
            }
        }
        return countTd;
    }

    public ArrayList<String> getStudActual(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        int trNumber = getTrCount();
        int tdNumber = getTdCount();

        ArrayList<String> studentActual = new ArrayList<String>();
        for (int i = 0; i <= tdNumber; i++) {
            if(i==0)
            {
                studentActual.add("");
            }
            else {
                studentActual.add(driver.findElement(By.xpath("//*[@id=\"students\"]/div/table/tbody/tr["+trNumber+"]/td[" + i + "]")).getText());
            }

        }
       return studentActual;
    }
    public void clickEditBtnNewStudent()
    {
        int trCount = getTrCount();
        driver.findElement(By.xpath("//*[@id=\"students\"]/div/table/tbody/tr["+trCount+"]/td[9]/button[1]")).click();
    }
    public void clickDeleteBtnNewStudent()
    {
        int trCount = getTrCount();
        driver.findElement(By.xpath("//*[@id=\"students\"]/div/table/tbody/tr["+trCount+"]/td[9]/button[2]")).click();
    }


}
