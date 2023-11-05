package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class end2end {

	public static void main(String[] args) throws InterruptedException { //CTRl+shift+F->for formatting the code
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click(); // click on one way trip
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // select countries
		driver.findElement(By.xpath("//a[@ value=\"DED\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@ value=\"DEL\"])[2]")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		// select calander
		driver.findElement(By.className("ui-state-highlight")).click();
		/*
		 * driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		 * if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
		 * System.out.println("Is enabled");
		 * 
		 * } else System.out.println("Is not enabled");
		 */
		// Select passengers
		driver.findElement(By.id("divpaxinfo")).click(); // click on passanger dropdown
		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();// click on adult add button

		}
		Thread.sleep(2000);
		/*
		 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click();//click
		 * on adult add button i++; }
		 */

		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("btnclosepaxoption")).click();// click on done button

		// Select currency
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("USD");
		// click on search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
