package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.appium.java_client.MobileBy.AccessibilityId;
import static io.qameta.allure.Allure.step;

@Tag("ios")
class IosTests extends TestBase {

    @Test
    @DisplayName("search in ios")
    void searchIOSTest() {

        step("Открываем приложение", (step) -> { open();
        });
        step("Нажимаем кнопку", (step) -> { $(AccessibilityId("Text Button")).click();
        });
        step("Вводим текст", (step) -> { $(AccessibilityId("Text Input")).setValue("hello@browserstack.com").pressEnter();
        });
        step("Проверяем наличие текста", (step) -> { $(AccessibilityId("Text Output")).shouldHave(text("hello@browserstack.com"));
        });
    }
}
