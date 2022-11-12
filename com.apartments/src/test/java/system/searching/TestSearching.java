package system.searching;

import apartments.com_page_library.HomePage;
import apartments.com_page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearching extends BasePage {
    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "testBasicSearch")
    public void testSearchFunctionality(String expected, String expectedText) {
        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.doSearch(expected);

        Assert.assertEquals(searchResultsPage.getPriceDropdownText(), expectedText);
    }
}
