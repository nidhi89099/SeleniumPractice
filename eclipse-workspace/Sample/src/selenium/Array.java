package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		int j = 0;
		String[] itemsNeeded= {"Cucumber","Carrot"};
	List<WebElement> product =driver.findElements(By.cssSelector("h4.product-name"));
	//List<WebElement> product =driver.findElements(By.tagName("h4"));
	
	for(int i=0;i<product.size();i++)
	{
		String[] names= product.get(i).getText().split("-");//Cucumber - 1 Kg
	String	items= names[0].trim();
		//convert array into arraylist for easy search
		List itemsNeededList =Arrays.asList(itemsNeeded);
		//if(itemsNeededList.contains(items));
		
		
				
	//click on add to cart
	j++;
	driver.findElement(By.xpath("//div [@ class='product-action' ]/button")).click();
	
	if(j==3);
		
	{
		break;}
		}
	}}
	
		
	
	
	
	
