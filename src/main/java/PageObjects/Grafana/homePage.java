package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage
{
    @FindBy(how = How.XPATH, using = "//div[@class = 'text-center dashboard-header']/span")
    public WebElement txt_Header;
}
