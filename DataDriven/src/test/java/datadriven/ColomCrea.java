package datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ColomCrea {
	
	public static void main(String[] args) throws IOException {
		
		File loc = new File("src/test/resources/Datadriven/ddriven.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("Sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Ezhilan");
		Cell cell2 = row.createCell(1);
		cell2.setCellValue("Aadhu");
		Cell cell3 = row.createCell(2);
		cell3.setCellValue("Kaashwi");
		
		FileOutputStream st = new FileOutputStream(loc);
		w.write(st);
		System.out.println("Colomn created");
		
		
		
		
		
		
	

		
		
		
		
	}

}
