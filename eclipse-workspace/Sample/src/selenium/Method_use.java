package selenium;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_use {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver1 = new ChromeDriver();
		String[] itemsNeeded1 = { "Cucumber", "Carrot", "Brocolli" };
		driver1.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
//		Method_use m= new Method_use();
		// m.shoppingCart(driver1,itemsNeeded1);
		shoppingCart(driver1, itemsNeeded1);

	}

	public static void shoppingCart(WebDriver driver, String[] itemsNeeded) {

		int j = 0;
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		// List<WebElement> product =driver.findElements(By.tagName("h4"));
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
