package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsTools2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// it will apply to all steps and wait for element to load
		String name="nidhi";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//log in page
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
				Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//*[text() = 'Log Out'] ")).click();//x-path by text
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
