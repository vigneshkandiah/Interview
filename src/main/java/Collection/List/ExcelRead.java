package Collection.List;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		

		FileInputStream fis= new FileInputStream("./data/.xlsx");
		String[][] data = null ;
		XSSFWorkbook wokbook = new XSSFWorkbook(fis);
		XSSFSheet sheet= wokbook.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		
		short colcount = sheet.getRow(0).getLastCellNum();
		
		
		for (int i = 1; i < rowcount+1; i++) {
			
			
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {
				String cellvalue="";
				cellvalue = row.getCell(j).getStringCellValue();
				
				data[i-1][j]=cellvalue;
				
			}
			
		}
	}
		
	}
//	FileInputStream fis = new FileInputStream("./data/.xlsx");
//	XSSFWorkbook workbook = new XSSFWorkbook(fis);
//	XSSFSheet sheet = workbook.getSheetAt(0);	
//
//	// get the number of rows
//	int rowCount = sheet.getLastRowNum();
//
//	// get the number of columns
//	int columnCount = sheet.getRow(0).getLastCellNum();
//	data = new String[rowCount][columnCount];
//
//	// loop through the rows
//	for(int i=1; i <rowCount+1; i++){
//		 {
//			XSSFRow row = sheet.getRow(i);
//			for(int j=0; j <columnCount; j++){ // loop through the columns
//				 
//					String cellValue = "";
//					
//						cellValue = row.getCell(j).getStringCellValue();
//					
//
//					data[i-1][j]  = cellValue; // add to the data array
//							
//			}
//}
//	}
//}
	
	