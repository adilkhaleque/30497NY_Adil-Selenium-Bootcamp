package system.wwe_history;

import base.BasePage;
import espn.com_page_library.HomePage;
import espn.com_page_library.SportsLeaguePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestViewWweChampionshipHistory extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testWweChampionshipHistory")
    public void testWweChampionshipHistory(String expected) {
        HomePage homePage = new HomePage();

        SportsLeaguePage sportsLeaguePage = homePage.systemBar.clickOnWweButton();

        sportsLeaguePage.clickOnWweTitleHistory();

        sportsLeaguePage.clickOnWweTitleHistoryArticle();

        Assert.assertEquals(sportsLeaguePage.getBrockLesnarText(), expected);

    }
}
