package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
	List<WebElement> options=driver.findElements(By.cssSelector("li [class='ui-corner-all'] "));
	
	for(WebElement option:options)				//enhanced for loop
	{
		if(option.getText().equalsIgnoreCase("India"))
		{
	 option.click();
	break;
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
