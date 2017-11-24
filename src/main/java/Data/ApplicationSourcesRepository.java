package Data;

public final class ApplicationSourcesRepository {

    private ApplicationSourcesRepository(String s) {
    }

    public static String getAdminPage() {
        return  "http://localhost:3000/admin";
    }

    public static ApplicationSources getFirefoxHerokuApplication() {
        return new ApplicationSources("firefox", "resources/geckodriver.exe",
                "http://localhost:3000",
                5L);
    }

    public static ApplicationSources getChromeHerokuApplication() {
        return new ApplicationSources("chrome",
                "resources/chromedriver.exe",
                "http://localhost:3000",
                5L);
    }

}
