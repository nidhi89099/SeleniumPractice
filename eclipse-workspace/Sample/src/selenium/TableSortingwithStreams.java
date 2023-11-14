package selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSortingwithStreams {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on the table
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// store first row data in a list
		List<WebElement> Flist = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		// capture all text into a list
		List<String> orderedList = Flist.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = orderedList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		// Assert.assertEquals(orderedList, sortedList);
		Assert.assertTrue(orderedList.equals(sortedList));

	}

}
