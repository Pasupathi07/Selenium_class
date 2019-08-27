package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		// to get row count
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		// to get a number of actual rows in excel
		System.out.println(sheet.getPhysicalNumberOfRows());
		// to get coulmn count
		short cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		//to get all values
		Object [][] data = new Object[rowNum][cellNum];
		for (int j = 1; j <=rowNum; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < cellNum; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				System.out.println(value);
				data [j-1][i] = data;
			} 
		}

	}

}
