package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders extends BasePage {

    @DataProvider(name = "testLakersName")
    public Object[][] getLakersName() throws IOException {
        return excel.readStringArrays("LakersNameText");
    }

    @DataProvider(name = "testYankeesName")
    public Object[][] getYankeesName() throws IOException {
        return excel.readStringArrays("YankeesNameText");
    }
}
