package PageObjects.NopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class desktopsPage
{
    @FindBy(how = How.TAG_NAME, using = "h1")
    public WebElement txt_desktops;

    @FindBy(how = How.ID, using = "products-orderby")
    public WebElement txt_Sort;

    @FindBy(how = How.ID, using = "products-pagesize")
    public WebElement txt_DisplayPerPage;

    @FindBy(how = How.XPATH, using = "//a[@href='//demo.nopcommerce.com/desktops?price=-1000']")
    public WebElement txt_Under1000$;

    @FindBy(how = How.XPATH, using = "//a[@href='//demo.nopcommerce.com/desktops?price=1000-1200']")
    public WebElement txt_Over1000$;

    @FindBy(how = How.XPATH, using = "//a[@href='//demo.nopcommerce.com/desktops?price=1200-']")
    public WebElement txt_Over1200$;

    @FindBy(how = How.XPATH, using = "//a/img[@src='//demo.nopcommerce.com/images/thumbs/0000020_build-your-own-computer_415.jpeg']")
    public WebElement img_BuildYourOwnPC;

    @FindBy(how = How.XPATH, using = "//h2/a[@href='/build-your-own-computer']")
    public WebElement txt_BuildYourOwnPC;

    @FindBy(how = How.XPATH, using = "//a/img[@src='//demo.nopcommerce.com/images/thumbs/0000022_digital-storm-vanquish-3-custom-performance-pc_415.jpeg']")
    public WebElement img_DigitalStorm;

    @FindBy(how = How.XPATH, using = "//h2/a[@href='/digital-storm-vanquish-3-custom-performance-pc']")
    public WebElement txt_DigitalStorm;

    @FindBy(how = How.XPATH, using = "//a/img[@src='//demo.nopcommerce.com/images/thumbs/0000023_lenovo-ideacentre-600-all-in-one-pc_415.jpeg']")
    public WebElement img_AllInOne;

    @FindBy(how = How.XPATH, using = "//h2/a[@href='/lenovo-ideacentre-600-all-in-one-pc']")
    public WebElement txt_AllInOne;

    @FindBy(how = How.XPATH, using = "//span[@class='price actual-price']")
    public WebElement price_BuildYourOwnPC;

    @FindBy(how = How.XPATH, using = "//div[@class='rating']/div")
    public WebElement rate_AllInOne;

    @FindBy(how = How.XPATH, using = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a")
    public WebElement selected_desktop;

    @FindBy(how = How.XPATH, using = "//*[@id='products-orderby']/option[4]")
    public WebElement selected_sorting;

}
