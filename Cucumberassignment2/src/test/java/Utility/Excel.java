package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	XSSFWorkbook wb;
	public Excel() {
		
		File src=new File("C:\\Users\\admin\\eclipse-workspace\\Cucumberassignment2\\TestData\\Data1.xlsx");
		
		try {
			
		FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read excel file"+e.getMessage());
		}
		
	}
	
	public String getStringData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(int sheetIndex,int row,int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumberData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}


}
