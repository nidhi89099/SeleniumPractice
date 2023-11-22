package e2e;

import static org.testng.Assert.assertListContains;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String productName = "ZARA COAT 3";

		driver.findElement(By.id("userEmail")).sendKeys("sim@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Simple@123#");
		driver.findElement(By.id("login")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod = products.stream()
				.filter(product -> driver.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst()
				.orElse(driver.findElement(By.xpath("(//div[@class='card'])[2]")));
		prod.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[1]//button[2]")).click();

		// click on toast container

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#toast-container"))));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));

		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click(); // click on cart

		// check items are added in the cart
		List<WebElement> productCarts = driver.findElements(By.cssSelector(".cartSection h3"));
		// productCarts.stream().filter(p->p.getText().equalsIgnoreCase(productName));
		boolean match = productCarts.stream().anyMatch(p -> p.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(match);
		driver.findElement(By.cssSelector(".totalRow button")).click();
//not working for dummy website
		// do payment and capture order Id
		//driver.findElement(By.xpath("//div[contains(@class,\"active\")]")).click();
		//driver.findElement(By.cssSelector("input[value='4542 9931 9292 2293']")).clear();
		//driver.findElement(By.cssSelector("input[value='4542 9931 9292 2293']")).sendKeys("1234567890123456");
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("123");
		//driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("S Sims");
		//driver.findElement(By.xpath("(//input[@placeholder='Select Country'])")).sendKeys("indi");
		//WebElement country = driver.findElement(By.xpath("(//input[@placeholder='Select Country'])"));
		 		 
		Actions A= new Actions(driver);
		A.sendKeys(driver.findElement(By.xpath("(//input[@placeholder='Select Country'])")), "india").build().perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(productName)))
				Thread.sleep(3000);
				driver.findElement(By.cssSelector(".ta-item:last-child")).click();
		System.out.println("p");
		driver.findElement(By.cssSelector(".action__submit")).click();
		System.out.println("pas");
		String confirmMessage=driver.findElement(By.cssSelector(".hero-primary")).getText();
		System.out.println("pass");
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		

		System.out.println("passed");
	}
}
