package system.schedule;

import base.BasePage;
import espn.com_page_library.HomePage;
import espn.com_page_library.SportsLeaguePage;
import espn.com_page_library.TeamPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSchedule extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLakersSchedule")
    public void testViewLakersSchedule(String expected) {
        HomePage homePage = new HomePage();

        TeamPage teamPage = homePage.systemBar.navigateToLakersPage();

        teamPage.clickOnLakersScheduleButton();

        Assert.assertEquals(teamPage.getLakersScheduleTitleText(), expected);

    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testWorldCupSchedule")
    public void testViewWorldCupFixture(String expected) {
        HomePage homePage = new HomePage();

        SportsLeaguePage sportsLeaguePage = homePage.systemBar.clickOnWorldCupButton();

        sportsLeaguePage.clickOnFixturesButton();

        sportsLeaguePage.clickOnWorldCupDate();

        Assert.assertEquals(sportsLeaguePage.getWorldCupDateHeadingText(), expected);
    }
}
