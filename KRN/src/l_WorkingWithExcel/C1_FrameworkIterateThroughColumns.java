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

public class C1_FrameworkIterateThroughColumns {

	public String excel(String sheetName, int rowNumber, int cellNumber) {

		String ret = null;

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Admin\\Desktop\\gitproj\\kRN1\\KRN\\src\\l_WorkingWithExcel\\ColumnIteration.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r = s.getRow(rowNumber);
			Cell c = r.getCell(cellNumber);
			ret = c.getStringCellValue();

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

	public int lastCell(String sheetForLastCell, int rowNumForLastCell) {
		int ret1 = 0;
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Admin\\Desktop\\Eclipse\\EclipseWrokspace\\prac\\src\\Practice\\prac.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetForLastCell);
			Row r = s.getRow(rowNumForLastCell);
			ret1 = r.getLastCellNum();

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
		return ret1;
	}

}
