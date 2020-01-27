package utils;

public class ExcelDataProvider
{
	public static void main(String args[])
	{
		String excelPath="P:\\selenium-testing\\MyMavenPro\\excel\\data.xlsx";
		testData(excelPath,"pdata");
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