package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class corejavapages {
	@FindBy(xpath="//a[text()=\" Core Java For Selenium Trainin\"]")
	private WebElement corejavaclc;

	public corejavapages(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void corejavacourse() {
		corejavaclc.click();
	}
}

