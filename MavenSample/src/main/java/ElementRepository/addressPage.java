package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addressPage {
	
	public addressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Add New')]")
	private WebElement addNewAddress;
	
	@FindBy(id="Name")
	private WebElement nameTextField;
	
	@FindBy(id="House/Office Info")
	private WebElement houseAddressTextField;
	
	@FindBy(id="Street Info")
	private WebElement streetAddressTextField;
	
	@FindBy(id="Landmark")
	private WebElement landmarkAddressTextField;
	
	@FindBy(id="Country")
	private WebElement countryField;
	
	@FindBy(id="India")
	private WebElement india;
	
	@FindBy(id="State")
	private WebElement state;
	
	@FindBy(id="Karnataka")
	private WebElement karnataka;
	
	@FindBy(id="City")
	private WebElement City;
	
	@FindBy(id="Bengaluru")
	private WebElement bengaluru;
	
	@FindBy(id="Pincode")
	private WebElement pincode;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumber;
	
	@FindBy(id="addAddress")
	private WebElement addAddressButton;
	
	public WebElement getAddAddressButton() {
		return addAddressButton;
	}

	public WebElement getAddNewAddress() {
		return addNewAddress;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseAddressTextField() {
		return houseAddressTextField;
	}

	public WebElement getStreetAddressTextField() {
		return streetAddressTextField;
	}

	public WebElement getLandmarkAddressTextField() {
		return landmarkAddressTextField;
	}

	public WebElement getCountryField() {
		return countryField;
	}

	public WebElement getIndia() {
		return india;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getKarnataka() {
		return karnataka;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getBengaluru() {
		return bengaluru;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	
	

}
