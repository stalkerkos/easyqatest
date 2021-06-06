package com.easyqa.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class ProjectDashboardPage {

    @FindBy(xpath = "//h2[.='Project Overview']")
    public SelenideElement projectOverwiew;

    @FindBy(xpath = "//span[@class='icon-issues-icon']")
    public SelenideElement issuesLink;

    public void checkProjectDashboardPage(){
        projectOverwiew.shouldBe(Condition.appear);
    }

    public IssuesPage openIssues(){
        issuesLink.click();
        return page(IssuesPage.class);
    }


}
