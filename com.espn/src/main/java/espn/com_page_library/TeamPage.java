package espn.com_page_library;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class TeamPage extends SharedStepsUI {


    public TeamPage() {
        PageFactory.initElements(driver, this);
    }


}
