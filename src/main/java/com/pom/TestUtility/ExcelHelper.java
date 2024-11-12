package com.pom.TestUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	File file;
	FileInputStream inputStream;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cells;
	DataFormatter format;
	String stringArray[][];
	int i, j;

	public ExcelHelper(String excelPath, String sheetName) {
	try {
	file = new File(excelPath);
	inputStream = new FileInputStream(file);
	workbook = new XSSFWorkbook(inputStream);
	sheet = workbook.getSheet(sheetName);
	} catch (FileNotFoundException e) {
	e.getMessage();
	} catch (IOException e) {
	e.getMessage();
	}
	}

	public String findValue(int row, int cell) {
	rows = sheet.getRow(row);
	cells = rows.getCell(cell);
	format = new DataFormatter();
	return format.formatCellValue(cells);
	}

	public int findRowSize() {
	return sheet.getPhysicalNumberOfRows();
	}

	public int findCellSize() {
	return sheet.getRow(0).getPhysicalNumberOfCells();
	}

	public String[][] findValues(int rowSize, int columnSize) {

	stringArray = new String[rowSize][columnSize];
	for (int i = 0; i < rowSize; i++) {
	for (int j = 0; j < columnSize; j++) {
	rows = sheet.getRow(i);
	cells = rows.getCell(j);
	format = new DataFormatter();
	stringArray[i][j] = format.formatCellValue(cells);
	}
	}
	return stringArray;
	}
	}


