package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import product_friegt_basepackage.TestActions;

public class LoginPage extends TestActions {
	WebDriver driver;
	Logger log = Logger.getLogger(LoginPage.class);
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement emailaddress;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement LogIn;
	
	@FindBy(xpath="//*[@id=\"location-list\"]/li[4]/h4/a")
	public WebElement SelectLocation;
	
	@FindBy(xpath="//*[@id=\"price-list-3\"]/ul/li[1]/h5")
	public WebElement Groceries;
	
	public void navigateToUrl(String url) {
		this.navigateToUrl(url);
	}
	
	
	public void enterEmailID(String email) {
		this.sendkeys(emailaddress, email);
			
		}
	public void enterPassword(String Password) {
		this.sendkeys(password, Password);
	}
	
	public void clickOnLogIn() {
		this.click(LogIn);
	}
	
	public void clickOnSelectLocation() {
		this.click(SelectLocation);
	}
	public void clickOnGroceries() {
	this.click(Groceries);
	}
}
	







