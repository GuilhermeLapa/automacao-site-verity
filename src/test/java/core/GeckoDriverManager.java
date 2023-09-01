package core;

import org.openqa.selenium.firefox.FirefoxOptions;

public class GeckoDriverManager extends WebDriverManager {
	public static FirefoxOptions criarDriver() {
		FirefoxOptions options= new FirefoxOptions();
		options.addArguments("--disable-extensions");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
		return options;
	}
}
