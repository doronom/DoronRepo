package WorkFlows;

import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class calculatorFlow extends CommonOps
{
    @Step("Calculate Addition sanity example: 25 + 45")
    public static void calcAddition()
    {
        uiActions.click(calcMain.btn_Clear);
        uiActions.click(calcMain.btn_Two);
        uiActions.click(calcMain.btn_Five);
        uiActions.click(calcMain.btn_Plus);
        uiActions.click(calcMain.btn_Four);
        uiActions.click(calcMain.btn_Five);
        uiActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Subtraction sanity example: 51 - 42")
    public static void calcSubtraction()
    {
        uiActions.click(calcMain.btn_ClearScreen);
        uiActions.click(calcMain.btn_Five);
        uiActions.click(calcMain.btn_One);
        uiActions.click(calcMain.btn_Sub);
        uiActions.click(calcMain.btn_Four);
        uiActions.click(calcMain.btn_Two);
        uiActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Multiplication sanity example: 15x4")
    public static void calcMultiplication()
    {
        uiActions.click(calcMain.btn_ClearScreen);
        uiActions.click(calcMain.btn_One);
        uiActions.click(calcMain.btn_Five);
        uiActions.click(calcMain.btn_Multiply);
        uiActions.click(calcMain.btn_Four);
        uiActions.click(calcMain.btn_Equals);
    }

    @Step("Calculate Division sanity example: 150:15")
    public static void calcDivision()
    {
        uiActions.click(calcMain.btn_ClearScreen);
        uiActions.click(calcMain.btn_One);
        uiActions.click(calcMain.btn_Five);
        uiActions.click(calcMain.btn_Zero);
        uiActions.click(calcMain.btn_Div);
        uiActions.click(calcMain.btn_One);
        uiActions.click(calcMain.btn_Five);
        uiActions.click(calcMain.btn_Equals);
    }
}
