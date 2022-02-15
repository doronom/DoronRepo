package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import Utilities.listeners;
import WorkFlows.electronFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.class)
public class electronDemo extends CommonOps
{
    @Test(description = "Test 01: Verify screen resolution")
    @Description("Test Description: Get screen resolution and verify")
    public void Test01_getScreenInfo()
    {
        electronFlow.getScreenInfo();
        verifications.txtInElement(electronMain.filed_screenInfo,"Your screen is: 1920px x 1080px");
    }
}
