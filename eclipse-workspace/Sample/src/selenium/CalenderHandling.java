package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).submit();
		List<WebElement> dates = driver.findElements(By.className("flatpickr"));
		int count = driver.findElements(By.className("flatpickr")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("flatpickr")).get(i).getText();

			if (text.equalsIgnoreCase("21")) {
				driver.findElements(By.className("flatpickr")).get(i).click();
				break;
			}
		}

	}

}
