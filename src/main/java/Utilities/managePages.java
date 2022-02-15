package Utilities;

import PageObjects.NopCommerce.loginTab;
import org.openqa.selenium.support.PageFactory;

//This class is the management of the page objects of each platform
public class managePages extends Base
{
    public static void init()
    {
        nopCommerceLogin = PageFactory.initElements(driver, PageObjects.NopCommerce.loginTab.class);
        nopCommerceMain = PageFactory.initElements(driver, PageObjects.NopCommerce.mainPage.class);
        nopCommerceMenuBar = PageFactory.initElements(driver, PageObjects.NopCommerce.menusBar.class);
        nopCommerceComputersMenu = PageFactory.initElements(driver, PageObjects.NopCommerce.computersMenu.class);
        nopCommerceElectronicsMenu = PageFactory.initElements(driver, PageObjects.NopCommerce.electronicsMenu.class);
        nopCommerceApparelMenu = PageFactory.initElements(driver, PageObjects.NopCommerce.apparelMenu.class);
        nopCommerceDesktopsPage = PageFactory.initElements(driver, PageObjects.NopCommerce.desktopsPage.class);
        nopCommerceBuildComputerPage = PageFactory.initElements(driver, PageObjects.NopCommerce.buildOwnComputerPage.class);
        nopCommerceDigitalStormPcPage = PageFactory.initElements(driver, PageObjects.NopCommerce.DigitalStormPcPage.class);

        mortgageMain = PageFactory.initElements(driver, PageObjects.Mortgage.mainPage.class);
        electronMain = PageFactory.initElements(driver, PageObjects.ElectronDemo.mainPage.class);
        calcMain = PageFactory.initElements(driver, PageObjects.Calculator.mainPage.class);
        GrafanaLogin = PageFactory.initElements(driver, PageObjects.Grafana.loginPage.class);
        GrafanaHome = PageFactory.initElements(driver, PageObjects.Grafana.homePage.class);
    }

}
