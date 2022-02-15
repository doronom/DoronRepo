package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage
{
    @FindBy(how = How.XPATH, using = "//input[@name = 'user']")
    public WebElement field_User;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement field_Password;

    @FindBy(how = How.XPATH, using = "//*[@class = 'btn btn-large p-x-2 btn-primary']")
    public WebElement btn_Login;

    @FindBy(how = How.XPATH, using = "//a[@class = 'btn btn-link']")
    public WebElement btn_Skip;

}
