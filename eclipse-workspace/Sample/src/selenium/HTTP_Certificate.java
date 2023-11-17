package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTP_Certificate {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		// FirefoxOptions options1 = new FirefoxOptions();

		// options1.setAcceptInsecureCerts(true);

		// EdgeOptions options2 = new EdgeOptions();

		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());
	}

}
