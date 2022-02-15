package Helpers;
import Utilities.helpersMethods;
import Utilities.CommonOps;
import WorkFlows.webFlows;
import org.testng.annotations.Test;

public class visualTesting extends CommonOps
{
    //Login to NopCommerce web site and take a screenshot of the logo in the main page
    @Test
    public void takeScreenShot()
    {
        webFlows.login("domer@illusivenetworks.com", "doronNopcom1234$");
        helpersMethods.takeElementScreenShot(nopCommerceMain.icn_nopCommerce, "nopCommerceLogo");
    }
}
