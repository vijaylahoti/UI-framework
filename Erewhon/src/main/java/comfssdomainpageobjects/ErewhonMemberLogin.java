package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import product_friegt_basepackage.TestActions;

public class ErewhonMemberLogin extends TestActions{
	WebDriver driver;
	Logger log = Logger.getLogger(ErewhonMemberLogin.class);

	public ErewhonMemberLogin(WebDriver driver) {
		super(driver);
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div[1]/button")
		public WebElement memberlogin;
		
		@FindBy(xpath="//*[@id=\"verificationPhoneNumber\"]")
		public WebElement mobile;
		
		public void navigateToUrl(String url) {
			this.navigateToUrl(url);
		}
			
			public void clickOnmemberlogin() {
				this.click(memberlogin);
			}
				
			public void entermobileno(String verificationPhoneNumber) {
					this.sendkeys(mobile, verificationPhoneNumber);
		
			
		}
}

