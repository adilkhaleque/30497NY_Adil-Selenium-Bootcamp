package system.add_favorites;

import apartments.com_page_library.HomePage;
import apartments.com_page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFavorites extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testAddFavoritesDP")
    public void testAddFavorites(String searchTerm, String expectedCount) {
        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        searchResultsPage.doNarrowSearch();

        searchResultsPage.checkAddTwoFavorites();

        Assert.assertEquals(searchResultsPage.getCountOfFavoritesText(), expectedCount);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testRemoveFavoritesDP")
    public void testRemoveFavorites(String searchTerm, String expectedCount) {
        HomePage homePage = new HomePage();

        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);

        searchResultsPage.doNarrowSearch();

        searchResultsPage.removeOneFavorite();

        Assert.assertEquals(searchResultsPage.getCountOfFavoritesText(), expectedCount);
    }
}
