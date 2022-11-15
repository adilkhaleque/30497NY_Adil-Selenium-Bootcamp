package system.renter_tools;

import apartments.com_page_library.HomePage;
import apartments.com_page_library.PropertyPage;
import apartments.com_page_library.RentAffordabilityCalculatorPage;
import apartments.com_page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRentCalculator extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testRentCalculatorDP")
    public void testFindRentals(String monthlyIncome, String incomePercentage, String location, String locationText) {
        HomePage homePage = new HomePage();
        RentAffordabilityCalculatorPage rentAffordabilityCalculatorPage = homePage.navigateToRentCalculatorPage();
        SearchResultsPage searchResultsPage = rentAffordabilityCalculatorPage.findAffordableRentals(monthlyIncome, Integer.parseInt(incomePercentage), location);
        PropertyPage propertyPage = searchResultsPage.clickOnWallStreetProperty();

        Assert.assertEquals(propertyPage.getPropertyNameText(), locationText);
    }
}
