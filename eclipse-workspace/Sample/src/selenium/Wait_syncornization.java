package selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_syncornization {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		String[] itemsNeeded1 = { "Cucumber", "Carrot", "Brocolli" };
		driver1.get("https://rahulshettyacademy.com/seleniumPractise/");
		// implicit wait
		// driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// explicit wait
		WebDriverWait w = new WebDriverWait(driver1, Duration.ofSeconds(5));

//		Method_use m= new Method_use();
		// m.shoppingCart(driver1,itemsNeeded1);
		shoppingCart(driver1, itemsNeeded1);
		driver1.findElement(By.cssSelector("a.cart-icon")).click();
		driver1.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
		driver1.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");

		driver1.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Code applied ..!')]")));
		System.out.println(driver1.findElement(By.xpath("//span[contains(text(),'Code applied ..!')]")).getText());

	}

	public static void shoppingCart(WebDriver driver, String[] itemsNeeded) {

		int j = 0;
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println("product size=" + product.size());
		for (int i = 0; i < product.size(); i++) {

			String[] names = product.get(i).getText().split("-");// Cucumber - 1 Kg
			String item = names[0].trim();
			System.out.println("print item" + item);
			// convert array into arraylist for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);
			System.out.println("print neededitems" + itemsNeededList);

			if (itemsNeededList.contains(item)) {
				// click on add to cart
				j++;

				driver.findElements(By.xpath("//div [@ class='product-action' ]/button")).get(i).click();
				System.out.println("added item count " + j);
				if (j == itemsNeeded.length) {
					System.out.println("breaking out of loop");
					break;

				}
			}
		}

	}

}
