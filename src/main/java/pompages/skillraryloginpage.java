package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryloginpage {
	@FindBy(xpath = "//a[text()=' GEARS ' ]")
	private WebElement gearsbtn;
	@FindBy(xpath="(//a[text()=\" SkillRary Demo APP\" ])[2]")
	private WebElement demoskillraryapp;
    
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value=\"go\"]")
	private WebElement gobtn;
    
	public skillraryloginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	public void gearsbutton() {
		gearsbtn.click();
		
	}
	public void demoappskillrary() {
	demoskillraryapp.click();  
	}
	
	public void serachtb(String name) {
		 searchtb.sendKeys(name);
	}
	
	public void searchbutton() {
		gobtn.click();
	}
}
  