package com.allianz.utils;

import java.io.IOException;
import java.lang.reflect.Method;

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
	
	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException{
		
		String currentTestName = mtd.getName();
		return ExcelUtils.getSheetIntoTwoDimensionalArray("src/test/resources/testData/hrm_Data.xlsx", currentTestName);
	}

}
