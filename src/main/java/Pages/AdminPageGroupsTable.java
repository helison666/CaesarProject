package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AdminPageGroupsTable extends MainAdminPage {

    WebElement nameTableColumn;
    WebElement locationTableColumn;
    WebElement budgetOwnerTableColumn;
    WebElement directionTableColumn;
    WebElement startDateTableColumn;
    WebElement finishDateTableColumn;
    WebElement teachersTableColumn;
    WebElement expertsTableColumn;
    WebElement stageTableColumn;
    WebElement actionsTableColumn;

    WebElement addGroupButton;
    WebElement editButton;
    WebElement deleteButton;

    public AdminPageGroupsTable(WebDriver driver) {
        super(driver);
        login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        this.nameTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[1]"));
        this.locationTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[2]"));
        this.budgetOwnerTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[3]"));
        this.directionTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[4]"));
        this.startDateTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[5]"));
        this.finishDateTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[6]"));
        this.teachersTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[7]"));
        this.expertsTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[8]"));
        this.stageTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[9]"));
        this.actionsTableColumn = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/table/thead/tr/th[10]"));


        

        this.addGroupButton = driver.findElement(By.id("add-new-user"));
        this.editButton = driver.findElement(By.className("btn btn-info edit"));
        this.deleteButton = driver.findElement(By.className("btn btn-danger delete"));
    }

    private void init(WebDriver driver) {
    }

    public WebElement getNameTableColumn() {
        return getNameTableColumn();
    }

    public WebElement getLocationTableColumn() {
        return getLocationTableColumn();
    }

    public WebElement getBudgetOwnerTableColumn() {
        return getBudgetOwnerTableColumn();
    }

    public WebElement getDirectionTableColumn() {
        return getDirectionTableColumn();
    }

    public WebElement getStartDateTableColumn() {
        return getStartDateTableColumn();
    }

    public WebElement getFinishDateTableColumn() {
        return getFinishDateTableColumn();
    }

    public WebElement getTeachersTableColumn() {
        return getTeachersTableColumn();
    }

    public WebElement getExpertsTableColumn() {
        return getExpertsTableColumn();
    }

    public WebElement getStageTableColumn() {
        return getStageTableColumn();
    }

    public WebElement getActionsTableColumn() {
        return getActionsTableColumn();
    }

    public WebElement getAddGroupButton() {
        return getAddGroupButton();
    }

    public WebElement getEditButton() {
        return getEditButton();
    }

    public WebElement getDeleteButton() {
        return getDeleteButton();
    }


}
