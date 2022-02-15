package WorkFlows;

import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.mozilla.javascript.tools.shell.QuitAction;
import org.openqa.selenium.WebElement;

public class electronFlow extends CommonOps
{
    @Step("Get screen info")
    public static void getScreenInfo()
    {
        uiActions.click(electronMain.btn_windows);
        uiActions.click(electronMain.btn_sysInfo);
        uiActions.click(electronMain.btn_demoToggle);
        uiActions.click(electronMain.btn_demoToggle);
        uiActions.click(electronMain.btn_viewDemo);
    }
}
