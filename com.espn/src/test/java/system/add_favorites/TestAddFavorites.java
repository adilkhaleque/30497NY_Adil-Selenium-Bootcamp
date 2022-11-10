package system.add_favorites;

import base.BasePage;
import espn.com_page_library.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddFavorites extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testAddFavorites")
    public void testAddFavorites(String expected) {
        HomePage homePage = new HomePage();

        homePage.systemBar.addFavorites();

        Assert.assertEquals(homePage.systemBar.getUnfollowFavoritesText(), expected);

    }
}
