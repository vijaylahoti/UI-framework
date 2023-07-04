package com.basepackage;

import java.security.SecureRandom;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.util.Assert;
import com.google.common.base.Predicate;




public class TestActions {
	WebDriver driver;
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final SecureRandom RANDOM = new SecureRandom();
	Logger log = LogManager.getLogger(TestActions.class);
	
	public TestActions(WebDriver driver) {
		this.driver=driver;
	}
//	Logger log = Logger.getLogger(TestActions.class);

	public void navigateUrl(String url) {
		try {
			log.info("navigates to url"+url);
			driver.get(url);
		} catch (Exception e) {
			log.info("Failure to navigate to URL"+ url+e.getMessage().toString());
		}		
	}

	public void click(WebElement element) {
		try {
			System.out.println("successfully click on the element " + element);
			log.info("successfully click on the element"+element);
			waitForEle(element).click();
		}catch (NoSuchElementException e) {
			// Handle NoSuchElementException
			System.out.println("Element not found: " + element);
			e.printStackTrace();
		} catch (Exception e) {
			// Handle other exceptions
			System.out.println("Error occurred while clicking element: " + element);
			e.printStackTrace();
		}	
	}

	public void sendkeys(WebElement element,String input) {
		try {
			log.info("successfully enter sendkeys"+input);
			waitForEle(element).sendKeys(input); 
		} catch (Exception e) {
			// TODO: handle exception
			log.info("Failure to enter sendkeys"+input);
		}		
	}

	public void verifyElementDispaly(WebElement element) {
		try {
			if(waitForEle(element).isDisplayed()) {
				System.out.println("Emailid displayed successfully ");
			}else {
				System.out.println("Email is not displayed ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			//	Assert.fail("Failure to display emailid ");
		}		
	}

	public WebElement waitForEle(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return element;
	}

	public void dropdownhandle(WebElement elementdrop,int num) {
		try {
			//elementdrop.isSelected();
			Select drop= new Select(elementdrop);
			drop.selectByIndex(num);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getRandomInt( ) {
		Random randomGenerator = new Random(); 
		int randomInt = randomGenerator.nextInt(1000);
		return randomInt;
	}

	public static String generateRandomString(int length) {
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int randomIndex = RANDOM.nextInt(CHARACTERS.length());
			char randomChar = CHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}


	
	public static String generateRandomEmail(int length) {
        Random random = new Random();
        StringBuilder emailBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            emailBuilder.append(randomChar);
        }
        emailBuilder.append("@gmail.com");
        return emailBuilder.toString();
    }





//	this.sendkeys(tax_Name, name);
//	this.sendkeys(dropdown, GST);
//	for (WebElement webElement : list) {
//		if(webElement.getText().trim().equals("GST")) {
//			webElement.click();
//			break;
//		}
//	}














	

	public static void wait(WebDriver driver) {
		ChromeOptions x=new ChromeOptions();
		x.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	}
}
