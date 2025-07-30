package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenF {
	
	public static void main(String[] args) throws IOException   {
		
		File loc = new File("src/test/resources/Datadriven/ddriven.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook s = new XSSFWorkbook(stream);
		Sheet sheet = s.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		
		if(data.equals("Ezhilan")) {
			cell.setCellValue("Aadhu");
		}
		FileOutputStream out = new FileOutputStream(loc);
		
			s.write(out);
			System.out.println("result is "+" "+data+" "+"sucess");
		
		}
		
		
	}


