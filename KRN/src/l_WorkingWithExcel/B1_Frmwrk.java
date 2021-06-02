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

public class B1_Frmwrk {
	
	public String fr(String Sheetname, int Rownum, int Cellnum) {
		String ret=null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\KRN\\src\\l_WorkingWithExcel\\eclipsetstexcel.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(Sheetname);
			Row r=sh.getRow(Rownum);
			Cell c=r.getCell(Cellnum);
			ret=c.getStringCellValue();
			
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
		return ret;		
	}
	
	
	public int lstRw(String sheetNm) {//to use this in for loop(finding how many times for loop should iterate to run the test on all data sets
		int ret=0;
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\KRN\\src\\l_WorkingWithExcel\\eclipsetstexcel.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetNm);
			ret=s.getLastRowNum();
			
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
		return ret;
		
	}

}
