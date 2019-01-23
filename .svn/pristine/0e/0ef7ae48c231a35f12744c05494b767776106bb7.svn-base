package CRMUitility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BasePackage.CRMBase;

public class Readingexcelprogram extends CRMBase  {

	public static XSSFWorkbook Wb;
	public static XSSFSheet sheet1;

	public static Object[][] CRMDataReader(String path) {

		{
			try {
				// Create an object of File class to open xlsx file
				File Scr = new File(path);

				// create an object of FileInputStream Class to read excel file, This will
				// convert our file in bytes and read it

				FileInputStream inputstream = new FileInputStream(Scr);

				Wb = new XSSFWorkbook(inputstream);

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		sheet1 = Wb.getSheetAt(0); // to reach at first tab of our excel sheet

		// int rows = sheet1.getLastRowNum();

		Object[][] data = new Object[sheet1.getLastRowNum()][sheet1.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet1.getLastRowNum(); i++) {
			for (int j = 0; j < sheet1.getRow(0).getLastCellNum(); j++) {

				data[i][j] = sheet1.getRow(i+1).getCell(j).toString();
			}

		}
		return data;

	}
}
