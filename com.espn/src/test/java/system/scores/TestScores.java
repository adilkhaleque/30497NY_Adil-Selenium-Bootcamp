package system.scores;

import base.BasePage;
import espn.com_page_library.HomePage;
import espn.com_page_library.SportsLeaguePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScores extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNhlScores")
    public void testNhlScores(String expected) {
        HomePage homePage = new HomePage();

        SportsLeaguePage sportsLeaguePage = homePage.systemBar.clickOnNhlScoresButton();

        sportsLeaguePage.getNhlScores();

        Assert.assertEquals(sportsLeaguePage.getNhlScoresDateHeadingText(), expected);
    }
}
