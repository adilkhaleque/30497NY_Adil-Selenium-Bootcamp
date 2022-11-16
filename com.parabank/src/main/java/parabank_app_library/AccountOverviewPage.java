package parabank_app_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountOverviewPage extends BasePage {

    @FindBy(css = "#leftPanel p")
    public WebElement accountNameHeader;

    public AccountOverviewPage() {
        PageFactory.initElements(driver, this);
    }

    public String getLoggedInAs() {
        return getTrimmedElementText(accountNameHeader);
    }
}
