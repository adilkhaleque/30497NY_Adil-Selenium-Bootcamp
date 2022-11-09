package espn.com_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class AthletePage extends SharedStepsUI {

    @FindBy(xpath = "//ul [@class='ui-tabs']//li[3]/a[@href]")
    public WebElement raceResultsTab;

    @FindBy (xpath = "//div[@id='my-players-table']//h2")
    public WebElement lewisHamiltonRaceResultsTitle;

    @FindBy (xpath = "//ul[@class='Nav__Secondary__Menu center flex items-center relative']//li[5]/a[@href]")
    public WebElement fightHistoryTab;

    @FindBy (xpath = "//div[@class='Wrapper Card__Content']/h2")
    public WebElement fightHistoryHeading;

    public AthletePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnRaceResultsTab() {
        safeClickOnElement(raceResultsTab);
    }
    public String getResultsTitleText() {
        return getTrimmedElementText(lewisHamiltonRaceResultsTitle);
    }

    public void clickOnFightHistoryTab() {
        safeClickOnElement(fightHistoryTab);
    }

    public String getFightHistoryHeadingText() {
        return getTrimmedElementText(fightHistoryTab);
    }
}
