package Pack;

import org.testng.annotations.Test;

public class Ps1 extends Ps {
	int a = 3;

	@Test
	public void test() {
		testrun();
		// default constructor is called when you create a objest of a class,but
		// when you pass a parameter then you explicitly calling a costructor
		Ps2 ps2 = new Ps2(3);

		System.out.println(ps2.Decrement());
		System.out.println(ps2.Increment());

// for example to do multipication you have to create diffrent class and that utilities here
		/*
		 * Ps3 ps3= new Ps3(3); System.out.println(ps3 .Multiplytwo());
		 */
		System.out.println(ps2.Multiplytwo());
	}
}