package elf.TrainTheTrainers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ElementRepository.CartPage;
import ElementRepository.Electronics;
import ElementRepository.ElectronicsPage;
import ElementRepository.ProductPage;
import ElementRepository.addressPage;
import GenericLibraries.UtilityClass;

public class TC_Electronic_295 extends BaseTest {
	
String addressPageTitle="ShoppersStack | Saved Addresses";
	
	@Test
	public void toClickOnBuyNow() throws InterruptedException, EncryptedDocumentException, IOException {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 120);
		Electronics ele=new Electronics(driver);
		ElectronicsPage elePage=new ElectronicsPage(driver);
		ProductPage productPage=new ProductPage(driver);
		addressPage addressPage=new addressPage(driver);
		Actions action=new Actions(driver);
		
		WebElement electronicButton = ele.getElectronics();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.elementToBeClickable(electronicButton));
		ele.getElectronics().click();
		Thread.sleep(2000);
		action.moveByOffset(178, 178);
		Thread.sleep(9000);
		WebElement buynowProduct = elePage.getProductForBuyNow();
		wait.until(ExpectedConditions.elementToBeClickable(buynowProduct));
		action.doubleClick(buynowProduct).perform();
		Thread.sleep(2000);
		productPage.getBuyNowButton().click();
		addressPage.getAddNewAddress().click();
		String name = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 4);
		String house = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 5);
		String street = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 6);
		String landMark = UtilityClass.toReadStringDataFromExcel("TestCases", "Electronics_IT", 6, 7);
		int pincode = (int) UtilityClass.toReadIntDataFromExcel("TestCases", "Electronics_IT", 6, 8);
		long phoneno =  (long) UtilityClass.toReadIntDataFromExcel("TestCases", "Electronics_IT", 6, 9);
		
		WebElement nameTextField = addressPage.getNameTextField();
		nameTextField.sendKeys(name);
		Assert.assertEquals(nameTextField.getAttribute("value"), name, " Name is not entered");
		Reporter.log("Name is entered", true);
		
		WebElement houseTextField = addressPage.getHouseAddressTextField();
		houseTextField.sendKeys(house);
		Assert.assertEquals(houseTextField.getAttribute("value"), house, " House address is not entered");
		Reporter.log("House address is entered", true);
		
		WebElement streetTextField = addressPage.getStreetAddressTextField();
		streetTextField.sendKeys(street);
		Assert.assertEquals(streetTextField.getAttribute("value"), street, " Street address is not entered");
		Reporter.log("Street address is entered", true);
		
		WebElement landMarkTextField = addressPage.getLandmarkAddressTextField();
		landMarkTextField.sendKeys(landMark);
		Assert.assertEquals(landMarkTextField.getAttribute("value"), landMark, " Landmark is not entered");
		Reporter.log("Landmark is entered", true);
		
		addressPage.getCountryField().click();
		addressPage.getIndia().click();
		 
		addressPage.getState().click();
		addressPage.getKarnataka().click();
		
		addressPage.getCity().click();
		addressPage.getBengaluru().click();
		
		WebElement pincodeTextField = addressPage.getPincode();
		pincodeTextField.sendKeys(pincode+"");
		Assert.assertEquals(pincodeTextField.getAttribute("value"), pincode+"", "Pincode is not entered");
		Reporter.log("Pincode is entered", true);
		
		WebElement phonenoTextField = addressPage.getPhoneNumber();
		phonenoTextField.sendKeys(phoneno+"");
		Assert.assertEquals(phonenoTextField.getAttribute("value"), phoneno+"", "Phone number is not entered");
		Reporter.log("Phone number is entered", true);
		
		addressPage.getAddAddressButton().click();
		
		
		
	}


}
