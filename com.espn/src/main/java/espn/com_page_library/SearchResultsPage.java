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

}
