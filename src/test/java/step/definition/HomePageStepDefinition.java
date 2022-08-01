package step.definition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {

	HomePageObject homepageObj = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homepageObj.clickOnCurrencyLink();
		logger.info("User clicked on currency link successfully ");
		Utils.hardWait();

	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepageObj.clickOnEuroDropDwon();
		logger.info("User clicked on Euro currency link successfully ");
		Utils.hardWait();
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homepageObj.EuroCurrencyTextOnUI();
		logger.info("Euro sign currency text is enable to see on UI ");
		Utils.hardWait();
		Utils.takeScreenShot();
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepageObj.clickOnShoppingCartLink();
		logger.info("User clicked on Shopping Cart successfully ");
		Utils.hardWait();
	}
	@Then("{string} message should display")
	public void message_should_display(String string) {
		homepageObj.shoppingCartTextOnUI();
		logger.info("User see shoppingEmptytext  successfully");
		Utils.takeScreenShot();
	}
}
