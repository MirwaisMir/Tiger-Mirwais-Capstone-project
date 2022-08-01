package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObj extends Base {

	public RetailPageObj() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnviromenttext;
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	private WebElement MyAccountlink;
	@FindBy(xpath = "//li//a[text()='Login']")
	private WebElement loginlink;
	@FindBy(id = "input-email")
	private WebElement emailfield;
	@FindBy(id = "input-password")
	private WebElement passwordfield;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginbutton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement MyAccounttext;

@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement rejisterForAffiliateAccountlink;
	@FindBy(id = "input-company")
	private WebElement companyfield;
	@FindBy(id = "input-website")
	private WebElement websitefield;
	@FindBy(id = "input-tax")
	private WebElement taxIDfield;
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentMethodcheque;
	@FindBy(id = "input-cheque")
	private WebElement ChequePayeeNamefield;
    @FindBy(xpath="//input[@name='agree']")
    private WebElement checkBoxField;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continuebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessagetext;


	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffilateInformationlink;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferbutton;
	@FindBy(id = "input-bank-name")
	private WebElement banknamefield;
	@FindBy(id = "input-bank-branch-number")
	private WebElement AbaNumberfield;
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftcodeField;
	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameField;
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumber;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continuelink;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageonAccountCreated;

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement EditAccountInformation;
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	@FindBy(id = "input-email")
	private WebElement emailField;
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement ContinueButtonForEditAccountInformation;

	@FindBy(xpath = "//*[@id='account-account']/div[1]")
	private WebElement successMessageEditAccountInfo;




	public String getTestEnvironmentTextFromUI() {
		String ActualText = testEnviromenttext.getText();
		return ActualText;
	}

	public void ClickOnMyaccountlink() {
		MyAccountlink.click();
	}

	public void ClickOnLoginlink() {
		loginlink.click();
	}

	public void EnterUserNameOREmail(String email) {
		emailfield.sendKeys(email);
	}

	public void Enterpassword(String password) {

		passwordfield.sendKeys(password);

	}

	public void ClickOnLoginButton() {
		loginbutton.click();
	}

	public String getMyAccountText() {
		String Actultext = MyAccounttext.getText();
		return Actultext;

	}


	public void ClickOnRejisterForAffiliateAccountlink() {
		rejisterForAffiliateAccountlink.click();
	}

	public void EnterCompanyName(String company) {
		companyfield.sendKeys(company);
	}

	public void EnterWebsiteName(String website) {
		websitefield.sendKeys(website);
	}

	public void EnterTaxID(String taxID) {
		taxIDfield.sendKeys(taxID);
	}

	public void SelectPaymentMthod(String string) {
		 paymentMethodcheque.click();
	}

	public void EnterChequePayeeName(String chequePayeeName) {
		ChequePayeeNamefield.sendKeys(chequePayeeName);
	}
    public void agreeOnYESCheckBoxButton () {
    	checkBoxField.click();
    }
	public void ClickOnContinueButton() {
		continuebutton.click();
	}

//	public String getSuccessMessageFromUI() {
//		String ActualSuccessText = successMessagetext.getText();
//		return ActualSuccessText;
//	}
	public void successTextIsDisplay() {
		successMessagetext.isDisplayed();

	}
	public void ClickoNEditAffilateInformationlink() {
		editAffilateInformationlink.click();
	}

	public void ClickOnBankTransferbutton() {
		bankTransferbutton.click();

	}

	public void EnterBankName(String BankName) {
		banknamefield.sendKeys(BankName);
	}

	public void EnterBankABAnumber(String BankABAnumber) {
		AbaNumberfield.sendKeys(BankABAnumber);
	}

	public void EnterBankSwiftCode(String BankSwiftCode) {
		swiftcodeField.sendKeys(BankSwiftCode);
	}

	public void EnterBankAccountName(String BankAccountName) {
		accountNameField.sendKeys(BankAccountName);
	}

	public void EnterBankAccountNumber(String BankAccountNumber) {
		accountNumber.sendKeys(BankAccountNumber);
	}

	public void ClickOnContinueLink() {
		continuelink.click();
	}

	public String getSuccessMessageTextonAccountCreated() {
		String AcutalMessageForSuccess = successMessageonAccountCreated.getText();
		return AcutalMessageForSuccess;
	}

	public void ClickOnEditAccountInformation() {
		EditAccountInformation.click();

	}

	public void EnterFirstName(String firstname) {
		firstNameField.clear();
		firstNameField.sendKeys(firstname);
	}

	public void EnterLastName(String lastname) {
		lastNameField.clear();
		lastNameField.sendKeys(lastname);
	}

	public void EnterEmailAdress(String EmailID) {
		emailField.clear();
		emailField.sendKeys(EmailID);
	}

	public void EnterTelephonenumber(String telephoneNum) {
		telephoneField.clear();
		telephoneField.sendKeys(telephoneNum);
	}

	public void ClickOnContinueButtonForEditAccountInformation() {
		ContinueButtonForEditAccountInformation.click();
	}

//	public String getsuccessMessageForAccountInformationCreated() {
//	String ActualTextMessageForInformationAccount = successMessageForAccountInformationCreated.getText();
//	return ActualTextMessageForInformationAccount;
//	}
	public boolean isEditAccountInfoSuccessMessagePresent() {
		// String actualSuccessMessage = successMessageEditAccountInfo.getText();
		// String expectedSuccessMessage = " Success: Your account has been successfully
		// updated.";
		// if (actualSuccessMessage.equals(expectedSuccessMessage)) {
		// return true;
		// } else {
		// return false;
		// }
		if (successMessageEditAccountInfo.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	
	}
}
