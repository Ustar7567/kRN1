package l_WorkingWithExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A_Basic {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\KRN\\src\\l_WorkingWithExcel\\eclipsetstexcel.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");
			Row r=sh.getRow(0);
			Cell c=r.getCell(0);
			String st=c.getStringCellValue();
			System.out.println(st);
			Cell c1=r.getCell(1);
			String st1=c1.getStringCellValue();
			System.out.println(st1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
