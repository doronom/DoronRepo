package PageObjects.Mortgage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how = How.XPATH, using = "//*[@id='etAmount']")
    public WebElement txt_Amount;

    @FindBy(how = How.XPATH, using = "//*[@id='etTerm']")
    public WebElement txt_Term;

    @FindBy(how = How.XPATH, using = "//*[@id='etRate']")
    public WebElement txt_Rate;

    @FindBy(how = How.XPATH, using = "//*[@text='Calculate']")
    public WebElement btn_Calculate;

    @FindBy(how = How.ID, using = "tvRepayment")
    public WebElement txt_Repayment;

    @FindBy(how = How.ID, using = "tvInterestOnly")
    public WebElement txt_InterestOnly;
}
