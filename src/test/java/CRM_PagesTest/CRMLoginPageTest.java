package CRM_PagesTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.CRMBase;
import CRMPages.CRMHomePage;
import CRMPages.CRMLoginPage;

public class CRMLoginPageTest extends CRMBase {

	CRMLoginPage login;
	CRMHomePage home;

	public CRMLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void loginpagetest() {

		Initialization();

		login = new CRMLoginPage();

	}

	@Test(priority = 0)
	public void CRMLogintest() {
		String ActulTitle = login.loginCRMPageTitle();

		Assert.assertEquals(ActulTitle, "Free CRM software in the cloud powers sales and customer service",
				"Title doesnot match");
	}

	@Test(priority = 1)
	public void CRMLogin() {

		home = login.loginCRM();
	    
		System.out.println("Login is done sucessfully");

	}

	@AfterMethod
	public void clean() {
		driver.quit();

	}
}
