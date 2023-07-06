package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pompages.Testingpage;
import pompages.skillrarydemologinpage;
import pompages.skillraryloginpage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		skillraryloginpage s = new skillraryloginpage(driver);
		s.gearsbutton();
		s.demoappskillrary();
		
		skillrarydemologinpage sd = new skillrarydemologinpage(driver);
		driverutilies.switchtab(driver);
String dropdownValue = pdata.getpropertyfile("courseadd");
		
		// Select the dropdown value
		sd.selectDropdownValue(dropdownValue);
	    //driverutilies.DropDown(sd.getDropdown(),pdata.getpropertyfile("courseadd"));
		
	    Testingpage t = new Testingpage(driver);
		driverutilies.draganddrop(driver,t.getSelcour(),t.getCartbtn());
	    Point loc = t.getFacebookbtn().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilies.scrollbar(driver,x, y);
		t.facebook();
	}

}

