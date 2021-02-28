package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static helpers.AttachmentsHelper.*;
import static helpers.BrowserstackHelper.getBSPublicLink;
import static helpers.DriverHelper.configureSelenide;
import static helpers.DriverHelper.getSessionId;
import static helpers.EnvironmentHelper.isAndroid;
import static helpers.EnvironmentHelper.isIos;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class TestBase {

    @BeforeAll
    public static void beforeAll() {

        configureSelenide();
    }

    @AfterEach
    public void addAttachments(){
        String sessionId = getSessionId();
        attachScreenshot("Last screenshot");
        attachPageSource();
        if (isIos || isAndroid) attachAsText("Browserstack build link", getBSPublicLink(sessionId));

        closeWebDriver();

        attachVideo(sessionId);
    }
}
