package system.reviews;

import apartments.com_page_library.HomePage;
import apartments.com_page_library.PropertyPage;
import apartments.com_page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWriteReview extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testReviewDP")
    public void testWriteAReview(String searchTerm, String headline, String body, String buttonText) {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);
        PropertyPage propertyPage = searchResultsPage.clickOnProperty();
        propertyPage.getReviewModal();
        propertyPage.inputReview(headline, body);
        Assert.assertEquals(propertyPage.getSubmitReviewButtonText(), buttonText);
    }
}
