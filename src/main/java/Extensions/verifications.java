package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import static org.testng.Assert.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.util.ImageTool;

//This class includes few general verification methods
public class verifications extends CommonOps
{
    //Compare text in element to expected text
    @Step("Verify text in element")
    public static void txtInElement(WebElement elm, String expValue)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron") && !Platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(elm));
        if (Platform.equalsIgnoreCase("desktop"))
            Assert.assertEquals(elm.getText().replace("Display is", "").trim(), expValue);
        else
         Assert.assertEquals(elm.getText(), expValue);
    }
    //Compare text in element to expected text with synchronization
    @Step("Verify text element with synchronization")
    public static void priceInElement(WebElement elm, WebElement elm1, String expValue)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron"))
            wait.until(ExpectedConditions.elementToBeSelected(elm1));
        Assert.assertEquals(elm.getText(), expValue);
    }
    //Get a text from element, trim the text so you can compare it to the expected text format
    @Step("Compare a text to element")
    public static void getValueFromElement(WebElement elm, String value, String expValue)
    {
        Assert.assertEquals(elm.getAttribute(value).split(": ")[1].split(";")[0] , expValue);
    }

    //This method read the previous version image logo and compare it to the new version image logo
    @Step("Compare main image logo")
    public static void visualElement(WebElement imgElm, String expectedImgName)
    {
        BufferedImage expectedImage = null;     //initializing expected image to 'BufferImage' object
        try
        {
            Thread.sleep(Integer.parseInt(getData("Sleep")));
            //Read the image that already taken (previous version) and store in 'BufferImage' object
            expectedImage = ImageIO.read(new File(getData("ImageRepo")+ expectedImgName + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Error reading image file: " + e);
        }
        //Take the new image in the current page version and compare it to the image from previous version
        Screenshot imageScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imgElm);
        BufferedImage actualImage = imageScreenshot.getImage();
        dif = imgDif.makeDiff(actualImage, expectedImage);
        assertFalse(dif.hasDiff(), "images are not equals");
    }

    //Compere text to text method
    @Step("Verify text with text")
    public static void text(String actualText, String expectedText)
    {
        assertEquals(actualText, expectedText);
    }
}
