package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pompages.Addtowishlist;
import pompages.corejavapages;
import pompages.skillraryloginpage;

public class Testcase3 extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException {
		skillraryloginpage s =new skillraryloginpage(driver);
		s.serachtb(pdata.getpropertyfile("coursename"));
		s.searchbutton();
		
		corejavapages c = new corejavapages(driver);
		c.corejavacourse();
		
		Addtowishlist a = new Addtowishlist(driver);
		driverutilies.switchtoframe(driver);
		a.playbutton();
		Thread.sleep(8000);
		a.pausebutton();
		driverutilies.switchback(driver);
		a.addtowishlistbutton();
		
	}
     
}
