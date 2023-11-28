package com.saucedemo.generics;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel 
{
static FileInputStream f;
static Workbook wb;
static org.apache.poi.ss.usermodel.Sheet sh;
static Row r;
static Cell c;
public static void openExcel() 
{
	try {
		wb=WorkbookFactory.create(new FileInputStream(Utility.excelpath));
		
	} catch (Exception e) {
		
	}
}
 	public static void indentifySheet(String sheetname) 
 	{
 		sh=wb.getSheet(sheetname);
 	}

 	public static int identifyRowCount() 
{
	
	 return sh.getLastRowNum();
}
	public static void identifyRow(int rownum) 
	
	{
		r=sh.getRow(rownum);
	} 

	public static int identifyCellCount() 
	{
		return r.getLastCellNum();
		
	}
	public static void identifyCell(int cellnum) 
	{
		c=r.getCell(cellnum);
		
		
	}
	public static String identifyCellData() 
	{
		return c.toString();
	} 


}
