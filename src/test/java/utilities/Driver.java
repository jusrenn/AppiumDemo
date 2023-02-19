package utilities;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {

        if(driver == null) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
            cap.setCapability("platformName", ConfigReader.getProperty("platformName"));
            cap.setCapability("platformVersion", ConfigReader.getProperty("platformVersion"));
            cap.setCapability("automationName", ConfigReader.getProperty("automationName"));
            cap.setCapability("app", ConfigReader.getProperty("app"));
            //cap.setCapability("appActivity", ConfigReader.getProperty("appActivity"));
            //cap.setCapability("appPackage", ConfigReader.getProperty("appPackage"));

            URL remoteURL = null;
            try {
                remoteURL = new URL(ConfigReader.getProperty("remoteURL"));
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            driver = new AndroidDriver(remoteURL, cap);
        }
        return driver;
    }

    public static void closeDriver() {
        if(driver != null) {
            driver.closeApp();
            driver = null;
        }
    }
}
