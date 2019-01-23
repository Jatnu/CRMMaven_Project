package CRM_PagesTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.CRMBase;
import CRMPages.CRMHomePage;
import CRMPages.CRMLoginPage;
import CRMUitility.TestUitility;

public class CRMHomePageTest extends CRMBase {
	CRMLoginPage login;
	CRMHomePage homepage;
	//TestUitility utility;

	public CRMHomePageTest() {
		super();

	}

	@BeforeMethod
	public void login() {

		Initialization();

		login = new CRMLoginPage();
		homepage = login.loginCRM();
		//utility = new TestUitility();

	}

	@Test(priority=0 ,enabled=false)
	public void VerifyHomepageTitleTest() {
		String acttitle = homepage.HomepageTitle();
		AssertJUnit.assertEquals("Home page title not matched", "CRMPRO", acttitle);

	}
	
	@Test(priority=1)
	
	public void VerifylinksTest() {
		driver.switchTo().frame("mainpanel");
		homepage.Brokenlink();
		
	}

	@Test(priority=2)
	public void ContactsPagenavigationtest() {
		TestUitility.switchtoframe();
		homepage.ContactsPagenavigation();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@AfterMethod
	public void clean() {
		driver.quit();
	}
}