package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.RetailPageObj;
import utilities.Utils;

public class RetailStepDefinition extends Base {

	RetailPageObj retailpageobj = new RetailPageObj();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String ExpectedtexFromUI = "TEST ENVIRONMENT";
		String ActualText = retailpageobj.getTestEnvironmentTextFromUI();
		Assert.assertEquals(ExpectedtexFromUI, ActualText);

		logger.info("Test Environment webpage text validated successfully ");

	}

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() throws InterruptedException {
		retailpageobj.ClickOnMyaccountlink();
		logger.info("Click on my account was validated successfully ");
		Thread.sleep(2000);

	}

	@When("User click on Login")
	public void user_click_on_login() throws InterruptedException {
		retailpageobj.ClickOnLoginlink();
		logger.info("Click on logging link was validated successfully ");
		Thread.sleep(2000);
	}

	@When("User enter userName {string}  and pasword  {string}")
	public void user_enter_user_name_and_pasword(String userName, String password) throws InterruptedException {
		retailpageobj.EnterUserNameOREmail("Mirwais15.test@gmail.com");
		retailpageobj.Enterpassword("Mir1988");

		logger.info("Email and password validated successfully ");
		Thread.sleep(2000);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailpageobj.ClickOnLoginButton();

		logger.info("The login button validated successfully ");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String ExpectedtextfromMyaccount = "My Account";
		String Actultextfrommyaccount = retailpageobj.getMyAccountText();
		Assert.assertEquals(ExpectedtextfromMyaccount, Actultextfrommyaccount);

		logger.info("My Account text was validated successfully ");

	}

	@When("User click on Register for an Affiliate Account {string} link")
	public void user_click_on_register_for_an_affiliate_account_link(String string) {
		retailpageobj.ClickOnRejisterForAffiliateAccountlink();

		logger.info("on Rejister affiliate account link was sucessfully validated");

	}

	@When("User fill affiliate form with below")
	public void user_fill_affiliate_form_with_below(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.EnterCompanyName(data.get(0).get("company"));
		retailpageobj.EnterWebsiteName(data.get(0).get("website"));
		retailpageobj.EnterTaxID(data.get(0).get("taxID"));
		retailpageobj.SelectPaymentMthod(data.get(0).get("paymentMethod"));
		retailpageobj.EnterChequePayeeName(data.get(0).get("ChequePayeeName"));
		Utils.takeScreenShot();

		logger.info("The form filed sucessfully ");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailpageobj.agreeOnYESCheckBoxButton();

		logger.info("The check box yes button validated succssesfully ");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailpageobj.ClickOnContinueButton();

		logger.info("Continue button validated successfully ");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {

		retailpageobj.successTextIsDisplay();

		logger.info("The account succsses message validated successfully ");
	}

	@When("User  click on Edit your affiliate informationlink {string}")
	public void user_click_on_edit_your_affiliate_informationlink(String string) {
		retailpageobj.ClickoNEditAffilateInformationlink();
		logger.info("Edit on affiliate information was clicked successfully ");

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailpageobj.ClickOnBankTransferbutton();
		logger.info("click on Bank transfer radio button validated successfully ");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.EnterBankName(data.get(0).get("bankName"));
		retailpageobj.EnterBankABAnumber(data.get(0).get("abaNumber"));
		retailpageobj.EnterBankSwiftCode(data.get(0).get("swiftCode"));
		retailpageobj.EnterBankAccountName(data.get(0).get("accountName"));
		retailpageobj.EnterBankAccountNumber(data.get(0).get("accountNumber"));
		Utils.takeScreenShot();
		logger.info("this form of bank account information filled successfully ");
		Thread.sleep(2000);
	}

	@When("User click on Edit your account information {string} link")
	public void user_click_on_edit_your_account_information_link(String string) {
		retailpageobj.ClickOnEditAccountInformation();
		logger.info("Click on Edit Account information validated successfully ");

	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.EnterFirstName(data.get(0).get("firstname"));
		retailpageobj.EnterLastName(data.get(0).get("lastName"));
		retailpageobj.EnterEmailAdress(data.get(0).get("email"));
		retailpageobj.EnterTelephonenumber(data.get(0).get("telephone"));
		logger.info("The bank account information form filed succsessfully ");
		Thread.sleep(2000);
	}

	@When("User click on continue button")
	public void user_click_on_continue_button1() {
		retailpageobj.ClickOnContinueButtonForEditAccountInformation();
		logger.info("The continue button was clicked successfully ");
	}

//	@Then("User should see a message {string}")
//	public void user_should_see_a_message(String string) {
//		String ExpectedSuccesstext = "Success: Your account has been successfully updated";
//		String ActulSuccessTex = retailpageobj.getsuccessMessageForAccountInformationCreated();
//		Assert.assertEquals(ExpectedSuccesstext, ActulSuccessTex);
//		Assert.assertTrue(retailpageobj.isEditAccountInfoSuccessMessagePresent());
//		logger.info("Success message displayed successfully ");
	
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertTrue(retailpageobj.isEditAccountInfoSuccessMessagePresent());
		logger.info("Edit Account info Success Message is displayed!");
	}
	}

