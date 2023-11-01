package selenium;
import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LocatorsTools {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Implicit wait,wait for something to show up
		//Implicit wait,wait for the given time to load the element,if the element is loaded before given time it moves to another element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// it will apply to all steps
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Nidhi");
		driver.findElement(By.name("inputPassword")).sendKeys("nidhi123");
		//Thread.sleep(1000);// give when element is not stable
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("abc");
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("abc");// CssSelector with Index value
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9799988090");  //Xpath with tagname
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();//tagname.className
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("nidhi");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		
		
		//driver.close();
		


	}

}
