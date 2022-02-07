package UtilityFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataLibrary {
	public static Object[][] testData(String sheetName) throws IOException
	{
		
	
	String path="F:\\Eclipse\\DataDrivenTesting\\TestData\\Data1.xlsx";
	File fil=new File(path);
	
	FileInputStream fls=new FileInputStream(fil);
	Workbook book =new XSSFWorkbook(fls);
	Sheet sheet=book.getSheet(sheetName);
	int row=sheet.getPhysicalNumberOfRows();
	int cellvalue=sheet.getRow(row-1).getPhysicalNumberOfCells();
	
	Object[][] data=new Object[row-1][cellvalue];
	
	
	for (int i=1;i<=row-1;i++)
	{
		for (int j = 0; j <=cellvalue-1; j++) 
		{
			data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
		}
	}
	book.close();
	return data;
}
}

