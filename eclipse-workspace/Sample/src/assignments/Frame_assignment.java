package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		WebElement f= driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(f);
		 driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		// driver.findElement(By.name("frame-middle")).click();
		System.out.println( driver.findElement(By.id("content")).getText());
		
		
		
		
		

	}

}
