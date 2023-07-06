package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {
	@FindBy(xpath="(//a[text()=\"Selenium Training\"])[2]")
	private WebElement selcour;
	
	public WebElement getSelcour() {
		return selcour;
	}
	public WebElement getCartbtn() {
		return cartbtn;
	}
	public WebElement getFacebookbtn() {
		return facebookbtn;
	}
	@FindBy(id="cartArea")
	private WebElement cartbtn;
	
	@FindBy(xpath="(//i[@class=\"fa fa-facebook\"])[2]")
	private WebElement facebookbtn;
	
	
	public Testingpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void facebook() {
		facebookbtn.click();
	}
	
}


