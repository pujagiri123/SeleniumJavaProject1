package utils;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String projectPath=System.getProperty("user.dir");
   ExcelUtil excel=new ExcelUtil(projectPath+"/excel/data.xlsx","pdata");
   
   excel.getRowCount();
   excel.getColCount();
   excel.getCellData(1,1);
   excel.getCellDataString(1,0);
	}

}
