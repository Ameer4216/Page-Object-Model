package com.pom.TestBase;

import org.testng.annotations.DataProvider;

import com.pom.TestUtility.ExcelHelper;

public class DataGenarator {
	@DataProvider(name = "qadata")
	public String[][] qaData() {
		ExcelHelper excel = new ExcelHelper(Constants.excelPath,"Sheet1");
		int rowSize = excel.findRowSize();
		int cellSize = excel.findCellSize();
		return excel.findValues(rowSize, cellSize);
	}
}