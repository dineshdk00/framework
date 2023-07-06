package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtowishlist {
  @FindBy(xpath="(//button[@type=\"button\"])[4]")
  private WebElement playbtn;
  
  @FindBy(xpath="(//button[@type=\"button\"])[4]")
  private WebElement pausebtn;
  
  @FindBy(xpath="//span[text()=\"Add To Wishlist\"]")
  private WebElement addwishlistbtn;
  
  public Addtowishlist(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }
  
  public void playbutton() {
	  playbtn.click();
  }
  public void pausebutton() {
	  pausebtn.click();
  }
  public void addtowishlistbutton() {
	  addwishlistbtn.click();
  }
}
