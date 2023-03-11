package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElectronicsPage {
	
	WebDriver driver;
	
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public WebElement getAddtoCart() {
		WebElement addToCartButton = driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']/../..//button[text()='add to cart']"));
		return addToCartButton;
	}
	
	public WebElement addToWishList() {
		WebElement wishlistButton = driver.findElement(By.xpath("//span[contains(text(),'APPLE 2021 Macbook Pro')]/../..//*[@data-testid='FavoriteIcon']"));
		return wishlistButton;
	}

	public WebElement getProductForBuyNow() {
		WebElement productforBuyNow = driver.findElement(By.xpath("//span[contains(text(),'APPLE iPhone 13 Pro max')]/.."));
		return productforBuyNow;
	}
	
	public WebElement getProductForWishList() {
		WebElement wishListProduct = driver.findElement(By.xpath("//span[contains(text(),'APPLE 2021')]/../..//*[name()='svg' and @data-testid='FavoriteIcon']"));
		return wishListProduct;
	}

}
