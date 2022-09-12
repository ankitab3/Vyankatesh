package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryLoginPage;

public class TestCase2 extends BaseClass {

	@Test
	
	public void tc2() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillraryapplication();
		
		utilities.switchingTabs(driver);
	}
}
