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

public class TC_Electronic_287 extends BaseTest {
	
	String cameraPageTitle="ShoppersStack | Home";

	@Test
	public void toClickCameraTab() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 120);
		Electronics ele=new Electronics(driver);
		Actions action=new Actions(driver);
		
		WebElement electronicButton = ele.getElectronics();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.elementToBeClickable(electronicButton));
		action.moveToElement(electronicButton).perform();
		Thread.sleep(2000);
		ele.getCameras().click();
		//wait.until(ExpectedConditions.titleContains("Electronics"));
		Assert.assertEquals(driver.getTitle(), cameraPageTitle, "Cameras page is not displayed");
		Reporter.log("Cameras page is displayed",true);
	}
}
