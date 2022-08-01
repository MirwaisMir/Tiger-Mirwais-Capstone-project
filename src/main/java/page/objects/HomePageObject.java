package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement CurrencyLink;
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/ul/li[1]/button")
	private WebElement EuroCurrencydropDwon;
	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']//span[@class='hidden-xs hidden-sm hidden-md']")
	private WebElement EurosignTextCurrency;
    @FindBy(xpath="//span[text()='Shopping Cart']")
    private WebElement shoppingCarLink;
    @FindBy(id="content")
    private WebElement shoppinemptyTextOnUI;
	public void clickOnCurrencyLink() {
		CurrencyLink.click();
	}

	public void clickOnEuroDropDwon() {
		EuroCurrencydropDwon.click();

	}

	public void EuroCurrencyTextOnUI() {
		EurosignTextCurrency.isDisplayed();
	}
	public void clickOnShoppingCartLink() {
		shoppingCarLink.click();
	}
	public void shoppingCartTextOnUI() {
		shoppinemptyTextOnUI.isDisplayed();
	}
}