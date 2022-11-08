package shared.ui;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//li[@class='sports menu-nba']/a[@href]")
    public WebElement nbaButton;

    @FindBy (xpath = "//li[@class='sports menu-mlb']/a[@href]")
    public WebElement mlbButton;

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
}
