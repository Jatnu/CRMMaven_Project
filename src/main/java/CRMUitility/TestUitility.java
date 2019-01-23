package CRMUitility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.CRMBase;


public class TestUitility extends CRMBase {
	
	
	
//	public static XSSFWorkbook Wb;
//	public static XSSFSheet Sheet1;
//	public static String ExcelSheetPath = "D:\\Work\\Selenium\\CRM_Maven_POM\\src\\main\\java\\CRMTestData\\CRMTestData.xlsx";
	
	// Swtich to frame common function
	
	public static void switchtoframe() {
		
		driver.switchTo().frame("mainpanel");
		
	}
	
	
	public static void  Explicitewait(WebDriver driver ,int Time, WebElement element) {
		 
		 new WebDriverWait(driver,Time).until(ExpectedConditions.visibilityOf(element));
		   System.out.println("Navigated to Analyst portal");

}
}
