package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFilePractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\Animal.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");
//		Row r = sh.getRow(3);
//		Cell c = r.getCell(3);
////		String value=c.getStringCellValue();
//		DataFormatter df = new DataFormatter();
//		String value = df.formatCellValue(c);
		ExcelUtility eUtil = new ExcelUtility();
		String value = eUtil.getDataFromExcelFile("Leads", 2, 1);
		String value1 = eUtil.getDataFromExcelFile("Contacts", 5, 1);
		System.out.println(value);
		System.out.println(value1);

	}

}
