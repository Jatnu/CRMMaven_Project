package CRM_PagesTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePackage.CRMBase;
import CRMPages.CRMHomePage;
import CRMPages.CRMLoginPage;
import CRMPages.CRMNewContactsPage;
import CRMUitility.Readingexcelprogram;
import CRMUitility.TestUitility;

public class CRMNewContactPageTest extends CRMBase {

	CRMLoginPage login;
	CRMHomePage homepage;
	//TestUitility utility;
	CRMNewContactsPage newcontact;

	CRMNewContactPageTest() {

		super();
	}

	@BeforeMethod()
	public void setup() {
		Initialization();
		login = new CRMLoginPage();
		homepage = new CRMHomePage();
		//utility = new TestUitility();
		newcontact = new CRMNewContactsPage();
		homepage = login.loginCRM();
		TestUitility.switchtoframe();
		// newcontact = homepage.ContactsPagenavigation();

	}

	@Test(priority = 0, dataProvider = "CRMNewContactData")
	public void validateCreateNewContact(String title, String firstname, String lastname, String company,
			String nickname) {
		homepage.ContactsPagenavigation();
		newcontact.NewContactCreate(title, firstname, lastname, company, nickname);

	}
	
	
	
	@Test(priority = 1)
	public void dummytest() {
		System.out.println("This is a dummy test block");
	}

	@DataProvider(parallel=true)
	public Object[][] CRMNewContactData() {
		Object data[][] = Readingexcelprogram
				.CRMDataReader("C:\\data D drive\\Work\\Selenium\\CRM_Maven_POM\\src\\main\\java\\CRMTestData\\CRMTestData.xlsx");

		return data;
	}

	@AfterMethod
	public void clean() {
		driver.quit();

	}

}
