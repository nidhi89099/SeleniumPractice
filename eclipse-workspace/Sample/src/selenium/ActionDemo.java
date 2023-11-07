package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// mouse hov
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.co.uk/");

		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@id='vl-flyout-nav']/ul[1]/li[3]/a[1]"));
		a.moveToElement(move).contextClick().build().perform();// mouse hover/right click
		// double click,type in capital letters
		a.moveToElement(driver.findElement(By.id("gh-ac"))).click().keyDown(Keys.SHIFT).sendKeys("diwali items").doubleClick().build().perform();

	}

}
