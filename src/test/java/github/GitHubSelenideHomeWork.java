package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSelenideHomeWork {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void testSelenideHomeWork() {
    open("https://github.com/selenide/selenide");
    $("#wiki-tab").click();
    $("#wiki-pages-filter").setValue("SoftAssertions");
    $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
    $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text(
                "@ExtendWith({SoftAssertsExtension.class})\n" +
                        "class Tests {\n" +
                        "@Test\n" +
                        "void test() {\n" +
                        "Configuration.assertionMode = SOFT;\n" +
                        "open(\"page.html\");\n" +
                        "\n" +
                        "$(\"#first\").should(visible).click();\n" +
                        "$(\"#second\").should(visible).click();\n" +
                        "}\n" +
                        "}"
        ));
    }
}
