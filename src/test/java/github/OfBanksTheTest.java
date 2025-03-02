package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class OfBanksTheTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
    }


    @Test
    void testBankTheCookies() {

    open("https://www.otpbank.ru");
        $(withText("Продолжая просмотр сайта")).shouldBe(visible); // Находит видимый текст
        $(byTagAndText("strong", "Закрыть")).click(); // выбирает по тегу strong и с текстом Закрыть
        $(withText("Продолжая просмотр сайта")).shouldBe(hidden); // Данный тест отсутствует

    }

    @Test
    void pageObject() {
        new LoginPO().loginWithUsernameAndPassword("user", "admin1234");
        new HomePO().title.shouldHave(text("My Balance"));
        new HomePO().showAccountBalance();

    }

    @Test
    void closeBasicAuth() {
        open("https://the-internet.herokuapp.com/basic_auth");
        actions().sendKeys(Keys.ESCAPE);
        sleep(5000);

    }

    @Test
    void findAttributeByValue() {
        $("[name$=order]").click();
    }

}
