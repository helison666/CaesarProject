package Tests;

import Data.*;
import Pages.AddStudentPage;
import Pages.LoginPage;
import Pages.MainAdminPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AddStudentPageTest extends StudentsPageTest {
    AddStudentPage addStudentPage;

    @Override
    public void clickStudentTab(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        application = Application.get(applicationSources);
        //
        // Steps
        LoginPage loginPage = application.load();

        MainAdminPage adminHomePage = loginPage.successAdminLogin(adminUser);
        Thread.sleep(1000);
        application.loadAdminPage();

        addStudentPage = new AddStudentPage(application.getDriver());
        addStudentPage.studentsTabClick();
    }

    @DataProvider
    public Object[][] getApplicationSources() {
        return new Object[][] {
                /*{ ApplicationSourcesRepository.getFirefoxHerokuApplication(),
                        UserRepository.get().getLogin(),
                },
*/
                { ApplicationSourcesRepository.getChromeHerokuApplication(),
                        UserRepository.get().getLogin(),

                },
        };
    }


    @Test(priority = 1, dataProvider = "getApplicationSources")
    public void getHeaderAddPage(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        addStudentPage.getAddStudentBtn().click();
        String expected = "Create/Edit students";
        String actual;
        actual = addStudentPage.getHeaderAdd().getText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(priority = 2, dataProvider = "getApplicationSources")
    public void clickXCloseBtn(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        addStudentPage.getAddStudentBtn().click();
        addStudentPage.getxCloseBtn().click();
        Assert.assertTrue(addStudentPage.getxCloseBtn().isDisplayed(), "Close button is cliked");
        application.quit();
    }

    @Test(priority = 3, dataProvider = "getApplicationSources")
    public void clickCloseBtn(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        addStudentPage.getAddStudentBtn().click();
        addStudentPage.getCloseBtn().click();
        Assert.assertTrue(addStudentPage.getCloseBtn().isDisplayed(), "Close button is cliked");
        application.quit();
    }

    @Test(priority = 4, dataProvider = "getApplicationSources")
    public void setAddStudent(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        addStudentPage.getAddStudentBtn().click();
        ArrayList<String> studentExpected = addStudentPage.addStudent();

        addStudentPage.getSubmitBtn().click();
        ArrayList<String> studentActual = addStudentPage.getStudActual();
        Assert.assertEquals(studentActual, studentExpected);
        application.quit();
    }

    @Test(priority = 5, dataProvider = "getApplicationSources")
    public void editNewStudent(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        addStudentPage.clickEditBtnNewStudent();
        ArrayList<String> studentExpected = addStudentPage.editStudent();

        addStudentPage.getSubmitBtn().click();
        ArrayList<String> studentActual = addStudentPage.getStudActual();
        Assert.assertEquals(studentActual, studentExpected);
        application.quit();
    }

    @Test(priority = 6, dataProvider = "getApplicationSources")
    public void deleteNewStudent(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);

        int firstCountTr = addStudentPage.getTrCount();
        addStudentPage.clickDeleteBtnNewStudent();
        int afterCountTr = addStudentPage.getTrCount();

        Assert.assertNotEquals(firstCountTr, afterCountTr);
        application.quit();
    }
}
