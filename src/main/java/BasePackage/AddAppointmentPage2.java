package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAppointmentPage2 extends BaseClass{

WebDriver driver;
	
	
	public AddAppointmentPage2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="wzrk-confirm")
					
		WebElement Alert;


	public void setAlert() {
		Alert.click();
	}
	


	
	
	
	
	
	
}
