package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {

	@FindBy(id="add")
	private WebElement addbtn;
	
	public AddtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddbtn() {
		// TODO Auto-generated method stub
		return null;
	}

	public void carttocartbtn() {
		// TODO Auto-generated method stub
		
	}

	
	
}
