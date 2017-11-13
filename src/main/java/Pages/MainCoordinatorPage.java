package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MainCoordinatorPage {

    public WebDriver driver = null;

    WebElement locations;
    WebElement groups;
    WebElement students;
    WebElement schedule;
    WebElement add;
    WebElement about;
    WebElement currentCoordinatorProfile;
    WebElement myGroups;
    WebElement endedGroups;
    WebElement currentGroups;
    WebElement futureGroups;
    WebElement editcurrentCoordinatorProfile;
    WebElement createGruop;

    public MainCoordinatorPage(WebDriver driver) {
        this.driver = driver;
        login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://localhost:3000");
//        this.mainLogoTitle = driver.findElement(By.xpath("/html/body/div[1]/h2"));
//        this.usersTab = driver.findElement(By.partialLinkText("users"));
//        this.groupsTab = driver.findElement(By.partialLinkText("group"));
//        this.studentsTab = driver.findElement(By.partialLinkText("students"));
//        this.homeButton = driver.findElement(By.xpath("/html/body/button"));
    }

    private void init(WebDriver driver) {
    }

    public void login() {
        driver.findElement(By.name("login")).sendKeys("dmytro");
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.className("submit ")).click();
    }


}
