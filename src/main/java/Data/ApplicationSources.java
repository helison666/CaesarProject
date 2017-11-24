package Data;

public class ApplicationSources {

	// Browser Data
	private String browserName;
	private String driverPath;
	private long implicitTimeOut;
	private String loginUrl;
//	private String logoutUrl;
	// Connect to DB

	public ApplicationSources(String browserName, String driverPath,
							   String loginUrl, long implicitTimeOut) {
		this.browserName = browserName;
		this.driverPath = driverPath;
		this.loginUrl = loginUrl;
//		this.logoutUrl = logoutUrl;
		this.implicitTimeOut = implicitTimeOut;
	}

	public ApplicationSources(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getBrowserName() {
		return browserName;
	}

	public String getDriverPath() {
		return driverPath;
	}

	public long getImplicitTimeOut() {
		return implicitTimeOut;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

//	public String getLogoutUrl() {
//		return logoutUrl;
//	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public void setDriverPath(String driverPath) {
		this.driverPath = driverPath;
	}

	public void setImplicitTimeOut(long implicitTimeOut) {
		this.implicitTimeOut = implicitTimeOut;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

//	public void setLogoutUrl(String logoutUrl) {
//		this.logoutUrl = logoutUrl;
//	}

}
