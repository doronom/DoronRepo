package PageObjects.NopCommerce;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

public class loginTab
{
    @FindBy(how = How.XPATH, using = "//input[@class='email']")
    public WebElement txt_loginEmail;

    @FindBy(how = How.XPATH, using = "//input[@class='password']")
    public WebElement txt_Password;

    @FindBy(how = How.XPATH, using = "//input[@class='button-1 login-button']")
    public WebElement btn_login;
}
