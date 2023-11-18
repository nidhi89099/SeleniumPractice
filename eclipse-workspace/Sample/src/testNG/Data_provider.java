package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	@Test(dataProvider = "getdata")
	public void login(String userName, String password) {

		System.out.println(userName);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2]; //[3]-how many time u want to pass the data,[2]how many rows or columns u want pass the data
		data[0][0] = "firstusername";
		data[0][1] = "1password";

		data[1][0] = "secondname";
		data[1][1] = "2password";

		data[2][0] = "thirdname";
		data[2][1] = "3password";
		return data;

	}

}
