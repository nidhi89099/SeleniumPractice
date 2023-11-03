package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		driver.findElement(By.cssSelector("input[value='option1'] ")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1'] ")).isSelected(),"Selected");
		driver.findElement(By.cssSelector("input[value='option1'] ")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1'] ")).isSelected(),"Selected");
		
		//How to get the Count of number of check boxes present in the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		
	}

}
