package elf.TrainTheTrainers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ElementRepository.Electronics;

public class TC_Electronic_286 extends BaseTest {
	
	String electronicsGSTStoreTitle="ShoppersStack | Electronics";
	
	@Test
	public void toClickElectronicGSTStoreTab() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 120);
		Electronics ele=new Electronics(driver);
		Actions action=new Actions(driver);
		
		WebElement electronicButton = ele.getElectronics();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.elementToBeClickable(electronicButton));
		action.moveToElement(electronicButton).perform();
		ele.getElectronicsGSTStore().click();
		wait.until(ExpectedConditions.titleContains("Electronics"));
		Assert.assertEquals(driver.getTitle(), electronicsGSTStoreTitle, "Electronics GST Store page is not displayed");
		Reporter.log("Electronics GST Store page is displayed");
	}

}
