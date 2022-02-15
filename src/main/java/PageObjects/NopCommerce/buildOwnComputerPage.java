package PageObjects.NopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class buildOwnComputerPage
{
    @FindBy(how = How.XPATH, using = "//*[@id='product_attribute_1']")
    public WebElement sel_Processor;

    @FindBy(how = How.XPATH, using = "//*[@id='product_attribute_1']/option[2]")
    public WebElement selected_Processor;

    @FindBy(how = How.XPATH, using = "//*[@name='product_attribute_2']")
    public WebElement sel_Ram;

    @FindBy(how = How.XPATH, using = "//*[@id='product_attribute_2']/option[3]")
    public WebElement selected_Ram;

    @FindBy(how = How.XPATH, using = "//input[@id='product_attribute_3_6']")
    public WebElement rBtn_320GB;

    @FindBy(how = How.XPATH, using = "//input[@id='product_attribute_3_7']")
    public WebElement rBtn_400GB;

    @FindBy(how = How.XPATH, using = "//input[@id='product_attribute_4_8']")
    public WebElement rBtn_vistaHome;

    @FindBy(how = How.XPATH, using = "//input[@id='product_attribute_4_9']")
    public WebElement rBtn_vistaPremium;

    @FindBy(how = How.XPATH, using = "//input[@id='product_attribute_5_10']")
    public WebElement mulSel_office;

    @FindBy(how = How.XPATH, using = "//input[@id='product_attribute_5_11']")
    public WebElement mulSel_acrobatReader;

    @FindBy(how = How.XPATH, using = "//input[@id='product_attribute_5_12']")
    public WebElement mulSel_tCommander;

    @FindBy(how = How.XPATH, using = "//span[@class='price-value-1']")
    public WebElement pc_totalPrice;

    @FindBy(how = How.ID, using = "add-to-wishlist-button-1")
    public WebElement btn_addToWishList;

    @FindBy(how = How.ID, using = "add-to-cart-button-1")
    public WebElement btn_addToCart;

    @FindBy(how = How.XPATH, using = "//*[@class='button-2 add-to-compare-list-button']")
    public WebElement btn_compare;

    @FindBy(how = How.XPATH, using = "//*[@id='main-product-img-1']")
    public WebElement img_desktop;

    @FindBy(how = How.XPATH, using = "//*[@id='product_attribute_1']/option[2]")
    public By loc_processor;


}
