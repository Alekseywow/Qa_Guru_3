package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void shouldFindSelenideRepositoryTests() {
        open("https://github.com/");
        $(".header-search-button").click();
        $("#query-builder-test").setValue("selenide/selenide").pressEnter();
        $$("[data-testid='results-list'] .Box-sc-g0xbh4-0").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }

}
