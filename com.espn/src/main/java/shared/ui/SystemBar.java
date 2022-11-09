package shared.ui;

import base.BasePage;
import espn.com_page_library.SearchResultsPage;
import espn.com_page_library.SportsLeaguePage;
import espn.com_page_library.TeamPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    public void selectTeam(List<WebElement> elements, int teamIndex) {
        try {
            getTrimmedElementText(elements.get(teamIndex));
        } catch (IndexOutOfBoundsException e) {
            getTrimmedElementText(elements.get(elements.size() - 1));
        }
    }

    public TeamPage clickOnTeam(WebElement element) {
        safeClickOnElement(element);

        return new TeamPage();
    }

    public SportsLeaguePage clickOnOtherLeagues(WebElement element) {
        hoverOverElement(moreButton);
        safeClickOnElement(element);

        return new SportsLeaguePage();
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public void inputSearchTerm(String searchTerm) {
        sendKeysToElement(searchField, searchTerm);
    }

    public void extractNBATeamNames() {
        hoverOverElement(nbaButton);
        selectTeam(pacificTeams, pacificTeams.size());
    }

    public void extractMLBTeamNames() {
        hoverOverElement(mlbButton);
        selectTeam(americanLeagueEastTeams, americanLeagueEastTeams.size());
    }

    public TeamPage navigateToLakersPage() {
        hoverOverElement(nbaButton);
        clickOnTeam(lakersButton);

        return new TeamPage();
    }

    public SportsLeaguePage clickOnF1() {
        clickOnOtherLeagues(f1Button);

        return new SportsLeaguePage();
    }

    public SearchResultsPage doSearch(String searchTerm) {
        clickOnSearchButton();
        inputSearchTerm(searchTerm);
        clickOnSearchButton();

        return new SearchResultsPage();
    }

}
