package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		// driver.switchTo().frame(0);
		// driver.switchTo().frame(null); work when frame id is given
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); // switch to frame
		driver.findElement(By.cssSelector("#draggable")).click(); // click on the box inside the frame
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();// drag and drop the box
		driver.switchTo().defaultContent();

	}

}
