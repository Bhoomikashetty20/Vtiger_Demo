package elf.TrainTheTrainers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ElementRepository.Electronics;
import ElementRepository.ElectronicsPage;
import ElementRepository.Logout;
import ElementRepository.ProductPage;
import ElementRepository.addressPage;

public class TC_Electronic_292 extends BaseTest {
	
	String addressPageTitle="ShoppersStack | Saved Addresses";
	
	@Test
	public void toClickOnWishList() throws InterruptedException, EncryptedDocumentException, IOException {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		Electronics ele=new Electronics(driver);
		ElectronicsPage elePage=new ElectronicsPage(driver);
		Actions action=new Actions(driver);
		Logout log=new Logout(driver);
		
		WebElement electronicButton = ele.getElectronics();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.elementToBeClickable(electronicButton));
		ele.getElectronics().click();
		Thread.sleep(2000);
		action.moveByOffset(178, 178);
		Thread.sleep(2000);
		WebElement wishList = elePage.getProductForWishList();
		wait.until(ExpectedConditions.elementToBeClickable(wishList));
		action.doubleClick(wishList).perform();
		
		log.getAccountSettings().click();
		log.getWishlist().click();
		
		
	}

}
