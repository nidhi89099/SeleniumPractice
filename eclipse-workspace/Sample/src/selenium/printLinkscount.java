package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printLinkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size()); // print the links on the whole page
		
		
		WebElement footlinks = driver.findElement(By.id("gf-BIG"));// Limits the scope of webdriver
		System.out.println(footlinks.findElements(By.tagName("a")).size());// print footer section links
		
		WebElement coloumnLinks = driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		System.out.println(coloumnLinks.findElements(By.tagName("a")).size());// print colomn section links

	}

}
