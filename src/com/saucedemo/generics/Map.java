package com.saucedemo.generics;

import java.util.HashMap;

public class Map 
{
static HashMap<String, String>m;
public static void readDataTomap(String sheetname) 
{
	m=new HashMap<>();
	excel.openExcel();
	excel.indentifySheet(sheetname);
	int rowcount=excel.identifyRowCount();
	for(int rownum=0;rownum<=rowcount;rownum++)
	{
	excel.identifyRow(rownum);
	excel.identifyCell(0);
	String key=excel.identifyCellData();
	excel.identifyCell(1);
	String value=excel.identifyCellData();
	m.put(key, value);
	}
}
		public static String getDataFromMap(String keyname) 
	{
			return m.get(keyname);
	}


}
