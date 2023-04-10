package product_friegt_basepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

@SuppressWarnings("unused")
public class TestBase {
	public static  WebDriver driver;


@BeforeMethod
	public void initializeChrome() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new EdgeDriver();
//		 ChromeOptions ops = new ChromeOptions();
//		 ops.addArguments("--remote-allow-origins=*");
//		 System.setProperty("webdriver.http.factory", "jdk-http-client");
		 driver.get(Constants.URL);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		/*
		 * WebDriverManager.edgedriver().setup(); WebDriver driver = new EdgeDriver();
		 * driver.get(Constants.URL);
		 * driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 * driver.manage().window().maximize();
		 */
	}

	/*
	 * public void failed() throws IOException {
	 * 
	 * File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(scrfile, new File(
	 * "C:\\Users\\vijay\\Downloads\\AutomationFrameworkCode-master\\AutomationFrameworkCode-master\\test-output\\screnshots\\screenshot1.jpg"
	 * ));
	 */
	@Test
	public void test() {
	System.out.println("test1");	
	}
	@AfterTest 
	public void tearDown() {
		//driver.close();

	}

}