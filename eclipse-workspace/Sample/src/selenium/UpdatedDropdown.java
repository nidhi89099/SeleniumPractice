package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click(); // click on passanger dropdown
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		/*
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//click on adult add button
			
		}*/
		//Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//click on adult add button
			i++;
		}
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();// click on done button
		driver.close();

		
		
		

	}

}
