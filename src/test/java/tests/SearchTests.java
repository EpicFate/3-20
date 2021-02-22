package tests;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.MobileBy.AccessibilityId;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.className;

class SearchTests extends TestBase {



    @Test
    @Tag("android")
    @DisplayName("Successful search in wikipedia android app")
    void successfulSearchWithStepsAndroid() {

        step("Открываем приложение", (step) -> { open();
        });
        step("Открываем приложение", (step) -> { $(AccessibilityId("Search Wikipedia")).click();
        });
        step("Открываем приложение", (step) -> { $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        });
        step("Открываем приложение", (step) -> { $$(className("android.widget.TextView")).shouldBe(CollectionCondition.sizeGreaterThan(0));
        });
    }

    @Test
    @Tag("ios")
    @DisplayName("Successful search in wikipedia android app")
    void successfulSearchWithStepsIOS() {

        step("Открываем приложение", (step) -> { open();
        });
        step("Открываем приложение", (step) -> { $(AccessibilityId("Text Button")).click();
        });
        step("Открываем приложение", (step) -> { $(AccessibilityId("Text Input")).setValue("hello@browserstack.com").pressEnter();
        });
        step("Открываем приложение", (step) -> { $(AccessibilityId("Text Output")).shouldHave(text("hello@browserstack.com"));
        });
        step("Открываем приложение", (step) -> { $(AccessibilityId("Text Button")).click();
        });
    }
}
