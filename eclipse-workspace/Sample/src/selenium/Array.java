package selenium;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Cucumber", "Carrot", "Brocolli" };
		int j = 0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);

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
			;
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
