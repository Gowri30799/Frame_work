package Genric_script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dtt
{
	public static String get_data(String sh, int r, int c)
	{
		String value="";
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop");
			Workbook book = WorkbookFactory.create(fis);
			Sheet s = book.getSheet(sh);
			Row row = s.getRow(r);
			Cell cell = row.getCell(c);
			value=cell.toString();
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return value;
}
}