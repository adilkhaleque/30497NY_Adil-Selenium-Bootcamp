package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testBasicSearch")
    public Object[][] getSimpleSearchTerm() {
        return excel.readStringArrays("BasicSearch");
    }

    @DataProvider(name = "testDetailedSearch")
    public Object[][] getSecondSearchTerm() {
        return excel.readStringArrays("DetailedSearch");
    }

    @DataProvider(name = "testAddFavoritesDP")
    public Object[][] getFavorites() {
        return excel.readStringArrays("NumOfFavorites");
    }

    @DataProvider(name = "testRemoveFavoritesDP")
    public Object[][] getOneFavorite() {
        return excel.readStringArrays("OneFavorite");
    }
}
