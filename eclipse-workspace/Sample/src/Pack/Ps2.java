package Pack;

public class Ps2 extends Ps3 {
	int a; // This is class variable

	public Ps2(int a) { // this is instance variable
		super(a);		//parent class constructor is invoked
		this.a = a; // we assigning instance variable to class variable bu using this word
	}

	public int Increment() {
		a = a + 1;
		return a;
	}

	public int Decrement() {
		a = a - 1;
		return a;

	}
}
