package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelData {

	public static void main(String[] args) throws IOException {
		String path="F:\\Eclipse\\DataDrivenTesting\\TestData\\TestData (7).xlsx";
		File fil=new File(path);
		
		FileInputStream fls=new FileInputStream(fil);
		Workbook book =new XSSFWorkbook(fls);
		Sheet sheet=book.getSheet("RegisterData");
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
		
		
		for (int k = 0; k<data.length-1; k++)
		{
			for (int l = 0; l<data[k].length; l++) 
			{
				System.out.print(data[k][l]+"   ");
				
			}
			System.out.println();
		}
		
		
		book.close();
		

	}

}
