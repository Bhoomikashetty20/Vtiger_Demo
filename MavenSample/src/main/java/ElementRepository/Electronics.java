package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics {
	
	public Electronics(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="electronics")
	private WebElement electronics;
	
	@FindBy(xpath="//a[text()='Electronics GST Store']")
	private WebElement electronicsGSTStore;
	
	@FindBy(xpath="//a[contains(text(),'Cameras')]")
	private WebElement cameras;
	
	@FindBy(xpath="//a[contains(text(),'USB')]")
	private WebElement USBCables;
	
	@FindBy(xpath="//a[contains(text(),'Watch')]")
	private WebElement watch;
	
	@FindBy(xpath="//a[contains(text(),'Computer')]")
	private WebElement computer;

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getElectronicsGSTStore() {
		return electronicsGSTStore;
	}

	public WebElement getCameras() {
		return cameras;
	}

	public WebElement getUSBCables() {
		return USBCables;
	}

	public WebElement getWatch() {
		return watch;
	}

	public WebElement getComputer() {
		return computer;
	}
}
