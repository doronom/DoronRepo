package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class uiActions extends CommonOps
{
    //This method is clicking on element
    @Step("Click on element")
    public static void click(WebElement elm)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron") && !Platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.elementToBeClickable(elm));
        elm.click();
    }
    //This method is sending text to text filed element
    @Step("Send data to text field ")
    public static void updateTxt(WebElement elm, String value)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elm));
        elm.sendKeys(value);
    }
    //This method is clearing the text from text filed element
    @Step("Clear data from text field ")
    public static void clearTxt(WebElement elm)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elm));
        elm.clear();
    }
    //This method is selecting a value from a drop-down list
    @Step("Select from drop-down list by value")
    public static void updateDropdown(WebElement elm, String value)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elm));
        Select valueFromList = new Select(elm);
        valueFromList.selectByVisibleText(value);
    }
    //This method is hovering with a mouse over an element and click on it
    @Step("Mouse hover to element action")
    public static void mouseHoverElement(WebElement elm1)
    {
        action.moveToElement(elm1).click().build().perform();
    }

    //This method is hovering with an element on other element
    @Step("Mouse hover from element to element action")
    public static void mouseHoverElements(WebElement elm1, WebElement elm2)
    {
        action.moveToElement(elm1).moveToElement(elm2).click().build().perform();
    }
    //This method is hovering with a mouse over an element with synchronization and click on it
    @Step("Mouse hover to one element action with synchronization")
    public static void mouseHoverToElement(WebElement elm1)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elm1));
        action.moveToElement(elm1).click().build().perform();
    }
    //This method is selecting a value from a drop-down list by Index
    @Step("Select from drop-down list by index")
    public static void selectFromList(WebElement elm, int index, WebElement elm1)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elm));
        Select selectedItem = new Select(elm);
        selectedItem.selectByIndex(index);
        wait.until(ExpectedConditions.elementToBeSelected(elm1));
    }
    //This method is scrolling down the page to an element
    @Step("Scroll down to element")
    public static void scrollDown(WebElement elm)
    {
        if (!Platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elm));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", elm);
    }

    //General wait function
    @Step("Wait function until page is update")
    public static void wait2Update() throws InterruptedException
    {
        Thread.sleep(5000);
    }
}
