package parabank_app_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountServicesPage extends BasePage {

    @FindBy(css = "#rightPanel p")
    public WebElement accountRegistrationMessageText;

    public AccountServicesPage() {
        PageFactory.initElements(driver, this);
    }

    public String getAccountRegistrationMessage() {
        return getTrimmedElementText(accountRegistrationMessageText);
    }
}
