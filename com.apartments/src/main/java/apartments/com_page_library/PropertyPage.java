package apartments.com_page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage extends BasePage {
    @FindBy(id = "propertyName")
    public WebElement propertyName;

    public PropertyPage() {
        PageFactory.initElements(driver, this);
    }

    public String getPropertyName() {
        return getTrimmedElementText(propertyName);
    }
}
