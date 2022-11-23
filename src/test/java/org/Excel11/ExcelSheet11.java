package org.Excel11;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelSheet11 {
	public static void creteexcelsheet(int cr, int cc, String data) throws IOException {
		File f = new File("E:\\Maven Program\\ExcelSheet11\\ExcelSheet\\Student.xlxs");
		Workbook wb = new XSSFWorkbook();
		Sheet s = wb.createSheet("StudentList");
		Row r = s.createRow(cr);
		Cell c = r.createCell(cc);
		c.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Writed...");
	}

	public static void createrow(int gr, int cc, String data) throws IOException {
		File f = new File("E:\\Maven Program\\ExcelSheet11\\ExcelSheet\\Student.xlxs");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("StudentList");
		Row r = s.getRow(gr);
		Cell c = r.createCell(cc);
		c.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Writed...");
	}

	public static void createcell(int cr, int cc, String data) throws IOException {
		File f = new File("E:\\Maven Program\\ExcelSheet11\\ExcelSheet\\Student.xlxs");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("StudentList");
		Row r = s.createRow(cr);
		Cell c = r.createCell(cc);
		c.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Writed...");

	}
}
