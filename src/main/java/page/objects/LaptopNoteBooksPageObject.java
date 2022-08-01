package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement TestEnvironment;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickOnlaptopNotebooksTab;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBookitem;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddToCartbutton;

	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement SuccessMassage;

	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement SeeOneItemInItemsOption;

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement ClickOnCartOption;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickOnRemovetheitems;
	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement noitemonthecart;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement macBookCompareButton;

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement MacBookAirCompareButton;

	@FindBy(xpath = "//*[@class='alert alert-success alert-dismissible']")
	private WebElement SuccesAddMacBookAirtoProductFromCompare;

	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement clickOnproductComprisonLink;

	@FindBy(xpath = "/html/body/div[2]")
	private WebElement productCompareItemTable;
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement heartIconbutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessageHeartTosaveSonyVio;
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement MacBookProLink;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/ul[1]/li[3]")
	private WebElement MacBookpriceText;

	public void clickeOnTestEnvironment() {
		TestEnvironment.click();
	}

	public void clickOnlaptopNotebooksTab() {
		clickOnlaptopNotebooksTab.click();
	}

	public void clickOnshowAllLaptopsNoteBooks() {
		showAllLaptopsAndNotebooks.click();

	}

	public void clickeOnMacBookitem() {
		MacBookitem.click();
	}

	public void clickToAddToCart() {
		AddToCartbutton.click();

	}

	public boolean SuccessMassage() {
		if (SuccessMassage.isDisplayed())
			return true;
		else
			return false;
	}

	public void SeeOneItemInItemsOption() {
		SeeOneItemInItemsOption.isDisplayed();
	}

	public void ClickOnCartOption() {
		ClickOnCartOption.click();
	}

	public void clickOnRemovetheitems() {
		clickOnRemovetheitems.click();
	}

	public void noItemsAddtothecart() {
		noitemonthecart.isDisplayed();
	}

	public void clickOnProductComparisonMacBook() {
		macBookCompareButton.click();
	}

	public void clickOnProductComparisonMacBookAir() {
		MacBookAirCompareButton.click();
	}

	public void succesAddMacBookAirtoProductCompare() {
		SuccesAddMacBookAirtoProductFromCompare.isDisplayed();
	}

	public void clickOnproductComprison() {
		clickOnproductComprisonLink.click();
	}

	public void productCompareItem() {
		productCompareItemTable.isDisplayed();
	}

	public void clickOnHeartIconButton() {
		heartIconbutton.click();
	}

	public void HeartSuccssesMessageForsaveSonyVio() {
		SuccessMessageHeartTosaveSonyVio.isDisplayed();
	}

	public void clickOnMacBookProLink() {
		MacBookProLink.click();
	}

	public void SuccessTextMacBookprice() {
		MacBookpriceText.isDisplayed();
	}
}
