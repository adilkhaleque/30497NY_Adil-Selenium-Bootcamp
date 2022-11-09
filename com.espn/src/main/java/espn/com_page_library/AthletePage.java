package espn.com_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class AthletePage extends SharedStepsUI {

    @FindBy(xpath = "//ul [@class='ui-tabs']//li[3]/a[@href]")
    public WebElement raceResultsTab;

    public AthletePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnRaceResultsTab() {
        safeClickOnElement(raceResultsTab);
    }
}
