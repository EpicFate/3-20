package tests;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.MobileBy.AccessibilityId;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.className;

class AndroidTest extends TestBase {

    @Test
    @Tag("android")
    @DisplayName("Successful search in wikipedia android app")
    void searchAndroidTest() {

        step("Открываем приложение", (step) -> { open();
        });
        step("Нажимаем на строку поиска", (step) -> { $(AccessibilityId("Search Wikipedia")).click();
        });
        step("Вводим запрос", (step) -> { $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("BrowserStack");
        });
        step("Проверяем запрос", (step) -> { $$(className("android.widget.TextView")).shouldBe(CollectionCondition.sizeGreaterThan(0));
        });
    }
}
