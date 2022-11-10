package system.schedule;

import base.BasePage;
import espn.com_page_library.HomePage;
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
}
