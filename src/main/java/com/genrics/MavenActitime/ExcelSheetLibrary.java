package com.genrics.MavenActitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetLibrary implements AutoConstant
{

	public static String getCellValue(String path, String sheet, int row, int cell) throws IOException {
		
		FileInputStream fis=new FileInputStream(ExcelSheet);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String CellValue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return CellValue;
	}
}
