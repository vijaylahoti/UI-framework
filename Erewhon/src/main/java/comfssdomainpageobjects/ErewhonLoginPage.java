package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import product_friegt_basepackage.TestActions;

public class ErewhonLoginPage extends TestActions{
	WebDriver driver;
	Logger log = Logger.getLogger(ErewhonLoginPage.class);

	public ErewhonLoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//input[@type='email']")
		public WebElement emailaddress;
		
		
		public void enterEmailID(String email) {
		this.sendkeys(emailaddress, email);
			
		}
}
