package shared.ui;

import base.BasePage;
import espn.com_page_library.SearchResultsPage;
import espn.com_page_library.TeamPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.ListIterator;

public class SystemBar extends BasePage {

    @FindBy (xpath = "//li[@class='sports menu-nhl']/a[@href]")
    public WebElement nhlButton;
    @FindBy (xpath = "//li[@class='sports menu-nba']/a[@href]")
    public WebElement nbaButton;

    @FindBy (xpath = "//li[@class='teams nba']//ul[5]//li[@class='team']//span[@class='link-text']")
    public List<WebElement> pacificTeams;
    @FindBy (xpath = "//li[@class='teams nba']//ul[5]//li[@class='team']//a[@data-teamid='13']")
    public WebElement lakersButton;

    @FindBy (xpath = "//li[@class='sports menu-mlb']/a[@href]")
    public WebElement mlbButton;

    @FindBy (xpath = "//li[@class='teams mlb']//ul[1]//li[@class='team']//span[@class='link-text']")
    public List<WebElement> americanLeagueEastTeams;

    @FindBy (xpath = "//li[@class='sports menu-soccer']/a[@href]")
    public WebElement soccerButton;

    @FindBy (xpath = "//li[@class='none more']/a[@href]")
    public WebElement moreButton;

    @FindBy (xpath = "//li[@class='sports menu-mma']/a[@href]")
    public WebElement mmaButton;

    @FindBy (xpath = "//li[@class='sports menu-f1']/a[@href]")
    public WebElement f1Button;

    @FindBy (xpath = "//li[@class='sports menu-wwe']/a[@href]")
    public WebElement wweButton;

    @FindBy (id = "global-search-trigger")
    public WebElement searchButton;

    @FindBy (id = "global-search-input")
    public WebElement searchField;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public boolean areEqualLists (List<WebElement> elements, List<Object> data) {
        if (elements.equals(data)) {
            return true;
        }
        return false;
    }

    public String getTextFromListOfTeams(List<WebElement> elements) {
        for (WebElement team : elements) {
            getTrimmedElementText(team);
        }
        return null;
    }
    public void clickOnTeam(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public void inputSearchTerm(String searchTerm) {
        sendKeysToElement(searchField, searchTerm);
    }

    public SearchResultsPage doSearch(String searchTerm) {
        clickOnSearchButton();
        inputSearchTerm(searchTerm);
        clickOnSearchButton();

        return new SearchResultsPage();
    }

    public TeamPage navigateToLakersPage() {
        hoverOverElement(nbaButton);
        safeClickOnElement(lakersButton);

        return new TeamPage();
    }


}
