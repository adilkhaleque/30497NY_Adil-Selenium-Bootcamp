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

    public TeamPage() {
        PageFactory.initElements(driver, this);
    }

    public String getLakersScheduleTitleText() {
        return getTrimmedElementText(lakersScheduleTitle);
    }



}
