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

public class TC_Electronic_291 extends BaseTest {
	
	String cartPageTitle="ShoppersStack | Cart";
	String productTitle="APPLE iPhone 14 Pro";

	@Test
	public void toAddToCart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 120);
		Electronics ele=new Electronics(driver);
		ElectronicsPage elePage=new ElectronicsPage(driver);
		CartPage cartPage=new CartPage(driver);
		Actions action=new Actions(driver);
		
		WebElement electronicButton = ele.getElectronics();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.elementToBeClickable(electronicButton));
		ele.getElectronics().click();
		Thread.sleep(2000);
		action.moveByOffset(178, 178);
		elePage.getAddtoCart().click();
		Thread.sleep(2000);
		cartPage.getCartButton().click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), cartPageTitle, "Cart page is not displayed");
		Reporter.log("Cart page is displayed",true);
		Assert.assertEquals(cartPage.getProductTitle().getText(), productTitle, "Product is not added to cart");
		Reporter.log("Product is added to cart", true);
	}

}
