package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	static String projectPath;
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	public ExcelUtil(String excelPath,String sheetName)
	{
		try{
			projectPath=System.getProperty("user.dir");
			book=new XSSFWorkbook(excelPath);	
			sheet=book.getSheet(sheetName);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRowCount();
		getCellData(1,1);
		getCellDataString(1,0);
	}
	public static int getRowCount()
	{
		int rowCount=0;
		try {

		rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows:"+rowCount);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();	
		}
		return rowCount;
	}
	public static int getColCount()
	{
		int colCount=0;
		try {

			colCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Calls:"+colCount);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();	
		}
		return colCount;
	}
	public static void getCellData(int rowNum,int colNum)
	{
		try {

			double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("No of cells:"+cellData);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();	
		}}
	public static String getCellDataString(int rowNum,int colNum)
	{
		String cellName=null;
		try {

			cellName=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("cell name:"+cellName);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();	
		}
		return cellName;
	}}
