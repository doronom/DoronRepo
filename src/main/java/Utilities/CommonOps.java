package Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.w3c.dom.Document;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class CommonOps extends Base
{
    // Read XML Function
    public static String getData (String nodeName)
    {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./Configuration/Configuration.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }

    //Initializing web platform with browser selection: Google Chrome/FireFox/Internet explorer
    public static void initBrowser(String BrowserType)
    {
        if(BrowserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if(BrowserType.equalsIgnoreCase("firefox"))
            driver = initFFDriver();
        else if(BrowserType.equalsIgnoreCase("ie"))
            driver = initIEDriver();
        else
            throw new RuntimeException(("Invalid browser name"));
        driver.manage().window().maximize();
        driver.get(getData("loginurl"));
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        action = new Actions(driver);


    }
    //Initializing Google Chrome browser
    public static WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    //Initializing FireFox browser
    public static WebDriver initFFDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
    //Initializing Internet explorer browser
    public static WebDriver initIEDriver()
    {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }
    //Initializing mobile platform function
    public static void initMobile() throws MalformedURLException
    {
        dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("APP_PACKAGE"));
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("APP_ACTIVITY"));
        driver = new RemoteWebDriver(new URL(getData("appiumServer") + "/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
    }
    //Initializing API platform function
    public static void initAPI()
    {
        RestAssured.baseURI = getData("url_api");
        httpRequest = RestAssured.given().auth().preemptive().basic(getData("username_api"), getData("password_api"));
    }
    //Initializing Electron applications desktop platform function
    public static void initElectron()
    {
        System.setProperty("webdriver.chrome.driver", getData("electronDriverPath"));
        ChromeOptions opt = new ChromeOptions();
        opt.setBinary(getData("electronAppPath"));
        dc.setCapability("chromeOptions", opt);
        dc.setBrowserName("chrome");
        driver = new ChromeDriver(dc);
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
    }
    //Initializing other windows desktop applications platform function
    public static void initDesktop()
    {
        dc.setCapability("app", getData("calculatorApp"));
        try
        {
            driver = new WindowsDriver(new URL(getData("appiumServer")), dc);
        }
       catch (Exception e)
       {
           System.out.println("Failed to connect Appium server " + e);
       }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
    }
    //Initializing DB platform function
    public static void initGrafana4DB()
    {
        driver = initChromeDriver();
        driver.manage().window().maximize();
        driver.get(getData("url_api"));
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        action = new Actions(driver);
    }
    //Get the selected testing platform and initializing the corresponding function
    @BeforeClass
    @Parameters({"PlatformName"})
    public void startSession(String PlatformName) throws MalformedURLException
    {
        Platform = PlatformName;
        //String platform = "web";
        if(Platform.equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
        else if (Platform.equalsIgnoreCase("mobile"))
           initMobile();
        else if (Platform.equalsIgnoreCase("api"))
            initAPI();
        else if (Platform.equalsIgnoreCase("electron"))
            initElectron();
        else if (Platform.equalsIgnoreCase("desktop"))
            initDesktop();
        else if (Platform.equalsIgnoreCase("db"))
            initGrafana4DB();
        else
            throw new RuntimeException(("Invalid platform name"));
        managePages.init();
        manageDB.initConnection(getData("dbURL"), getData("dbUser"), getData("dbPassword"));
    }

    @AfterMethod
    public void afterMethod()
    {
        if(Platform.equalsIgnoreCase("web"))
            driver.get(getData("url"));
    }
    //Closing the session
    @AfterClass
    public void closeSession()
    {
        manageDB.closeConnection();
        if(!Platform.equalsIgnoreCase("api"))
        driver.quit();
    }
}
