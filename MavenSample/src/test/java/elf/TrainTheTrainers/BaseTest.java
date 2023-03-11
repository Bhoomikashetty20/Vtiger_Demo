package elf.TrainTheTrainers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ElementRepository.LoginPage;
import ElementRepository.Logout;
import ElementRepository.WelcomePage;
import GenericLibraries.UtilityClass;



public class BaseTest {
	
	protected WebDriver driver;
	String loginPageTiltle="ShoppersStack | Home";
	
	@BeforeClass
	public void browserSetUp() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhoomika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Reporter.log("Browser is launched....!!",true);
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized....!!",true);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void toLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		String url = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 1);
		driver.get(url);
		WelcomePage welcomepage=new WelcomePage(driver);
		Thread.sleep(12000);
		wait.until(ExpectedConditions.elementToBeClickable(welcomepage.getLoginButton()));
		welcomepage.getLoginButton().click();
		Thread.sleep(2000);
		LoginPage log=new LoginPage(driver);
		log.login();
		System.out.println(driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), loginPageTiltle, "Login page is not displayed");
		//Reporter.log("Login page is displayed",true);
	}
	
	@AfterMethod
	public void toLogout() {
		Logout logout=new Logout(driver);
		logout.getAccountSettings().click();
		logout.getLogout().click();
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("Browser is closed");
		driver.quit();
	}

}
