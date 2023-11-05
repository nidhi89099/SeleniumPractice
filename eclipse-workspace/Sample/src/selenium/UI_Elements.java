package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UI_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("display: none"));
		
		
		driver.findElement(By.xpath("//label[@class='select-label'][contains(text(),'One Way')]")).click();		//select the current date
driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Is enabled");
			
		}
		else
			System.out.println("Is not enabled");
	}

}
