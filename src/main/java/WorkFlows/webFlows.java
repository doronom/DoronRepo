package WorkFlows;

import Extensions.dbActions;
import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;
import PageObjects.NopCommerce.buildOwnComputerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class webFlows extends CommonOps
{
    //Test user login page to NopCommerce web site
    @Step("Login NopCommerce flow")
    public static void login(String user, String pass)
    {
        uiActions.updateTxt(nopCommerceLogin.txt_loginEmail, user);
        uiActions.updateTxt(nopCommerceLogin.txt_Password, pass);
        uiActions.click(nopCommerceLogin.btn_login);
    }
    //Verify the text in the header of computers page
    @Step("Check page header")
    public static void verifyHeader()
    {
        uiActions.mouseHoverElements(nopCommerceMenuBar.topMenu_computers, nopCommerceComputersMenu.subMenu_desktops);
    }
    //Sorting the desktop PC by the drop-down list 'Sort By' and 'Display'
    @Step("Filter from desktops PC")
    public static void filterDesktops(String value, String value1)
    {
        uiActions.mouseHoverElements(nopCommerceMenuBar.topMenu_computers, nopCommerceComputersMenu.subMenu_desktops);
        uiActions.updateDropdown(nopCommerceDesktopsPage.txt_Sort, value);
        uiActions.updateDropdown(nopCommerceDesktopsPage.txt_DisplayPerPage, value1);
    }
    //Build you own PC by selecting the PC components and verify the price
    @Step("Build your on PC and verify price")
    public static void buildOwnPc(int index1, int index2) throws InterruptedException
    {
        uiActions.mouseHoverElements(nopCommerceMenuBar.topMenu_computers, nopCommerceComputersMenu.subMenu_desktops);
        uiActions.click(nopCommerceDesktopsPage.img_BuildYourOwnPC);
        uiActions.click(nopCommerceBuildComputerPage.rBtn_400GB);
        uiActions.selectFromList(nopCommerceBuildComputerPage.sel_Ram, index2, nopCommerceBuildComputerPage.selected_Ram);
        uiActions.click(nopCommerceBuildComputerPage.rBtn_vistaPremium);
        uiActions.click(nopCommerceBuildComputerPage.mulSel_acrobatReader);
        uiActions.wait2Update();
        uiActions.selectFromList(nopCommerceBuildComputerPage.sel_Processor, index1, nopCommerceBuildComputerPage.selected_Processor);


    }
    //Verify the price of a brand pc 'Digital Storm'
    @Step("Check price of Digital Storm desktop PC")
    public static void digitalStormPC()
    {
        uiActions.mouseHoverElements(nopCommerceMenuBar.topMenu_computers, nopCommerceComputersMenu.subMenu_desktops);
        uiActions.click(nopCommerceDesktopsPage.img_DigitalStorm);
    }
    //Verify 'All in one' PC rating
    @Step("Get all in one PC rating")
    public static void getRating(String value, int index)
    {
        uiActions.mouseHoverElements(nopCommerceMenuBar.topMenu_computers, nopCommerceComputersMenu.subMenu_desktops);
        uiActions.updateDropdown(nopCommerceDesktopsPage.txt_Sort, value);
        uiActions.selectFromList(nopCommerceDesktopsPage.txt_DisplayPerPage, index, nopCommerceDesktopsPage.selected_sorting);
    }
    //Taking Grafana login credentials from DB and login to Grafana
    @Step("Login Grafana with DB credentials")
    public static void loginDB()
    {
      List<String> credentials =  dbActions.getCredentials("SELECT UserName, Password from Users WHERE ID = '2'");
      uiActions.updateTxt(GrafanaLogin.field_User, credentials.get(0));
      uiActions.updateTxt(GrafanaLogin.field_Password, credentials.get(1));
      uiActions.click(GrafanaLogin.btn_Login);
      uiActions.click(GrafanaLogin.btn_Skip);
    }
}
