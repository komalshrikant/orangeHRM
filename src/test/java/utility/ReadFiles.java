package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFiles {
	 static String data;
	
	public Static String fetchDataFromExcel(int Row, int cell) throws EncryptedDocumentException, IOException
	{
		String path = "src"+File.separator+"test"+File.separator+"resources"+File.separator+"excel2.xlsx";
		FileInputStream file = new FileInputStream(path);
		Cell c = WorkbookFactory.create(file).getSheet("login").getRow(Row).getCell(cell);
		CellType type=c.getCellType();
		
		if (type==CellType.STRING)
		{
			data = c.getStringCellValue();
		}
		else if(type==CellType.NUMERIC)
		{
			double d=c.getNumericCellValue();  
			data = Double.toString(d);
		}
		else if(type==CellType.BLANK)
		{
			System.out.println("you are trying to get the data from empty cell");
		}
		
		return data;
	}

}
