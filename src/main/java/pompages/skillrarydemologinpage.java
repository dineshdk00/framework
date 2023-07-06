package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class skillrarydemologinpage {
	@FindBy(id ="course")
	private WebElement coursebtn;
	
	@FindBy(name ="addresstype")
	private WebElement dropdown;
	
	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getCoursebtn() {
		return coursebtn;
		
	}
	
	@FindBy(xpath ="//a[text()=\"Selenium Training\"]")
	private WebElement seleniumbtn;
    
	public skillrarydemologinpage(WebDriver driver) {
   PageFactory.initElements(driver,this);	
}
    public void seleniumbutton() {
	seleniumbtn.click();
}
	public void selectDropdownValue(String Value) {
		// TODO Auto-generated method stub
		Select s = new Select(dropdown);
	
		s.selectByVisibleText("Testing");
	}
	}
