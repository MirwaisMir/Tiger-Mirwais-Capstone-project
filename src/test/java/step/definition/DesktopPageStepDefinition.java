package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktopObj = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		
		desktopObj.clickOnDesktopTab();
		logger.info("Click on Desktop validated successfully ");
Utils.hardWait();
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopObj.ClickOnShowAllDesktops();
		logger.info("click on showall validated successfully ");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {

		List<WebElement> DesktopElements = desktopObj.DeskTopAllItems();
		for (WebElement elements : DesktopElements) {

			Assert.assertTrue(elements.isDisplayed());
			logger.info(elements.getAttribute("title") + "present ");
		}
		Utils.takeScreenShot();
		Utils.hardWait();

	}

	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		Utils.hardWait();
		desktopObj.ClickonHPLP3065loptop();
		logger.info("click on HPLP validated successfully ");

	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopObj.Selectquantityone(string);
		Utils.hardWait();
		logger.info("click on Quantity field validated successfully ");
		Utils.takeScreenShot();
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopObj.ClickOnAddToCartButton();
		Utils.hardWait();
		logger.info("Click on Add button validated successfully ");
	}

	@Then("User should see a message   {string}")
	public void user_should_see_a_message(String string) {
		desktopObj.successMessage();
		logger.info("User was able to see success Message ");
		Utils.hardWait();
		Utils.takeScreenShot();
	}

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopObj.ClickOnCanonCamraLink();
		logger.info("click on canon camra validated successfully ");
		Utils.hardWait();
		Utils.takeScreenShot();
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopObj.selectColorRed();
		logger.info("color was selected successfully ");
		Utils.hardWait();
		Utils.takeScreenShot();
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopObj.ClickOncanonEos5Dcamera();
		Utils.hardWait();
		logger.info("click on camera validated successfully ");

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopObj.ClickOnReviewlink();
		logger.info("User was able to click on Review link ");
		Utils.hardWait();

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktopObj.EnterName(data.get(0).get("yourname"));
		Utils.hardWait();
		desktopObj.EnterYourReview(data.get(0).get("yourReview"));
		Utils.hardWait();
		desktopObj.SelectRating(data.get(0).get("Rating"));
		Utils.hardWait();
		logger.info("form has been filed successfully ");
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopObj.ClickOnContinueButton();
		Utils.hardWait();
		logger.info("clicked was done by continue button");
		Utils.takeScreenShot();
	}

	@Then("User should see a message with  {string}")
	public void user_should_see_a_message_with(String string) {
		desktopObj.SucessMessageDisplayed();
		logger.info("success message is displayed ");

	}
}
