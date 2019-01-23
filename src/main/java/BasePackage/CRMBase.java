package BasePackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CRMUitility.TestUitility;

public class CRMBase {

	public static WebDriver driver;
	public static Properties prop;


	public CRMBase() {
		try {

			prop = new Properties();

			FileInputStream ip = new FileInputStream("C:\\data D drive\\Work\\Selenium\\CRM_Maven_POM\\src"
					+ "\\main\\java\\CRM_Config\\properties\\config.properties");

			prop.load(ip);
		} catch (Exception e) {
			System.out.println("EXCEPTION OCCURRED ");
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public static void Initialization() {
		String browsername = prop.getProperty("Browser");
		if (browsername.equals("Chrome")) {
			System.out.println("Launching CHROME Browser");
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

			driver = new ChromeDriver();

			// input[@id='userNameInput']

		} else if (browsername.equals("Firefox")) {
			System.out.println("Launching FIREFOX Browser");
			System.getProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		// driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(prop.getProperty("URL"));


	

	}

}
