package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingPage {
	@FindBy(xpath = "//a[text()='Selenium Training']")
	private WebElement seleniumtraining;

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	@FindBy(id="mycart")
	private WebElement carttab;

	@FindBy(xpath ="//i[@class='fa fa-facebook'])[2]")
	private WebElement cartt;
	
	
}
