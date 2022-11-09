package espn.com_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class SportsLeaguePage extends SharedStepsUI {
    @FindBy (xpath = "//ul[@class='first-group']//li[@class='sub']/a[@href and @name='&lpos=subnav+subnav_f1_drivers']")
    public WebElement f1DriverButton;

    @FindBy (xpath = "//tbody//tr[10]//a[@href]")
    public WebElement lewisHamiltonLink;

    @FindBy (xpath = "//div[@id='my-players-table']//h2")
    public WebElement lewisHamiltonRaceResultsTitle;

    public SportsLeaguePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnDriversButton() {
        safeClickOnElement(f1DriverButton);
    }

    public AthletePage clickOnLewisHamilton() {
        jsScrollDownUntilElementIsVisible(lewisHamiltonLink);
        safeClickOnElement(lewisHamiltonLink);

        return new AthletePage();
    }

    public String getResultsTitleText() {
        return getTrimmedElementText(lewisHamiltonRaceResultsTitle);
    }


}
