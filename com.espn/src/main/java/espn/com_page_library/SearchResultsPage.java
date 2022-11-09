package espn.com_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy (xpath = "//ul[@class='player__Results']//a[@href]")
    public WebElement islamMakhachevLink;

    @FindBy (xpath = "//li[@class='player__Results__Item']//a[@href]")
    public WebElement lebronJamesLink;

    @FindBy (xpath = "//aside[@class='StatBlock br-5 ba overflow-hidden flex-expand StatBlock--multiple bg-clr-white brdr-clr-gray-06 PlayerHeader__StatBlock']/h2")
    public WebElement lebronJamesStatsHeading;

    public SearchResultsPage() {
        PageFactory.initElements(driver,this);
    }

    public AthletePage clickOnIslamMakhachev() {
        safeClickOnElement(islamMakhachevLink);

        return new AthletePage();
    }

    public AthletePage clickOnLebronJames() {
        safeClickOnElement(lebronJamesLink);

        return new AthletePage();
    }

    public String getLebronJamesStatsHeadingText() {
        return getTrimmedElementText(lebronJamesStatsHeading);
    }
}
