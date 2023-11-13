package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a=new SoftAssert(); // execute the script even if there is the  failour
		//Checking only one link
		/*
		String	link=driver.findElement(By.linkText("SoapUI")).getAttribute("href");
		HttpURLConnection conn=(HttpURLConnection)new URL(link).openConnection();//call openconnection method of URL class
		conn.setRequestMethod("HEAD"); //set the method in URL(put,post,head,delete)
		conn.connect();// open the request
	int responseCode=conn.getResponseCode();
	System.out.println(responseCode);
	*/
		//Check Multiple Links
		List<WebElement>links=driver.findElements(By.cssSelector("li[class='gf-li']  a")); // to get all the links
		for(WebElement link:links)
		{
			String urls=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(urls).openConnection();//call openconnection method of URL class
			conn.setRequestMethod("HEAD"); //set the method in URL(put,post,head,delete)
			conn.connect();// open the request
		int responseCode=conn.getResponseCode();
		System.out.println(responseCode);
		a.assertTrue(responseCode<400,"Thelink with text"+link.getText()+"is broken with code"+responseCode);
		/*
		if(responseCode>400)
		{
			System.out.println("Thelink with text"+link.getText()+"is broken with code"+responseCode);
			Assert.assertTrue(false);
			
		}
		*/
			
		}
		a.assertAll();
		
		
		
		

	}

}
