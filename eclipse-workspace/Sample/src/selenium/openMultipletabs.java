package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openMultipletabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				WebElement coloumnLinks = driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
				System.out.println(coloumnLinks.findElements(By.tagName("a")).size());// print colomn section links
				
				//click on the links and open them in the separate tabs
				for(int i=0;i<coloumnLinks.findElements(By.tagName("a")).size();i++)
				{
				String	clickonLinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
					coloumnLinks.findElements(By.tagName("a")).get(i).sendKeys(clickonLinktab);
					Thread.sleep(5000L);
				}
				
				//gets the title of all the windows
					Set<String>	w=driver.getWindowHandles();
					
					Iterator<String> it= w.iterator();
			
				while(it.hasNext())					//hasNext tells whether the next index present or not
					{
						driver.switchTo().window(it.next());//next actually moves to the next index
						System.out.println(driver.getTitle());
					}
								
					
				}
			
		
						
				

	}


