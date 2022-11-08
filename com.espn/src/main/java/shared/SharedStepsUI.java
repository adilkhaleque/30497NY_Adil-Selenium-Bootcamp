package shared;

import base.BasePage;
import shared.ui.SystemBar;

public class SharedStepsUI extends BasePage {

    public SystemBar systemBar;

    public SharedStepsUI() {
        this.systemBar = new SystemBar();
    }
}
