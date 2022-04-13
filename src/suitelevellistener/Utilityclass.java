package suitelevellistener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilityclass {
	static Sheet mysheet;
	public static String getdatafromexel(int getrow,int getcoloumn) throws EncryptedDocumentException, IOException {
		
		FileInputStream obj=new FileInputStream("D:\\SELENIUM\\kitelogindetails.xlsx");
	
	 mysheet = WorkbookFactory.create(obj).getSheet("sheet1");
String value = mysheet.getRow(getrow).getCell(getcoloumn).getStringCellValue();
return value;
	 
	 
	}
	
}
