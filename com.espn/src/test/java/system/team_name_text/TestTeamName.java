package system.team_name_text;

import base.BasePage;
import espn.com_page_library.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTeamName extends BasePage {

    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLakersName")
    public void testLakersText(String expected) {
        HomePage homePage = new HomePage();

        hoverOverElement(homePage.systemBar.nbaButton);

        Assert.assertEquals(homePage.systemBar.getLakersText(), expected);

    }

    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "testYankeesName")
    public void testYankeesText(String expected) {
        HomePage homePage = new HomePage();

        hoverOverElement(homePage.systemBar.mlbButton);

        Assert.assertEquals(homePage.systemBar.getYankeesText(), expected);

    }
}
