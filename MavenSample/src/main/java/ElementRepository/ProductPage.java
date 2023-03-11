package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Buy Now")
	private WebElement buyNowButton;

	public WebElement getBuyNowButton() {
		return buyNowButton;
	}
	
	@FindBy(xpath="//button[@id='Add To Cart']")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

}
