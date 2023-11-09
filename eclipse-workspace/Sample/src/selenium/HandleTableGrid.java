package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleTableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// scrolling windows scroll Bar
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		// Scroll table scrollbar
		js.executeScript("document.querySelector(\'.tableFixHead\').scrollTop=5000");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));//handling table 
		int sum = 0;
		for (int i = 0; i < values.size(); i++) {
			sum = sum + (Integer.parseInt(values.get(i).getText())); //converting string to integer

		}
		System.out.println(sum);
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println(total);

		Assert.assertEquals(sum, total);
		System.out.println("test is passed");

	}

}
