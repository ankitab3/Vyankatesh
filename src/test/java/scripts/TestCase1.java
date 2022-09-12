package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;


public class TestCase1 extends BaseClass{
@Test

public void tcl() {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.skillraryapplication();
	
	utilities.switchingTabs(driver);
	
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	utilities.mousehover(driver, sd.getCoursetab());
	sd.seleniumtrainingtab();
	
	AddtoCartPage a=new AddtoCartPage(driver);
	utilities.doubleclick(driver, a.getAddbtn());
	a.carttocartbtn();
	utilities.alertPopup(driver);
}

	
}
