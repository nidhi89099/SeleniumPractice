package selenium;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		// handling child window
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); // store the window references
		Iterator<String> it = windows.iterator();
		// Iterator is a Interface.Iterators in Java are used in the Collection framework to
		// retrieve elements one by one
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailId);

		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys("mentor@rahulshettyacademy.com");

	}

}
