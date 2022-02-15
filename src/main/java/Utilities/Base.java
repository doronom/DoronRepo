package Utilities;

import io.restassured.path.json.JsonPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//***** This class store all the global variables of the project
public class Base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenshot;
    public static ImageDiffer imgDif = new ImageDiffer();
    public static ImageDiff dif;
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static String Platform;
    public static PageObjects.NopCommerce.loginTab nopCommerceLogin;
    public static PageObjects.NopCommerce.mainPage nopCommerceMain;
    public static PageObjects.NopCommerce.menusBar nopCommerceMenuBar;
    public static PageObjects.NopCommerce.computersMenu nopCommerceComputersMenu;
    public static PageObjects.NopCommerce.electronicsMenu nopCommerceElectronicsMenu;
    public static PageObjects.NopCommerce.apparelMenu nopCommerceApparelMenu;
    public static PageObjects.NopCommerce.desktopsPage nopCommerceDesktopsPage;
    public static PageObjects.NopCommerce.buildOwnComputerPage nopCommerceBuildComputerPage;
    public static PageObjects.NopCommerce.DigitalStormPcPage nopCommerceDigitalStormPcPage;
    public static PageObjects.Mortgage.mainPage mortgageMain;
    public static PageObjects.ElectronDemo.mainPage electronMain;
    public static PageObjects.Calculator.mainPage calcMain;
    public static PageObjects.Grafana.loginPage GrafanaLogin;
    public static PageObjects.Grafana.homePage GrafanaHome;

    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams = new JSONObject();
    public static JsonPath jp;
    public static String apiID;
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
    public static Process process;
}
