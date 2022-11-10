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

    @DataProvider(name = "testLakersSchedule")
    public Object[][] getLakersSchedule() {
        return excel.readStringArrays("LakersScheduleTitle");
    }

    @DataProvider(name = "testLewisStats")
    public Object[][] getLewisStats() {
        return excel.readStringArrays("LHRaceResults");
    }

    @DataProvider(name = "testLakersStats")
    public Object[][] getLakersStats() {
        return excel.readStringArrays("LakersSeasonValue");
    }

    @DataProvider(name = "testWorldCupSchedule")
    public Object[][] getWorldCupFixture() {
        return excel.readStringArrays("WorldCupDate");
    }
}
