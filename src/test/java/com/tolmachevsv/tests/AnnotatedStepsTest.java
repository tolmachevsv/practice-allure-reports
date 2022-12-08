package com.tolmachevsv.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AnnotatedStepsTest {

    WebSteps webSteps = new WebSteps();
    private final static String REPO = "selenide/selenide";
    private final static int ISSUE_NUMBER = 2054;

    @Test
    public void testGitHubIssue() {
        webSteps.openPage();
        webSteps.searchRepository(REPO);
        webSteps.goToRepository(REPO);
        webSteps.openRepositoryIssues();
        webSteps.checkIssueWithRequiredNumber(ISSUE_NUMBER);
    }
}
