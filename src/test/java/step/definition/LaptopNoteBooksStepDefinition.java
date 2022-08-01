package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject LaptopNoteBookObj = new LaptopNoteBooksPageObject();

	@Given("User is on Retail website {string}")
	public void user_is_on_retail_website(String string) {
		LaptopNoteBookObj.clickeOnTestEnvironment();
		logger.info("user clicked on Retail website");
	}

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		LaptopNoteBookObj.clickOnlaptopNotebooksTab();
		logger.info("user clicked on laptop &NoteBook tab");
		Utils.hardWait();

	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		LaptopNoteBookObj.clickOnshowAllLaptopsNoteBooks();
		logger.info("user click on show all Laptop &NoteBook option");
		Utils.hardWait();
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		LaptopNoteBookObj.clickeOnMacBookitem();
		logger.info("user click on MacBook item");
		Utils.hardWait();
	}

	@When("User click add to Cart button for Mac Book")
	public void user_click_add_to_cart_button_for_mac_book() {
		LaptopNoteBookObj.clickToAddToCart();
		logger.info("user Add MacBook To Cart");
		Utils.hardWait();
	}

	@Then("User should see a messagee {string}")
	public void user_should_see_a_messagee(String string) {
		Assert.assertTrue(LaptopNoteBookObj.SuccessMassage());

	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		LaptopNoteBookObj.SeeOneItemInItemsOption();
		logger.info("user can see one Item in the items");

	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		LaptopNoteBookObj.ClickOnCartOption();
		logger.info("user click on item Button");
		Utils.hardWait();
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		LaptopNoteBookObj.clickOnRemovetheitems();
		Utils.hardWait();
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		LaptopNoteBookObj.noItemsAddtothecart();
		logger.info("user see their is no items add to the cart");
		Utils.hardWait();

	}
	@When("User click on product comparison icon onn  {string}")
	public void user_click_on_product_comparison_icon_onn(String string) {
		LaptopNoteBookObj.clickOnProductComparisonMacBook();
		logger.info("macbook product comparison button clicked");
		Utils.hardWait();
	}

	@When("User click on product comparison icon on  {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		LaptopNoteBookObj.clickOnProductComparisonMacBookAir();
		logger.info("user click on macbookAir comparison button");
		Utils.hardWait();
	}
	


	@Then("User should see a message2 {string}")
	public void user_should_see_a_message2(String string) {
		LaptopNoteBookObj.succesAddMacBookAirtoProductCompare();
		logger.info("user can see add successfulle to product comparison");
		Utils.hardWait();
	}

	@When("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		LaptopNoteBookObj.clickOnproductComprison();
		logger.info("user can click on product comparison");
		Utils.hardWait();
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		LaptopNoteBookObj.productCompareItem();
		logger.info("user can see items in product compare chart");
		Utils.hardWait();
	}

@When("User click on heart icon to add {string} laptop to wish list")
public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
	LaptopNoteBookObj.clickOnHeartIconButton();
	logger.info("User was able to click on Heart icon ");
	Utils.hardWait();
}

@Then("User should get a message {string}")
public void user_should_get_a_message(String string) {
	LaptopNoteBookObj.HeartSuccssesMessageForsaveSonyVio();
    logger.info("User see Success message on the UI ");
}

@When("User click on MacBook Pro  {string}  item")
public void user_click_on_mac_book_pro_item(String string) {
	LaptopNoteBookObj.clickOnMacBookProLink();
	logger.info("User is able to click on MacBook Link successfully ");
	Utils.hardWait();
}
@Then("User should see  {string} price tag is present on UI.")
public void user_should_see_price_tag_is_present_on_ui(String string) {
	LaptopNoteBookObj.SuccessTextMacBookprice();
	logger.info("User see MacBook Pro price text on UI ");
	Utils.takeScreenShot();
}
}