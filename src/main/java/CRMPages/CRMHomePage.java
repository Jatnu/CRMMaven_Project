package CRMPages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.CRMBase;

public class CRMHomePage extends CRMBase {
	
  @FindBy(xpath ="//*[@title='Contacts']") WebElement Contacts;
  
  @FindBy(xpath="//a[text()='New Contact']") WebElement NewContact;


  
  public CRMHomePage(){
	  PageFactory.initElements(driver, this);
  }

  
  
  
    public String HomepageTitle() {
    	 String acttitle = driver.getTitle();
    	 return acttitle ;
    }
  
  
      
    
    public void Brokenlink() {
    	
    	List<WebElement> links = driver.findElements(By.tagName("a"));
    	  
    	System.out.println("total no. of links are" + links.size());
    	 
    	for(int i=0;i<links.size();i++) {
    		
    		  WebElement ele = links.get(i);
    		  
    		String url= ele.getAttribute("href");
    		
    		verifylinkActive(url);
    		
    	}
    }
     
    
    public void verifylinkActive(String linkURL) {
    	
    	 try {
			URL url = new URL(linkURL);
			
			
			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           	
			 httpURLConnect.setConnectTimeout(3000);
			
			
				httpURLConnect.connect();
				
				if(httpURLConnect.getResponseCode()==200) {
					System.out.println(linkURL+" - " +httpURLConnect.getResponseMessage());
				}
				
				if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
					
					System.out.println(linkURL+ " - "+httpURLConnect.getResponseMessage() + "-"+HttpURLConnection.HTTP_NOT_FOUND);
					
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
    }
    
    
    
    public CRMNewContactsPage ContactsPagenavigation() {
	
	  
  	   Actions action = new Actions(driver);
  	   action.moveToElement(Contacts).build().perform();
  	   
  	   NewContact.click();
  	    
  	   return new CRMNewContactsPage() ;
  	     
  }
	
	
}