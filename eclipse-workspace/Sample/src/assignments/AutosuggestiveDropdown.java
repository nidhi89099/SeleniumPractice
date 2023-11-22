package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestiveDropdown {
	
	private int var1;
	private int var2;

	AutosuggestiveDropdown(){
		var1 = 10;
		var2 = 20;
		System.out.println("Hello !!");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	driver.findElement(By.id("autocomplete")).sendKeys("ind");
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
	System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	
	AutosuggestiveDropdown abcdObject = new AutosuggestiveDropdown();
	//abcdObject.setvariables(10,20);
	System.out.println(abcdObject.var1);
	System.out.println(abcdObject.var2);	
		
	}

	void setvariables(int a, int b) {
		var1 = a;
		var2 = b;		
	}
	/*	
	void add(int a, int b){
	
		System.out.println(var1+var2);
	}	
*/
}