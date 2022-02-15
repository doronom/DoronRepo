package PageObjects.NopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DigitalStormPcPage
{
    @FindBy(how = How.XPATH, using = "//div/span[@content='1259.00']")
    public WebElement price_DigitalStorm;
}
