package Tests;


import Data.*;
import Pages.LoginPage;
import Pages.MainAdminPage;
import Pages.StudentsPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class StudentsPageTest {

    
    StudentsPage studentsPage;
    Application application;

    public void clickStudentTab(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        application = Application.get(applicationSources);
        //
        // Steps
        LoginPage loginPage = application.load();

        MainAdminPage adminHomePage = loginPage.successAdminLogin(adminUser);
        Thread.sleep(1000);
        application.loadAdminPage();

        studentsPage = new StudentsPage(application.getDriver());
        studentsPage.studentsTabClick();
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

    @Test(dataProvider = "getApplicationSources")
    public void HeadText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "Caesar Admin Panel";
        String actual;
        actual = studentsPage.getHeadingText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void HeaderGroupIdText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "groupId";
        String actual;
        actual = studentsPage.getHeaderGroupIdText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void HeaderNameText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "name";
        String actual;
        actual = studentsPage.getHeaderNameText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void HeaderLastNameText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "lastName";
        String actual;
        actual = studentsPage.getHeaderLastNameText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void HeaderEnglishLvlText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "englishLevel";
        String actual;
        actual = studentsPage.getHeaderEnglishLevelText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void HeaderCvUrlText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "CvUrl";
        String actual;
        actual = studentsPage.getHeaderCvUrlText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void HeaderImageUrlText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "imageUrl";
        String actual;
        actual = studentsPage.getHeaderImageUrlText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void HeaderEntryScoreText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "entryScore";
        String actual;
        actual = studentsPage.getHeaderEntryScoreText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void HeaderApprovedByText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "approvedBy";
        String actual;
        actual = studentsPage.getHeaderApprovedByText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void HeaderActionsText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "actions";
        String actual;
        actual = studentsPage.getHeaderActionsText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

    @Test(dataProvider = "getApplicationSources")
    public void AddStudentBtnText(ApplicationSources applicationSources, IUser adminUser) throws Exception
    {
        clickStudentTab(applicationSources, adminUser);
        String expected = "Add student";
        String actual;
        actual = studentsPage.getAddStudentBtnText();
        Assert.assertEquals(actual, expected);
        application.quit();
    }

}
