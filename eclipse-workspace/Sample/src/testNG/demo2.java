package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
	@Test(groups= {"smoke"})
	public void test4() {

		System.out.println("demo2");

	}

	@BeforeTest
	public void test5() {

		System.out.println("I am before test");
	}


@Test(priority=2)
private void Atest6() {
	System.out.println("Welcome1");

}


@Test(priority=1)
private void Wtest7() {
	System.out.println("Welcome3");

}

@Test(dependsOnMethods= {"Login"})
private void test8() {
	System.out.println("Welcome3");

}


@Test
private void Login() {
	System.out.println("login");

}
}
