package com.tolmachevsv.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class PureSelenideTest {

    @Test
    public void testGitHubIssue() {
        open("https://github.com/");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("selenide");
        $(".header-search-input").submit();

        $(By.linkText("selenide/selenide")).click();
        $("#issues-tab").click();
        $(withText("#2054")).shouldBe(visible);
    }
}
