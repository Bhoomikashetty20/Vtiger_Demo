package elf.TrainTheTrainers;

import java.util.concurrent.TimeUnit;

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

public class TC_Electronic_293 extends BaseTest {
	
	String addressPageTitle="ShoppersStack | Saved Addresses";
	
	@Test
	public void toClickOnBuyNow() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 120);
		Electronics ele=new Electronics(driver);
		ElectronicsPage elePage=new ElectronicsPage(driver);
		ProductPage productPage=new ProductPage(driver);
		Actions action=new Actions(driver);
		
		WebElement electronicButton = ele.getElectronics();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.elementToBeClickable(electronicButton));
		ele.getElectronics().click();
		Thread.sleep(2000);
		action.moveByOffset(178, 178);
		Thread.sleep(9000);
		
		WebElement buyNow = elePage.getProductForBuyNow();
		wait.until(ExpectedConditions.elementToBeClickable(buyNow));
		action.doubleClick(buyNow).perform();
		
		Thread.sleep(2000);
		productPage.getBuyNowButton().click();
		
		Thread.sleep(9000);
		Assert.assertEquals(driver.getTitle(), addressPageTitle, "Address page is not displayed");
		Reporter.log("Address page is displayed",true);
		
	}

}
