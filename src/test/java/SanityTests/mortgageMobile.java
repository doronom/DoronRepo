package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import Utilities.listeners;
import WorkFlows.mobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.class)
public class mortgageMobile extends CommonOps
{
    @Test(description = "Test 01: Verify mortgage calculation")
    @Description("Test Description: fill the form fields and calculate repayment")
    public void Test01_verifyRepayment()
    {
        mobileFlows.calculate("10000", "3", "4");
        verifications.txtInElement(mortgageMain.txt_Repayment,"£300.29");
    }

    @Test(description = "Test 02: Verify mortgage interest only")
    @Description("Test Description: fill the form fields and get mortgage interest")
    public void Test02_verifyInterest()
    {
        mobileFlows.calculate("10000", "3", "4");
        verifications.txtInElement(mortgageMain.txt_InterestOnly,"£33.33");
    }
}