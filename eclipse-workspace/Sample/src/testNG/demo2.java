package testNG;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo2 {
	@Parameters({"URL","API Key/username"})
	@Test(groups = { "smoke" })
	public void test4(String URL,String Key) {

		System.out.println("demo2");
		System.out.println(URL);
		System.out.println();

	}

	@BeforeTest
	public void test5() {

		System.out.println("I am before test");
	}

	@Test(priority = 2)
	private void Atest6() {
		System.out.println("Welcome1");

	}

	@Test(priority = 1)
	private void Wtest7() {
		System.out.println("Welcome3");

	}

	@Test(dependsOnMethods = { "Login" })
	private void test8() {
		System.out.println("Welcome3");
	}

	@Test(timeOut=4000)// if test is taking lots of time than other we can add time out
	private void Login() {
		System.out.println("login");

	}

	@Test(enabled=false)//if we dont want to execute this test case
	private void Logindetails() {
		System.out.println("logindetails");
		

	}
	


@Test
private void Atest11() {
	System.out.println("Welcome1");
	Assert.assertTrue(false);
}
}