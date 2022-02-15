package WorkFlows;

import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class mobileFlows extends CommonOps
{
    @Step("Fill-in mortgage form and calculate repayment")
    public static void calculate(String amount, String term, String rate)
    {
        uiActions.updateTxt(mortgageMain.txt_Amount, amount);
        uiActions.updateTxt(mortgageMain.txt_Term, term);
        uiActions.updateTxt(mortgageMain.txt_Rate, rate);
        uiActions.click(mortgageMain.btn_Calculate);
    }
}
