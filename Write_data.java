package selenium_yuva;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	
	public static void to_Write_Data() throws Throwable {
		File sd = new File("C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\Book1.xlsx");
		FileInputStream input = new FileInputStream(sd);
		XSSFWorkbook bb = new XSSFWorkbook(input);
		bb.createSheet("course").createRow(0).createCell(0).setCellValue("Data Insert");
		bb.createSheet("course").createRow(0).createCell(1).setCellValue("Load");
		FileOutputStream output = new FileOutputStream(sd);
		bb.write(output);
		bb.close();
		
	}
	public static void main (String[] args) throws Throwable {
		to_Write_Data();
		
	}

}
