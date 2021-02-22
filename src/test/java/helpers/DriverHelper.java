
package helpers;

import com.codeborne.selenide.Configuration;
import drivers.CustomMobileDriver;
import io.appium.java_client.MobileBy;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.EnvironmentHelper.*;


public class DriverHelper {

    public static void configureSelenide() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));

        if (isAndroid || isIos) {
            Configuration.browser = CustomMobileDriver.class.getName();
            Configuration.startMaximized = false;
            Configuration.browserSize = null;
        }
        Configuration.timeout = 10000;
    }

    public static String getSessionId(){
        return ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
    }

}