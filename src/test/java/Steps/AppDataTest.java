package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.AppDataPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

import util.BrowserFactory;

public class AppDataTest {

	WebDriver driver;
	
	AppDataPage Adddata = PageFactory.initElements(driver, AppDataPage.class);

	@Before
	public void beforeTest() {

		driver = BrowserFactory.init();
		Adddata = PageFactory.initElements(driver, AppDataPage.class);

	}
	
	@When("^User should be able to set sky blue Background color$")
	public void user_should_be_able_to_set_sky_blue_Background_color() throws Throwable {
		Adddata.SkyBlueColorButton();
		Thread.sleep(2000);
	}

	@When("^User should be able to set White Background color$")
	public void user_should_be_able_to_set_White_Background_color() throws Throwable {
		Adddata.WhiteColorButton();
	}


}
