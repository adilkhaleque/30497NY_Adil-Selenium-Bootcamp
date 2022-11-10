package system.stats;

import base.BasePage;
import espn.com_page_library.AthletePage;
import espn.com_page_library.HomePage;
import espn.com_page_library.SportsLeaguePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStats extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLewisStats")
    public void testViewLewisStats(String expected) {
        HomePage homePage = new HomePage();

        homePage.systemBar.clickOnF1();

        SportsLeaguePage sportsLeaguePage = new SportsLeaguePage();

        sportsLeaguePage.clickOnDriversButton();

        AthletePage athletePage = sportsLeaguePage.clickOnLewisHamilton();

        athletePage.clickOnRaceResultsTab();

        Assert.assertEquals(athletePage.getResultsTitleText(), expected);
    }
}
