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
}
