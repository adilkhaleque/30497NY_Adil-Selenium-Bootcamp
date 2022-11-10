package system.mma_rankings;

import base.BasePage;
import espn.com_page_library.HomePage;
import espn.com_page_library.SportsLeaguePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestViewRankings extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testP4pRankings")
    public void testMmaRankings(String expected) {
        HomePage homePage = new HomePage();

        SportsLeaguePage sportsLeaguePage = homePage.systemBar.clickOnMmaButton();

        sportsLeaguePage.clickP4pTab();

        Assert.assertEquals(sportsLeaguePage.getNumberOneFighterText(), expected);

    }
}
