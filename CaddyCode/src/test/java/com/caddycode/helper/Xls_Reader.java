package com.caddycode.helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	
	public  String path;
	public  FileInputStream fis = null;
	public  FileOutputStream fileOut =null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row   =null;
	private XSSFCell cell = null;
	
	
	public Xls_Reader(String path) 
	{
		
		this.path=path;
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	// returns the row count in a sheet
	public int getRowCount(String sheetName)
	{
		  int index = workbook.getSheetIndex(sheetName);
		  if(index==-1)
		   return 0;
		  else{
		  sheet = workbook.getSheetAt(index);
		  int number=sheet.getLastRowNum()+1;
		  return number;
		  }
		  
	}
	// returns number of columns in a sheet	
			public int getColumnCount(String sheetName){

				
				sheet = workbook.getSheet(sheetName);
				row = sheet.getRow(0);
				
				if(row==null)
					return -1;
				
				return row.getLastCellNum();
				
				
				
			}
	
			
			public int getColumnCount(String sheetName,int rowNumber){

				
				sheet = workbook.getSheet(sheetName);
				row = sheet.getRow(rowNumber);
				
				if(row==null)
					return -1;
				
				return row.getLastCellNum();
				
			}
			
			public String getCellData(String sheetnam,int rownum,int colnum){
				String cellval = "";
				try{
					if(rownum<=0)
						return "";
					
					int index=workbook.getSheetIndex(sheetnam);
					if(index==-1)
						return "";
					sheet=workbook.getSheetAt(index);
					row=sheet.getRow(rownum-1);
					if(row==null)
						return "";
					
					cell=row.getCell(colnum);
					if(cell==null)
						return "";
					else
						try {
							cellval =  cell.getStringCellValue();
						}catch(Exception e)
						{
							double number = cell.getNumericCellValue();
							cellval =  String.valueOf(number);
						}
					
				}catch(Exception e){
					
				}
				return cellval;
				
				
			}
	



}
