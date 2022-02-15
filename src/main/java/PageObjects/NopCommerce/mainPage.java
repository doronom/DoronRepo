package PageObjects.NopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='topic-block-title']/h2")
    public WebElement txt_nopCommerce;

    @FindBy(how = How.XPATH, using = "//input[@class='search-box-text ui-autocomplete-input']")
    public WebElement txt_Search;

    @FindBy(how = How.XPATH, using = "//input[@class='button-1 search-box-button']")
    public WebElement btn_Search;

    @FindBy(how = How.XPATH, using ="//a/img[@src='//demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']")
    public WebElement icn_nopCommerce;
}
