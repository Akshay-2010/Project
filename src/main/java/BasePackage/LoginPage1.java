package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage1 extends BaseClass {
	
	WebDriver driver;
	
	
	public LoginPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
		@FindBy(xpath="(//input[@class='jss4'])[2]")	//  by xpath value   //driver.findelement(by.xpath("")).click
		
		WebElement button1;
		

	@FindBy(name="username")	
		WebElement uName;
	

	@FindBy(name="password")	
	WebElement pass;

	@FindBy(xpath="(//input[@class='jss4'])[4]")	
	WebElement checkbox;

	@FindBy(xpath="(//div[text()='Login'])[2]")	
	WebElement loginbtn;

	
	


	public void setButton1() {
			this.button1=button1;
		button1.click();
		}


		public void setuName(String username) {
			//this.uName = uName;
		uName.sendKeys(username);
		}


		public void setPass(String password) {
	pass.sendKeys(password);
		}


		public void setCheckbox() {
			checkbox.click();
		}


		
		
		public void setLoginbtn() {
			
			loginbtn.click();
			
		}

		
		
		
		
		
		
		
		
		
		


}

