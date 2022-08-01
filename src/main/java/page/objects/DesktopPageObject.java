package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement Desktops;

	@FindBy(xpath = "//a[text()= 'Show All Desktops']")
	private WebElement ShowAllDesktoplink;

	@FindBy(tagName = "img")
	private List<WebElement> allElements;

	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement HPLP3065;
	@FindBy(id = "input-quantity")
	private WebElement quantityOne;
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private String successMessage;
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonCameralink;
	@FindBy(xpath = "//option[@value='15']")
	private WebElement selectRedColor;
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement CanonEos5DCamera;
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement reviewlink;
	@FindBy(id = "input-name")
	private WebElement nameField;
	@FindBy(id = "input-review")
	private WebElement enterReview;
	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> ratingButton;
	@FindBy(id = "button-review")
	private WebElement ContinueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private String SuccessMessages;

	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(Desktops).build().perform();
	}

	public void ClickOnShowAllDesktops() {
		ShowAllDesktoplink.click();

	}

	public List<WebElement> DeskTopAllItems() {
		List<WebElement> items = allElements;
		return items;
	}

	public void ClickonHPLP3065loptop() {
		HPLP3065.click();
	}

	public void Selectquantityone(String quantityValue) {
		quantityOne.clear();
		quantityOne.sendKeys(quantityValue);

	}

	public void ClickOnAddToCartButton() {
		addToCartButton.click();
	}

	public String successMessage() {
		return successMessage;
	}

	public void ClickOnCanonCamraLink() {
		canonCameralink.click();
	}

	public void selectColorRed() {
		selectRedColor.click();
	}

	public void ClickOncanonEos5Dcamera() {
		CanonEos5DCamera.click();

	}

	public void ClickOnReviewlink() {
		reviewlink.click();
	}

	public void EnterName(String Name) {
		nameField.sendKeys(Name);
	}

	public void EnterYourReview(String Review) {
		enterReview.sendKeys(Review);
	}

	public void SelectRating(String RatingValue) {
		List<WebElement> RatingElement = ratingButton;
		for (WebElement Element : RatingElement) {
			if (Element.getAttribute("value").equalsIgnoreCase(RatingValue.trim())) {
				Element.click();
				break;
			}
		}
	}

	public void ClickOnContinueButton() {
		ContinueButton.click();
	}

	public String SucessMessageDisplayed() {
		return SuccessMessages;
	}
}
