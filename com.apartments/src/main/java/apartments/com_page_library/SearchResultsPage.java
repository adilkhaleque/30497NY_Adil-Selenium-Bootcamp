package apartments.com_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

    @FindBy(id = "rentRangeLink")
    public WebElement priceDropdown;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minRentOptions js-minRentOptions active']//li[1]")
    public WebElement noMinPriceOption;

    @FindBy(xpath = "//ul[@id='maxRentOptions']/li[2]")
    public WebElement maxPriceOption;

    @FindBy(id = "bedRangeLink")
    public WebElement numOfBedsDropdown;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minBedOptions active']//li[1]")
    public WebElement noMinBedsOption;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='maxBedOptions active']//li[4]")
    public WebElement maxTwoBeds;

    @FindBy(id = "typeSelect")
    public WebElement typeDropdown;

    @FindBy(xpath = "//div[@class='drop-down-container mortar-wrapper active']//div[@data-value='1']/a")
    public WebElement typeOptionApartments;

    @FindBy(id = "lifestyleControl")
    public WebElement lifestyleDropdown;

    @FindBy(xpath = "//*[@id='lifestyleControl']/fieldset/span/span[1]/a")
    public WebElement lifestyleOptionStudent;

    @FindBy(id = "moveInLink")
    public WebElement moveInDateDropdown;

    @FindBy(xpath = "//div[@id='datepickerSearch']/div/div[1]/table/thead/tr[1]/th[2]")
    public WebElement nextMonthButton;

    @FindBy(xpath = "//div[@id='datepickerSearch']/div/div[1]/table/tbody/tr[2]/td[2]")
    public WebElement moveInDateSelection;

    @FindBy(id = "advancedFiltersIcon")
    public WebElement moreDropdown;

    @FindBy(id = "_baths")
    public WebElement anyBathsOption;

    @FindBy(xpath = "//*[@id='advancedFilterUnitAmenities']/li[1]/a")
    public WebElement airConditioning;

    @FindBy(xpath = "//*[@id='advancedFilterUnitAmenities']/li[2]/a")
    public WebElement washerAndDryer;

    @FindBy(id = "Specialties_128")
    public WebElement cheapAffordability;

    @FindBy(xpath = "//*[@id='advancedFilters']/section/button[2]")
    public WebElement doneButton;

    @FindBy(xpath = "//*[@id='advancedFilters']/section/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@id='placardContainer']/ul/li[1]/article/header/div[3]/a")
    public WebElement favoritesButton1;

    @FindBy(xpath = "//div[@id='placardContainer']/ul/li[2]/article/header/div[3]/a")
    public WebElement favoritesButton2;

    @FindBy(xpath = "//div[@id='notificationsFavorites']/i[1]")
    public WebElement seeFavoritesButton;

    @FindBy(id = "backToSearch")
    public WebElement backToSearchButton;

    @FindBy(xpath = "//div[@id='noFavoritesYetModal']/div/div/h3")
    public WebElement noFavoritesModalText;

    @FindBy(xpath = "//*[@id='placardContainer']/ul/li[2]/article/section/div/div[2]/div/div[1]/a/p[1]/span")
    public WebElement secondPropertyTitle;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnPriceDropdown() {
        safeClickOnElement(priceDropdown);
    }

    public String getPriceDropdownText() {
        return getTrimmedElementText(priceDropdown);
    }

    public void clickOnSelectors(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnSelectorOptions(WebElement element) {
        safeClickOnElement(element);
    }

    public void navigateToDate(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnDoneButton() {
        safeClickOnElement(doneButton);
    }

    public void clickOnSaveButton() {
        safeClickOnElement(saveButton);
    }

    public String getPropertyTitleText() {
        return getTrimmedElementText(secondPropertyTitle);
    }

    public void clickToAddFavorites(WebElement element) {
        safeClickOnElement(element);
    }

    public void doNarrowSearch() {
        clickOnSelectors(priceDropdown);
        clickOnSelectorOptions(noMinPriceOption);
        clickOnSelectorOptions(maxPriceOption);
        clickOnSelectors(typeDropdown);
        clickOnSelectorOptions(typeOptionApartments);
        clickOnSelectors(lifestyleDropdown);
        clickOnSelectorOptions(lifestyleOptionStudent);
        clickOnSelectors(moveInDateDropdown);
        navigateToDate(nextMonthButton);
        navigateToDate(nextMonthButton);
        clickOnSelectorOptions(moveInDateSelection);
        clickOnSelectors(moreDropdown);
        clickOnSelectorOptions(anyBathsOption);
        jsScrollDownUntilElementIsVisible(cheapAffordability);
        clickOnSelectorOptions(cheapAffordability);
        clickOnDoneButton();
    }

}
