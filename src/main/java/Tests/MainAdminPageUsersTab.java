package Tests;


import Data.*;
import Pages.AddUserPage;
import Pages.LoginPage;
import Pages.MainAdminPage;
import Pages.UsersTab;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class MainAdminPageUsersTab {



    @DataProvider
    public Object[][] getApplicationSources() {
        return new Object[][] {
              /*  { ApplicationSourcesRepository.getFirefoxHerokuApplication(),
                        UserRepository.get().getLogin(),
                },*/

                { ApplicationSourcesRepository.getChromeHerokuApplication(),
                        UserRepository.get().getLogin(),

                },
        };
    }

    @DataProvider
    public Object[][] getApplicationSources2() {
        return new Object[][] {
               /* { ApplicationSourcesRepository.getFirefoxHerokuApplication(),
                        UserRepository.get().getLogin(),
                        UserRepository.get().getUser1(),},*/

                { ApplicationSourcesRepository.getChromeHerokuApplication(),
                        UserRepository.get().getLogin(),
                        UserRepository.get().getUser1(),
                },
        };
    }

    @DataProvider
    public Object[][] getApplicationSources3() {
        return new Object[][] {
                /*{ ApplicationSourcesRepository.getFirefoxHerokuApplication(),
                        UserRepository.get().getLogin(),
                        UserRepository.get().getUser2(),},*/

                { ApplicationSourcesRepository.getChromeHerokuApplication(),
                        UserRepository.get().getLogin(),
                        UserRepository.get().getUser2(),
                },
        };
    }



    @Test(dataProvider = "getApplicationSources")
	public void checkLabels(ApplicationSources applicationSources, IUser adminUser) throws Exception {
		// Precondition

        SoftAssert softAssert = new SoftAssert();
    	Application application = Application.get(applicationSources);
    	//
		// Steps
    	LoginPage loginPage = application.load();

        loginPage.successAdminLogin(adminUser);
        application.loadAdminPage();

        UsersTab usersTab = new UsersTab(application.getDriver());

        softAssert.assertEquals(usersTab.getTextHeaderFirstName(),"firstName");
        softAssert.assertEquals(usersTab.getTextHeaderLastName(),"lastName");
        softAssert.assertEquals(usersTab.getTextHeaderRole(),"role");
        softAssert.assertEquals(usersTab.getTextHeaderLocation(),"location");
        softAssert.assertEquals(usersTab.getTextHeaderPhoto(),"photo");
        softAssert.assertEquals(usersTab.getTextHeaderLogin(),"login");
        softAssert.assertEquals(usersTab.getTextHeaderPassword(),"password");
        softAssert.assertEquals(usersTab.getTextHeaderActions(),"actions");
        softAssert.assertAll();
        application.quit();

	}

    @Test(dataProvider = "getApplicationSources")
    public void checkHeaderUsersTab(ApplicationSources applicationSources, IUser adminUser) throws Exception {
        // Precondition

        Application application = Application.get(applicationSources);
        //
        // Steps
        LoginPage loginPage = application.load();

        MainAdminPage adminHomePage = loginPage.successAdminLogin(adminUser);
        application.loadAdminPage();
        adminHomePage.clickAddUser();

        AddUserPage usersTab = new AddUserPage(application.getDriver());

        assertEquals(usersTab.getHeaderText(),"Create/Edit users");


        application.quit();

    }

    @Test(dataProvider = "getApplicationSources2")
    public void createUser(ApplicationSources applicationSources, IUser adminUser, IUser newUser) throws Exception {
        SoftAssert softAssert = new SoftAssert();
        // Precondition

        Application application = Application.get(applicationSources);
        //
        // Steps
        LoginPage loginPage = application.load();

        MainAdminPage adminHomePage = loginPage.successAdminLogin(adminUser);
        Thread.sleep(1000);
        application.loadAdminPage();

        adminHomePage.clickAddUser();

        UsersTab usersTab = new UsersTab(application.getDriver());
        AddUserPage addUser = new AddUserPage(application.getDriver());
        addUser.addUser(newUser);
        addUser.clickSubmitBtn();

        int i = usersTab.getCountOfUsers();
        softAssert.assertEquals(newUser.getFirstname(),usersTab.getUserFirstNameText(i));
        softAssert.assertEquals(newUser.getLastname() ,usersTab.getUserLastNameText(i));
        softAssert.assertEquals(newUser.getRole()     ,usersTab.getUserRoleText(i));
        softAssert.assertEquals(newUser.getLocation() ,usersTab.getUserLocationText(i));
        softAssert.assertEquals(newUser.getPhoto()    ,usersTab.getUserPhotoText(i));
        softAssert.assertEquals(newUser.getLogin()    ,usersTab.getUserLoginText(i));
        softAssert.assertEquals(newUser.getPassword() ,usersTab.getUserPasswordText(i));

        softAssert.assertAll();
        System.out.println(i);
        application.quit();

    }

    @Test(dataProvider = "getApplicationSources3")
    public void editLastUser(ApplicationSources applicationSources, IUser adminUser, IUser newUser) throws Exception {
        SoftAssert softAssert = new SoftAssert();
        // Precondition

        Application application = Application.get(applicationSources);
        //
        // Steps
        LoginPage loginPage = application.load();

        MainAdminPage adminHomePage = loginPage.successAdminLogin(adminUser);
        Thread.sleep(1000);
        application.loadAdminPage();


        UsersTab usersTab = new UsersTab(application.getDriver());
        int i = usersTab.getCountOfUsers();
        usersTab.clickEditButton(i);
        AddUserPage addUser = new AddUserPage(application.getDriver());
        addUser.clearFields(newUser);
        addUser.addUser(newUser);
        addUser.clickSubmitBtn();

        softAssert.assertEquals(newUser.getFirstname(),usersTab.getUserFirstNameText(i));
        softAssert.assertEquals(newUser.getLastname() ,usersTab.getUserLastNameText(i));
        softAssert.assertEquals(newUser.getRole()     ,usersTab.getUserRoleText(i));
        softAssert.assertEquals(newUser.getLocation() ,usersTab.getUserLocationText(i));
        softAssert.assertEquals(newUser.getPhoto()    ,usersTab.getUserPhotoText(i));
        softAssert.assertEquals(newUser.getLogin()    ,usersTab.getUserLoginText(i));
        softAssert.assertEquals(newUser.getPassword() ,usersTab.getUserPasswordText(i));

        softAssert.assertAll();
        application.quit();

    }

    @Test(dataProvider = "getApplicationSources")
    public void deleteLastUser(ApplicationSources applicationSources, IUser adminUser) throws Exception {
//        SoftAssert softAssert = new SoftAssert();
        // Precondition

        Application application = Application.get(applicationSources);
        //
        // Steps
        LoginPage loginPage = application.load();

        MainAdminPage adminHomePage = loginPage.successAdminLogin(adminUser);
        Thread.sleep(1000);
        application.loadAdminPage();


        UsersTab usersTab = new UsersTab(application.getDriver());
        int i = usersTab.getCountOfUsers();
        usersTab.clickDeleteButton(i);


//        softAssert.assertAll();
        application.quit();

    }





}
