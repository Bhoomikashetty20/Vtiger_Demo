package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	

	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cartIcon")
	private WebElement cartButton;
	
	@FindBy(xpath="//p[text()='APPLE iPhone 14 Pro']")
	private WebElement productTitle;

	public WebElement getCartButton() {
		return cartButton;
	}

	public WebElement getProductTitle() {
		return productTitle;
	}
	
	

}
