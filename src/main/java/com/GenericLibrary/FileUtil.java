package com.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.stream.IntStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtil {
	public String readDataFromPropertyFile(String path,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}

	  public String readDataFromExcel(String path, String sheet,int row,int column) throws Throwable, Throwable, IOException
	  {
		  FileInputStream fis=new FileInputStream(path);
		  Workbook wb= WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheet);
		  
		  Row ro = sh.getRow(row);
		 Cell ce = ro.getCell(column);
		 String value = ce.getStringCellValue();
		 return value;
	  }
	  public int getLastRowCount(String sheetName) throws Throwable
	  {
		  FileInputStream fis=new FileInputStream(Constants.excel_path);
		  Workbook wb= WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheetName);
		int lastRowNum = sh.getLastRowNum();
		return lastRowNum;
	  }
  public IntStream randomNumber()
  {
	  Random rn=new Random();
	 IntStream number = rn.ints(1000, 9999);
	 return number;
  }
  public void enterDataInExcelSheet(String path,String sheetname,int row,int cell,String data) throws Throwable
  {
	  FileInputStream fis=new FileInputStream(path);
		 
		//Get the control of the File
		Workbook wb= WorkbookFactory.create(fis);
	
		//Go to the Particular Sheet
		Sheet sh= wb.getSheet(sheetname);
		
		//Go to particular Row
		Row r=sh.getRow(row);
		
		//Prepare the particular Cell
		Cell c=r.createCell(cell);
		
		//Set the cell String Value
		c.setCellValue(data);
		
		//Open the file in Write mode
		FileOutputStream fos= new FileOutputStream(path);
		
		//Save the file
		wb.write(fos);
		//Print a message for our Confirmation
		System.out.println("done writing");
  }
}
