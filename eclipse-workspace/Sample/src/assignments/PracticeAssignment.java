package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAssignment {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String p2 = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(p2);
		// Select the dropdown
		driver.findElement(By.id("dropdown-class-example")).click();
		Select s1 = new Select(driver.findElement(By.id("dropdown-class-example")));
		s1.selectByVisibleText(p2);
		// enter text in text box
		driver.findElement(By.id("name")).sendKeys(p2);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();

	}

}
