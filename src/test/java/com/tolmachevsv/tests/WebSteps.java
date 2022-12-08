package com.tolmachevsv.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открываем главную страницу")
    public void openPage() {
        open("https://github.com/");
    }

    @Step("Ищем репозиторий {repo}")
    public void searchRepository(String repo) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repo);
        $(".header-search-input").submit();
    }

    @Step("Переходим в репозиторий {repo}")
    public void goToRepository(String repo) {
        $(By.linkText(repo)).click();
    }

    @Step("Переходим во вкладку Issues")
    public void openRepositoryIssues() {
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие Issue с номером {issue_number}")
    public void checkIssueWithRequiredNumber(Integer issue_number) {
        $(withText("#" + issue_number)).shouldBe(visible);
    }
}
