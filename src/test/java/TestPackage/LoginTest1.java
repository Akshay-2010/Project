package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BasePackage.LoginPage1;

public class LoginTest1 extends BaseClass {

	
	
	@Test
	public void validateTest1() {
		
		LoginPage1 P1= new LoginPage1(driver);
	
			P1.setButton1();
	
			
			P1.setuName("demo_doc_thirteen@bajajfinserv.in");
	
			P1.setPass("123456");

	P1.setCheckbox();
	P1.setLoginbtn();
	
	
}	
}
		
		
		
		
		

	
	
	
	
	


