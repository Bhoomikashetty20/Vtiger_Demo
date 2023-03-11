package ElementRepository;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibraries.UtilityClass;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginClick;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginClick() {
		return loginClick;
	}
	
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		String emailId = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 2);
		Thread.sleep(5000);
		emailTextField.sendKeys(emailId);
		Assert.assertEquals(emailTextField.getAttribute("value"), emailId, "Email is not entered");
		Reporter.log("Email is entered",true);
		String password = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 3);
		Thread.sleep(5000);
		passwordTextField.sendKeys(password);
		Assert.assertEquals(passwordTextField.getAttribute("value"), password, "Password is not entered");
		Reporter.log("Password is entered",true);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}
	
}
