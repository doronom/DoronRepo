package PageObjects.NopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class apparelMenu
{
    @FindBy(how = How.XPATH, using = "//a[@href='/camera-photo']")
    public WebElement subMenu_Shoes;

    @FindBy(how = How.XPATH, using = "//a[@href='/cell-phones']")
    public WebElement subMenu_Clothing ;

    @FindBy(how = How.XPATH, using = "//a[@href='/others']")
    public WebElement subMenu_Accessories;
}
