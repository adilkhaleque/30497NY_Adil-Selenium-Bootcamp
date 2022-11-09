package espn.com_page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class TeamPage extends SharedStepsUI {

    @FindBy (xpath = "//ul[@class='Nav__Secondary__Menu center flex items-center relative']//li[4]/a")
    public WebElement lakersScheduleButton;

    @FindBy (xpath = "//div[@class='flex justify-between mt3 mb3 items-center']/h1")
    public WebElement lakersScheduleTitle;

    @FindBy (xpath = "//ul[@class='Nav__Secondary__Menu center flex items-center relative']//li[3]/a")
    public WebElement lakersStatsButton;

    @FindBy (xpath = "//div[@class='stats-header']//select[@class='dropdown__select']")
    public WebElement seasonDropdown;

    @FindBy (xpath = "//div[@class='stats-header']//select[@class='dropdown__select']//option[11]")
    public WebElement specificSeason;

    @FindBy (xpath = "//tbody[@class='Table__TBODY']//a[@href='https://www.espn.com/nba/player/_/id/110/kobe-bryant']")
    public WebElement kobeBryantLink;

    @FindBy (xpath = "//h1[@class='PlayerHeader__Name flex flex-column ttu fw-bold pr4 h2']/span[1]")
    public WebElement kobeBryantName;

    @FindBy (xpath = "//div[@class='DatePicker']//button[@aria-label='Calendar']")
    public WebElement calendarIcon;

    @FindBy (xpath = "//div[@class='DatePicker__MonthContainer calendar--embedded']//ul[1]//li[@data-idx='6']")
    public WebElement specificDayForNhlScores;

    @FindBy (xpath = "//header[@aria-label='Saturday, November 5, 2022']//h3")
    public WebElement nhlScoresDateHeading;

    public TeamPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLakersScheduleButton() {
        safeClickOnElement(lakersScheduleButton);
    }
    public String getLakersScheduleTitleText() {
        return getTrimmedElementText(lakersScheduleTitle);
    }

    public void clickOnLakersStatsButton() {
        safeClickOnElement(lakersStatsButton);
    }
    public void clickOnSeasonDropdown() {
        safeClickOnElement(seasonDropdown);
    }

    public void selectSeason(String seasonValue) {
        selectFromDropdownByValue(specificSeason, seasonValue);
    }

    public AthletePage clickOnKobeBryantLink() {
        safeClickOnElement(kobeBryantLink);

        return new AthletePage();
    }

    public String getKobeText() {
        return getTrimmedElementText(kobeBryantName);
    }

    public void clickOnCalendar() {
        safeClickOnElement(calendarIcon);
    }

    public void clickOnDayForNhlScores() {
        safeClickOnElement(specificDayForNhlScores);
    }

    public String getNhlScoresDateHeadingText() {
        return getTrimmedElementText(nhlScoresDateHeading);
    }

    public void getNhlScores() {
        clickOnCalendar();
        clickOnDayForNhlScores();
        getNhlScoresDateHeadingText();
    }

}
