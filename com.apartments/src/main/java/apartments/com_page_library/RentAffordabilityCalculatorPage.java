package apartments.com_page_library;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentAffordabilityCalculatorPage extends BasePage {

    @FindBy(id = "your-information")
    public WebElement calculateMyRentHeading;

    @FindBy(id = "monthlyIncome")
    public WebElement monthlyIncomeField;

    @FindBy(id = "sliderInput")
    public WebElement percentageIncomeSlider;

    @FindBy(id = "searchBarLookup")
    public WebElement locationSearchBar;

    @FindBy(id = "searchButton")
    public WebElement searchButton;

    @FindBy(id = "income-percentage-label")
    public WebElement sliderPercentage;

    public RentAffordabilityCalculatorPage() {
        PageFactory.initElements(driver, this);
    }

    public void inputMonthlyIncome(String monthlyIncome) {
        sendKeysToElement(monthlyIncomeField,monthlyIncome);
    }

    public void setPercentageIncomeForRent(int incomePercentage) {
        if (incomePercentage >= 10 && incomePercentage <= 50) {
            Actions actions = new Actions(driver);
            actions.clickAndHold(percentageIncomeSlider).build().perform();

            while (Integer.parseInt(driver.findElement(By.id("income-percentage-label")).getText().substring(0, 2)) > incomePercentage) {
                //actions.moveToElement(driver.findElement(By.id("income-percentage-label"))).click().perform();
                //actions.moveByOffset(-15, 0).build().perform();
                for (int i = 1; i <= 15 ; i++) {
                    percentageIncomeSlider.sendKeys(Keys.ARROW_LEFT);
                }
            }
            //actions.release(percentageIncomeSlider).build().perform();
        }
    }

    public void inputLocation(String location) {
        sendKeysToElement(locationSearchBar, location);
    }

    public SearchResultsPage clickOnSearchButton() {
        safeClickOnElement(searchButton);

        return new SearchResultsPage();
    }

    public SearchResultsPage findAffordableRentals(String monthlyIncome, int incomePercentage, String location) {
        jsScrollUntilElementIsVisible(calculateMyRentHeading);
        inputMonthlyIncome(monthlyIncome);
        setPercentageIncomeForRent(incomePercentage);
        inputLocation(location);
        clickOnSearchButton();

        return new SearchResultsPage();
    }


}
