package espn.com_page_library;

import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class HomePage extends SharedStepsUI {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
