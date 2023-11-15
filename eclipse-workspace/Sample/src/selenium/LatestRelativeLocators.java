package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;

public class LatestRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println(driver.findElement(with(By.tagName("label")).above(By.name("name"))).getText());
		
		WebElement down=driver.findElement(By.xpath("//label[contains(text(),'Name')]"));
		driver.findElement(with(By.tagName("input")).below(down)).sendKeys("hello");

		WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
		
		WebElement right=driver.findElement(By.id("inlineRadio2"));
		driver.findElement(with(By.tagName("label")).toRightOf(right)).click();

	}

}
