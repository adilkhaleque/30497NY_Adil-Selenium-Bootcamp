package espn.com_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class SportsLeaguePage extends SharedStepsUI {
    @FindBy (xpath = "//*[@id='global-nav-secondary']/div/ul/li[8]/a")
    public WebElement f1DriverButton;

    @FindBy (xpath = "//tbody//tr[10]//a[@href]")
    public WebElement lewisHamiltonLink;

    @FindBy (xpath = "//*[@id='global-nav-secondary']/div/ul/li[5]/a")
    public WebElement fixturesButton;

    @FindBy (xpath = "//div[@data-id='20221122']/a")
    public WebElement specificWorldCupDate;

    @FindBy (xpath = "//div[@id='sched-container']//span[@class='table-container']/h2")
    public WebElement dateHeading;

    @FindBy (xpath = "//ul[@class='first-group']//li[6]/a[@href]")
    public WebElement wweTitleHistoryTab;

    @FindBy (xpath = "//*[@id='article-feed']/article[1]/div/div[2]/h3[2]/a")
    public WebElement wweTitleHistoryArticleLink;

    @FindBy (xpath = "//aside[@class='inline inline-table']//tr[1]//td[1]//a[@href]")
    public WebElement brockLesnarLink;

    @FindBy (xpath = "//*[@id='global-nav-secondary']/div/ul/li[5]/a")
    public WebElement p4pTab;

    @FindBy (linkText = "Alexander Volkanovski")
    public WebElement numberOneFighter;

    public SportsLeaguePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnDriversButton() {
        safeClickOnElement(f1DriverButton);
    }

    public void clickOnFixturesButton() {
        safeClickOnElement(fixturesButton);
    }

    public void clickOnWorldCupDate() {
        safeClickOnElement(specificWorldCupDate);
    }

    public String getWorldCupDateHeadingText() {
        return getTrimmedElementText(dateHeading);
    }

    public void clickOnWweTitleHistory() {
        safeClickOnElement(wweTitleHistoryTab);
    }

    public void clickOnWweTitleHistoryArticle() {
        jsScrollDownUntilElementIsVisible(wweTitleHistoryArticleLink);
        safeClickOnElement(wweTitleHistoryArticleLink);
    }

    public String getBrockLesnarText() {
        return getTrimmedElementText(brockLesnarLink);
    }

    public void clickP4pTab() {
        safeClickOnElement(p4pTab);
    }

    public String getNumberOneFighterText() {
        jsScrollDownUntilElementIsVisible(numberOneFighter);
        return getTrimmedElementText(numberOneFighter);
    }

    public AthletePage clickOnLewisHamilton() {
        clickOnDriversButton();
        jsScrollDownUntilElementIsVisible(lewisHamiltonLink);
        safeClickOnElement(lewisHamiltonLink);

        return new AthletePage();
    }

    public void getNumberOneP4p() {
        clickP4pTab();
        getNumberOneFighterText();
    }

}
