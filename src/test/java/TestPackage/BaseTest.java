package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public static WebDriver driver;
static Logger log=Logger.getLogger(BaseTest.class.getNestHost());
	@BeforeClass
public void setup() {
	log.info("initializing the Browser");
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	log.info("Browser launched");
	
	driver.manage().window().maximize();
	
	driver.get("https://doctors.bajajfinservhealth.in/login");
log.info("Url launched");

}
	
	
}
