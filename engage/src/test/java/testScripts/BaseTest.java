package testScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import generic.FrameworkConstants;
import generic.UtilityMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepo.LoginPage;

public class BaseTest extends UtilityMethods {
	
public static WebDriver driver;
	
	@Parameters("browser") //browser name must be given at runtime
	@BeforeClass(alwaysRun = true)
	public void setUpBrowser(@Optional("chrome") String browserName) {
	
		if(browserName.contains("chrome")) {
			//System.setProperty(FrameworkConstants.CHROME_KEY, FrameworkConstants.CHROME_PATH);
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		} else if(browserName.contains("firefox")) {
			//System.setProperty(FrameworkConstants.FIREFOX_KEY, FrameworkConstants.FIREFOX_PATH);
			WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
		}
		else {
			System.out.println("Browser name not specified");
		}
		
		driver.manage().window().maximize();
		driver.get(FrameworkConstants.URL);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
	}
	
	public static Properties prop = new Properties();
	public static FileInputStream fr;
	
		
	

			
	@Parameters("role")
	@BeforeMethod
	public void testCase(@Optional("ITManager")String roleName) throws InterruptedException {
		
		 try {
			fr = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\configfile\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			prop.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 if(roleName.contains("ITManager")) {
			 LoginPage loginPage=new LoginPage(driver);
				loginPage.enterUsername(prop.getProperty("usernameitmanager"));
				loginPage.enterPassword(prop.getProperty("passworditmanager"));
				Thread.sleep(2000);
				loginPage.clickLoginButton();
				Thread.sleep(10000);
				
			} else if(roleName.contains("Creator")) {
				LoginPage loginPage=new LoginPage(driver);
				loginPage.enterUsername(prop.getProperty("usernamecreator"));
				loginPage.enterPassword(prop.getProperty("passwordcreator"));
				Thread.sleep(2000);
				loginPage.clickLoginButton();
				Thread.sleep(10000);
			}
			else {
				System.out.println("role name not specified");
			}
	}
		
		
		
	
	
	
	@AfterMethod
	public void log() throws InterruptedException {
		LoginPage loginPage=new LoginPage(driver);
		Thread.sleep(2000);
		loginPage.clicklogoutdrop();
		Thread.sleep(2000);
		loginPage.clicklogout();
		Thread.sleep(4000);
		System.out.println("logout sucessfully");
	}
	
	
	@AfterClass(alwaysRun = true)
	public void browserTearDown() {
		driver.quit();
		
}}
