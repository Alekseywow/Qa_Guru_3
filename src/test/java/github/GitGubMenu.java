package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class GitGubMenu {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void testMenuSelection() {

        open("https://github.com/");
        $(byTagAndText("button", "Solutions")).hover();
        $$("[aria-labelledby='solutions-by-company-size-heading'] li").first().$("a").click(); // Первый вариант
//        $(byTagAndText("a", "Enterprises")).click(); Второй вариант
        $(".enterprise-hero").shouldHave(text("The AI-powered developer platform"));
        sleep(5000);

    }

}
