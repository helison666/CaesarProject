package Data;

import Pages.LoginPage;
import Pages.MainAdminPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Application {


	private WebDriver driver;
	private ApplicationSources applicationSources;
	
	private Application(ApplicationSources applicationSources) {
		this.applicationSources = applicationSources;
	}
	
	public static Application get(ApplicationSources applicationSources) {
		Application instance = new Application(applicationSources);
		instance.driver = instance.getWebDriver();
		instance.driver.manage().timeouts()
			.implicitlyWait(applicationSources.getImplicitTimeOut(), TimeUnit.SECONDS);
		// TODO Setting
		return instance;
	}


	public LoginPage load() {
		driver.get(applicationSources.getLoginUrl());
		return new LoginPage(driver);
	}

	public MainAdminPage loadAdminPage() {
		driver.get(ApplicationSourcesRepository.getAdminPage());
		return new MainAdminPage(driver);
	}
	
	public void quit() {
		if (driver != null) {
			driver.quit();
		}
	}

	private WebDriver getWebDriver() {
		if (applicationSources.getBrowserName().toLowerCase().equals("firefox")) {
			return getFirefoxDriver();
		} else if (applicationSources.getBrowserName().toLowerCase().equals("chrome")) {
			return getChromeDriver();
		}
		// Get Default Browser
		return getFirefoxDriver();
	}

	private WebDriver getFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				applicationSources.getDriverPath());
		driver = new FirefoxDriver();
		return driver;
	}
	
	private WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				applicationSources.getDriverPath());
		driver = new ChromeDriver();
		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
