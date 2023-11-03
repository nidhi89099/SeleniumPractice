package assignments;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class UI_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("abc");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("889900");
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select option = new Select(dropdown);
		option.selectByIndex(1);
		System.out.println(option.getFirstSelectedOption().getText());
	    driver.findElement(By.cssSelector("#inlineRadio1")).click();
	    driver.findElement(By.name("bday")).sendKeys("05/05/1985");
	    driver.findElement(By.cssSelector(".btn.btn-success")).click();
	    System.out.println(driver.findElement(By.className("alert")).getText());
	    
	    
	}

}
