package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.get("https://courses.rahulshettyacademy.com/courses");
		// WebElement courseName =driver.findElement(By.cssSelector("[title='Core Java
		// for Automation Testers + Interview Programs']"));
		String courseName = driver
				.findElement(By.xpath("//div[@title='Core Java for Automation Testers + Interview Programs']"))
				.getText();
		System.out.println(courseName);
		driver.switchTo().window(parentId);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		// get screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("name.png"));

		// get height and width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

		driver.quit();
	}

}
