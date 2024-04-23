package com.allianz.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ZDemoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("src/test/resources/testData/hrm_Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("invalidLoginTest");
		
		Object[][] data=new Object[2][3];

		for(int i = 1;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
         		System.out.println(stringCellValue);
			//	System.out.println(data[i][j]);
				
			}
		
		//	https://onedrive.live.com/?authkey=%21AA%5FuOHdT7R9NvYY&id=F038996AB5C77A63%212941&cid=F038996AB5C77A63
			
		}

		
		
	}

}
