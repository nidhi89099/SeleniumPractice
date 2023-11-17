package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
public class demo1 {
	@Test
	private void test1() {
		System.out.println("hello testNG");

	}

	@Test
	private void test2() {
		System.out.println("Welcome");

	}

	@Test(groups= {"smoke"})
	private void test3() {

		System.out.println("Thank you");

	}

	@AfterTest
	private void test5() {
		System.out.println("i am executing after test");
	}
	
	@BeforeMethod
	private void BftestMethod()
	{
		System.out.println("i am executing before everry test method");
		
	}

	@AfterMethod
	private void AftertestMethod()
	{
		System.out.println("i am executing after everry test method");
		
	}
	
	@AfterSuite
	private void AfterSuite()
	{
		System.out.println("i am executing after everry Suite ");
		
	}
	@BeforeSuite
	private void BeforeSuite()
	{
		System.out.println("i am executing Before every test suite");
		
	}

}

