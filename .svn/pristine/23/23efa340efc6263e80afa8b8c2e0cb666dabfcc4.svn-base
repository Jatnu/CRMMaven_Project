package CRMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.CRMBase;

public class CRMLoginPage extends CRMBase {

	@FindBy(xpath = "//*[@name='username']")
	WebElement Username;

	@FindBy(xpath = "//*[@name='password']")
	WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement login;

	public CRMLoginPage() {

		PageFactory.initElements(driver, this);

	}

	public String loginCRMPageTitle() {
		String acttitle = driver.getTitle();
		return acttitle;

	}

	public CRMHomePage loginCRM() {
		Username.clear();
		Username.sendKeys(prop.getProperty("Username"));
		password.clear();
		password.sendKeys(prop.getProperty("password"));
		login.submit();
		return new CRMHomePage();
	}
}