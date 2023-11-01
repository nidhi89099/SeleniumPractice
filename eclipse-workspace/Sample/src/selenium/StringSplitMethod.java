package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StringSplitMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// it will apply to all steps and wait for element to load
					
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		//driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("nidhi");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahul");
		//driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		//log in page
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//System.out.println((driver.findElement(By.cssSelector("p.infoMsg")).getText()));
		String a=(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		//String a= "Please use temporary password 'rahulshettyacademy' to Login.";
		//String[]password=a.split(" ");
		String[]password=a.split("'");
		
		//System.out.println(password[0]);
		//System.out.println(password[1]);
		//System.out.println(password[2]);
		
		for(int i=0;i<password.length;i++)
		{
			
			System.out.println(password[i]);
		}
		
		
		
		//getPassword(driver);

	}
	
	public static void getPassword(WebDriver driver)
	{
		// split Please use temporary password 'rahulshettyacademy' to Login.
				
		//String[]ArrayPassword=password.split("Please use temporary password 'rahulshettyacademy' to Login");
	
		
		
		
		
		
		
	}

	

}
