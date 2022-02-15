package PageObjects.NopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class computersMenu
{
    @FindBy(how = How.XPATH, using = "//a[@href='/desktops']")
    public WebElement subMenu_desktops;

    @FindBy(how = How.XPATH, using = "//a[@href='/notebooks']")
    public WebElement subMenu_notebooks;

    @FindBy(how = How.XPATH, using = "//a[@href='/software']")
    public WebElement subMenu_software;
}
