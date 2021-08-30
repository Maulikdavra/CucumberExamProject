package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AppDataPage extends BasePage{

	WebDriver driver;

	public AppDataPage(WebDriver driver) {
		this.driver = driver;
	}


	@FindBy(how=How.XPATH, using="//*[@id=\"extra\"]/button[1]") WebElement SKY_BLUE_COLOR_BUTTON;
	@FindBy(how=How.XPATH, using="//*[@id=\"extra\"]/button[2]") WebElement WHITE_COLOR_BUTTON;

	public void SkyBlueColorButton() {
		SKY_BLUE_COLOR_BUTTON.click();
	}
	
	public void WhiteColorButton() {
		WHITE_COLOR_BUTTON.click();
	}
	
}
