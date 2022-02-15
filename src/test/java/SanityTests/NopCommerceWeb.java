package SanityTests;

import Extensions.uiActions;
import Extensions.verifications;
import Utilities.CommonOps;
import Utilities.listeners;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;

import static Extensions.verifications.visualElement;

@Listeners (listeners.class)
public class NopCommerceWeb extends CommonOps
{
    @Test(description = "Test 01: Login to NopCommerce")
    @Description("Test Description: Login on NopCommerce web application")
    public void Test01_login()
    {
        webFlows.login(getData("user_web"), getData("password_web"));
        verifications.txtInElement(nopCommerceMain.txt_nopCommerce,"Welcome to our store");
    }

    @Test(description = "Test 02: Verify desktop page header text")
    @Description("Test Description: Verify desktop page header")
    public void Test02_desktopsHeader()
    {
        webFlows.verifyHeader();
        verifications.txtInElement(nopCommerceDesktopsPage.txt_desktops, "Desktops");
    }

    @Test(description = "Test 03: Verify Build desktop PC basic price")
    @Description("Test Description: Filter in desktop page and verify basic price for build your own PC")
    public void Test03_verifyDesktopPrice()
    {
        webFlows.filterDesktops("Name: A to Z", "3");
        verifications.txtInElement(nopCommerceDesktopsPage.price_BuildYourOwnPC, "$1,200.00");
    }

    @Test(description = "Test 04: Build your own PC")
    @Description("Test Description: Build your own PC and verify the PC price")
    public void Test04_verifyPrice_buildPC() throws InterruptedException
    {
        webFlows.buildOwnPc(1,2);
        verifications.priceInElement(nopCommerceBuildComputerPage.pc_totalPrice, nopCommerceBuildComputerPage.mulSel_acrobatReader,"$1,495.00");
    }

    @Test(description = "Test 05: Verify Digital storm model price")
    @Description("Test Description: Verify Digital storm model PC price from desktop page")
    public void Test05_verifyDigitalStormPCPrice()
    {
        webFlows.digitalStormPC();
        verifications.txtInElement(nopCommerceDigitalStormPcPage.price_DigitalStorm, "$1,259.00");
    }

    @Test(description = "Test 06: Verify All in one PC rating")
    @Description("Test Description: Verify All in one PC users rating")
    public void Test06_verifyAllInOneRating()
    {
        webFlows.getRating("Price: Low to High", 0);
        verifications.getValueFromElement(nopCommerceDesktopsPage.rate_AllInOne, "style","100%");
    }

    @Test(description = "Test 07: Compare nopCommerce main page icon")
    @Description("Test Description: Verify that nopCommerce icon doesn't changed")
    public void Test07_compareIcon()
    {
        visualElement(nopCommerceMain.icn_nopCommerce, "nopCommerceLogo");
    }
}
