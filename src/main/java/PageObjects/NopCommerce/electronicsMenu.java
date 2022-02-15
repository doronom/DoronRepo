package PageObjects.NopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class electronicsMenu
{
    @FindBy(how = How.XPATH, using = "//a[@href='/camera-photo']")
    public WebElement subMenu_CameraAndPhoto;

    @FindBy(how = How.XPATH, using = "//a[@href='/cell-phones']")
    public WebElement subMenu_CellPhones;

    @FindBy(how = How.XPATH, using = "//a[@href='/others']")
    public WebElement subMenu_Others;

}
