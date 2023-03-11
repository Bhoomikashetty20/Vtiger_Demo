package elf.TrainTheTrainers;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToUnderstadSVGTag {
	
	String state="florida";
	
	@Test
	public void toFindState() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhoomika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		//action.sendKeys(Keys.PAGE_DOWN);
		js.executeScript("window.scrollBy(0,700)");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")) );
		
		
		//driver.findElement(By.xpath("//*[name()='svg' and @id='map-svg']//*[name()='g' and  @id='colorado']")).click();
		
		/*
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//*[name()='svg' and @id='map-svg']//*[name()='g' and  @id='"+state+"']")).click();
				break;
			}catch(Exception e) {
				js.executeScript("window.scrollBy(0,500)");
			}
		}
		WebElement statename = driver.findElement(By.xpath("//*[name()='svg' and @id='map-svg']//*[name()='g' and  @id='"+state+"']"));
		wait.until(ExpectedConditions.visibilityOf(statename));
		statename.click();*/
		Thread.sleep(6000);
		action.moveByOffset(970, 249).click().perform();
		Thread.sleep(6000);
	}

}
