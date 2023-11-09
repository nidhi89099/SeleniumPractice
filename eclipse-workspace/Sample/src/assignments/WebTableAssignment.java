package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("th")).size());
	List<WebElement> secondrow	=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	//System.out.println(secondrow.get(0).getText());
	//System.out.println(secondrow.get(1).getText());
	for(int i=0;i<secondrow.size();i++)
	{
		System.out.println(secondrow.get(i).getText());
	}

}
}