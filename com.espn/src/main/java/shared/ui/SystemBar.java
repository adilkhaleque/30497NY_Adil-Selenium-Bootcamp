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

    @FindBy (xpath = "//li[@class='sports menu-nhl']//li[2]/a[@href]")
    public WebElement nhlScoresButton;

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

    @FindBy (xpath = "//li[@class='teams soccer']//li[2]/a[@href and @name='&lpos=subnav+subnav__team_fifa_world_cup']")
    public WebElement worldCupButton;

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

    @FindBy (xpath = "//li[@class='user']/a[@href]")
    public WebElement accountIcon;

    @FindBy (xpath = "//div[@class='current-favorites']//a")
    public WebElement addFavoritesButton;

    @FindBy (id = "favorites-manager-iframe")
    public WebElement myFavoritesIFrame;

    @FindBy (xpath = "//ul[@class='FavMgmt__Section']//li[3]//button[@class='Button Button--sm Button--alt']")
    public WebElement followNbaButton;

    @FindBy (xpath = "//section[@class='FavMgmt__Col FavMgmt__Col--Right flex flex-column']//ul[3]//button[@class='Button Button--sm Button--alt']")
    public WebElement unfollowNbaButton;

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

    public SportsLeaguePage clickOnWorldCupButton() {
        hoverOverElement(soccerButton);
        safeClickOnElement(worldCupButton);

        return new SportsLeaguePage();
    }

    public SportsLeaguePage clickOnWweButton() {
        clickOnOtherLeagues(wweButton);

        return new SportsLeaguePage();
    }

    public SportsLeaguePage clickOnMmaButton() {
        clickOnOtherLeagues(mmaButton);

        return new SportsLeaguePage();
    }

    public void clickOnAddFavoritesButton() {
        safeClickOnElement(addFavoritesButton);
    }

    public void clickOnNbaFollowButton() {
        safeClickOnElement(followNbaButton);
    }

    public SportsLeaguePage clickOnNhlScoresButton() {
        hoverOverElement(nhlButton);
        safeClickOnElement(nhlScoresButton);

        return new SportsLeaguePage();
    }

    public SearchResultsPage doSearch(String searchTerm) {
        clickOnSearchButton();
        inputSearchTerm(searchTerm);
        clickOnSearchButton();

        return new SearchResultsPage();
    }

    public void addFavorites() {
        hoverOverElement(accountIcon);
        clickOnAddFavoritesButton();
        switchToIFrame(myFavoritesIFrame);
        clickOnNbaFollowButton();
    }

    public String getUnfollowFavoritesText() {
        return getTrimmedElementText(unfollowNbaButton);
    }

}
