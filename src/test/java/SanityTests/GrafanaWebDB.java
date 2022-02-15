package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import Utilities.listeners;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.class)
public class GrafanaWebDB extends CommonOps
{
    @Test(description = "Test 01: Login to Grafana with credentials from DB")
    @Description("Test Description: Login to Grafana with DB credentials")
    public void Test01_loginWithDBCredentials()
        {
            webFlows.loginDB();
            verifications.txtInElement(GrafanaHome.txt_Header, "Home Dashboard");
        }
}
