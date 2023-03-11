package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@aria-label='Account settings']")
	private WebElement accountSettings;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//li[contains(text(),'Wish List')]")
	private WebElement wishlist;

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getAccountSettings() {
		return accountSettings;
	}

	public WebElement getLogout() {
		return logout;
	}
	

}
