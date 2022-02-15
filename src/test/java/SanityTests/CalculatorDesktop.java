package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import Utilities.listeners;
import WorkFlows.calculatorFlow;
import WorkFlows.electronFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;

@Listeners(listeners.class)
public class CalculatorDesktop extends CommonOps
{
    @Test(description = "Test 01: Verify Addition calculation")
    @Description("Test Description: Get addition calculation and verify the result")
    public void Test01_getAddition()
    {
        calculatorFlow.calcAddition();
        verifications.txtInElement(calcMain.field_results,"70");
    }

    @Test(description = "Test 02: Verify Subtraction calculation")
    @Description("Test Description: Get subtraction calculation and verify the result")
    public void Test02_getSubtraction()
    {
        calculatorFlow.calcSubtraction();
        verifications.txtInElement(calcMain.field_results,"9");
    }

    @Test(description = "Test 03: Verify Multiplication calculation")
    @Description("Test Description: Get multiplication calculation and verify the result")
    public void Test03_getMultiplication()
    {
        calculatorFlow.calcMultiplication();
        verifications.txtInElement(calcMain.field_results,"60");
    }

    @Test(description = "Test 04: Verify Division calculation")
    @Description("Test Description: Get division calculation and verify the result")
    public void Test04_getDivision()
    {
        calculatorFlow.calcDivision();
        verifications.txtInElement(calcMain.field_results,"10");
    }
}
