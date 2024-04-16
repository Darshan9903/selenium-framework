package com.allianz.utils;

import org.testng.annotations.DataProvider;

public class Data_Provider {

	@DataProvider
	public Object[][] data() {
		Object[][] dataSet = new Object[2][3];
		dataSet[0][0] = "john";
		dataSet[0][1] = "john123";
		dataSet[0][2] = "Invalid credentials";

		dataSet[1][0] = "poul";
		dataSet[1][1] = "poul123";
		dataSet[1][2] = "Invalid credentials";

		return dataSet;
	}

}
