package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavaigations {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/"); // it has in bulit time wait,wait until the page is load
	driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
	Thread.sleep(2000);
	driver.navigate().back();
	driver.navigate().forward();
	
	
	
	

	}

}
