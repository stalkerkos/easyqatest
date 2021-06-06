package com.easyqa.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class ProjectsPage {

    @FindBy(xpath = "//h1[.='My Projects']")
    public SelenideElement projectsHeader;

    @FindBy(xpath = "//a[@class='project-name']")
    public SelenideElement projectName;

    public void checkProjectsPage() {
        projectsHeader.shouldBe(Condition.appear);
    }
    public ProjectDashboardPage openProject(){
        projectName.click();
        return page(ProjectDashboardPage.class);
    }
}
