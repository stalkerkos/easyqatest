package com.easyqa.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class IssuesPage {
    @FindBy(xpath = "//h2[.='Issues summary']")
    public SelenideElement issuesHeader;

    @FindBy(xpath = "//a[.='Add new issue']")
    public SelenideElement addNewIssuesBtn;

    @FindBy(id = "issue_summary")
    public SelenideElement issueSummary;

    @FindBy(id = "issue_description")
    public SelenideElement issueDescription;

    @FindBy(id = "type-view")
    public SelenideElement issueTypeSelector;

    @FindBy(xpath = "//label[.='Bug']")
    public SelenideElement issueTypeBug;

    @FindBy(id = "issue_priority")
    public SelenideElement issuePrioritySelector;

    @FindBy(xpath = "//label[.='High']")
    public SelenideElement issuePriorityHigh;

    @FindBy(xpath = "//label[.='Low']")
    public SelenideElement issuePriorityLow;

    @FindBy(xpath = "//label[.='Medium']")
    public SelenideElement issuePriorityMedium;

    @FindBy(xpath = "//label[.='Critical']")
    public SelenideElement issuePriorityCritical;

    @FindBy(name = "commit")
    public SelenideElement issueSaveBtn;

    @FindBy(xpath = "//div[@class='card_message']")
    public SelenideElement cardName;

    @Step
    public void checkIssuesPage() {
        issuesHeader.shouldBe(Condition.appear);
        addNewIssuesBtn.shouldBe(Condition.appear);
    }

    @Step
    public void clickAddNewIssue() {
        addNewIssuesBtn.click();
    }

    @Step
    public void setIssueTypeBug() {
        issueTypeSelector.click();
        issueTypeBug.click();
    }



    /*public void setIssuePriorityHigh() {
        issuePrioritySelector.click();
        issuePriorityHigh.click();

    }*/

    @Step
    public void AddNewIssue(String issueName, String issueDesc, String priority){
        issueSummary.click();
        issueSummary.sendKeys(issueName);

        issueDescription.click();
        issueDescription.sendKeys(issueDesc);
        setIssueTypeBug();
        setPriority(priority);
        /* setIssuePriorityHigh();*/
        /*setPriority("critical");*/
        issueSaveBtn.click();
    }

    @Step
    public void checkIssueAdded(String issueName){
        cardName.shouldBe(Condition.text(issueName));
    }

    @Step
    public void setPriority(String priority){

        switch(priority){
            case "low":
                issuePrioritySelector.click();
                issuePriorityLow.click();
                break;
            case "medium":
                issuePrioritySelector.click();
                issuePriorityMedium.click();
                break;
            case "high":
                issuePrioritySelector.click();
                issuePriorityHigh.click();
            break;
            case "critical":
                issuePrioritySelector.click();
                issuePriorityCritical.click();
            break;
            default:
                break;
        }

    }
}

