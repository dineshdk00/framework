package Scripts;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pompages.Addtocartpage;
import pompages.skillrarydemologinpage;
import pompages.skillraryloginpage;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() {
		skillraryloginpage s = new skillraryloginpage(driver);
		s.gearsbutton();
		s.demoappskillrary();
		
		skillrarydemologinpage sd = new skillrarydemologinpage(driver);
		driverutilies.switchtab(driver);
		driverutilies.mouseHover(driver,sd.getCoursebtn());
		sd.seleniumbutton(); 
		
		Addtocartpage a = new Addtocartpage(driver);
	    driverutilies.doubleclick(driver,a.getAddbtn());
	    a.addbutton();
	    driverutilies.alertpopup(driver);
	}
	
	}
	


