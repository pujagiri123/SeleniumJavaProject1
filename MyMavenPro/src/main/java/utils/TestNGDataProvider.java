package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider 
{
	@Test(dataProvider="test1data")
	public void test1(String userName,String password)
	{
		System.out.println(userName+"|"+password);
	}
	@DataProvider(name="test1data")
	public Object[][] getData()
	{
		String excelPath="P:\\selenium-testing\\MyMavenPro\\excel\\data.xlsx";
		Object data[][]=testData(excelPath,"pdata");
		return data;
	}
	public static Object[][] testData(String excelPath,String sheetName)
	{
		ExcelUtil excel=new ExcelUtil(excelPath,sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getColCount();

		Object[][] data=new Object[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++)
			for(int j=0;j<colCount;j++)
			{
				String cellData=excel.getCellDataString(i,j);
				System.out.println(cellData+" | ");
				data[i-1][j]=cellData;
			}
		return data;
	}
}
