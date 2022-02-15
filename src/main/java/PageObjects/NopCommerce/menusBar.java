package PageObjects.NopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class menusBar
{
    @FindBy(how = How.XPATH, using = "//*[@href='/computers']")
    public WebElement topMenu_computers;

    @FindBy(how = How.XPATH, using = "//*[@href='/electronics']")
    public WebElement topMenu_electronics;

    @FindBy(how = How.XPATH, using = "//*[@href='/apparel']")
    public WebElement topMenu_apparel;

    @FindBy(how = How.XPATH, using = "//*[@href='/digital-downloads']")
    public WebElement topMenu_digitalDownloads;

    @FindBy(how = How.XPATH, using = "//*[@href='/books']")
    public WebElement topMenu_books;

    @FindBy(how = How.XPATH, using = "//*[@href='/jewelry']")
    public WebElement topMenu_jewelry;

    @FindBy(how = How.XPATH, using = "//*[@href='/gift-cards']")
    public WebElement topMenu_giftCards;
}
