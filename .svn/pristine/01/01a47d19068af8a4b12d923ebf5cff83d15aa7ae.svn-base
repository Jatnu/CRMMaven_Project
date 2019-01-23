package CRMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.CRMBase;

public class CRMNewContactsPage extends CRMBase{
	
	 
	@FindBy(xpath="//*[@name='title']") WebElement Title;
	
	@FindBy(xpath="//*[@name='first_name']") WebElement FirstName;
	
	@FindBy(xpath="//*[@name='surname']") WebElement LastName;
	
	@FindBy(xpath="//*[@name='client_lookup']") WebElement CompanyName;
		
	@FindBy(xpath="//*[@name='nickname']") WebElement NickName;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']") WebElement Save;
	

	
	public CRMNewContactsPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void NewContactCreate(String title,String firstname,String lastname,String companyname,String nickname) {
		Title.sendKeys(title);
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		CompanyName.sendKeys(companyname);
		NickName.sendKeys(nickname);		
		Save.click();
	}
	
	
	
}
