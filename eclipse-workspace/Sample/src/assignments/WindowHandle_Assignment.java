package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Multiple Windows")).click();
		// Switch to child window
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> w = driver.getWindowHandles();
		Iterator<String> it = w.iterator();
		String parentId = it.next();
		String childId = (String) it.next();

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.className("example")).getText());
		// Switch to parent window and print text
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.tagName("h3")).getText());

	}

}
