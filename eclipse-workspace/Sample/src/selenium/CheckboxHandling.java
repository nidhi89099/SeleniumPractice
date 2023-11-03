package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(1000);//assertios are used for validation purpose
		Assert.assertFalse(driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),5); //failed to check
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
		

	}

}
