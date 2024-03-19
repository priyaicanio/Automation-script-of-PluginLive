package com.pluginlive.pagesforBulkCorporateRoleCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DashboardPage extends BaseClass {
    public DashboardPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h2[@class=\"sc-kiiLYU jWYPOp\"]")
    private WebElement loginsuccessmsg;
    @FindBy(xpath = "(//li[@role='menuitem'])[1]")
    private WebElement selectDashboard;
    @FindBy(xpath = "(//li[@role='menuitem'])[2]")
    private WebElement selectRoles;
    @FindBy(xpath = "(//li[@role='menuitem'])[3]")
    private WebElement selectDrives;
    @FindBy(xpath = "(//li[@role='menuitem'])[4]")
    private WebElement selectusers;
    @FindBy(xpath = "(//li[@role='menuitem'])[5]")
    private WebElement selectReports;
    @FindBy(xpath = "(//li[@role='menuitem'])[6]")
    private WebElement selectSettings;

    public WebElement getLoginsuccessmsg() {
        return loginsuccessmsg;
    }

    public WebElement getSelectDashboard() {
        return selectDashboard;
    }

    public WebElement getSelectRoles() {
        return selectRoles;
    }

    public WebElement getSelectDrives() {
        return selectDrives;
    }

    public WebElement getSelectusers() {
        return selectusers;
    }

    public WebElement getSelectReports() {
        return selectReports;
    }

    public WebElement getSelectSettings() {
        return selectSettings;
    }

    public String loginSuccessMsg() {
        String text = getText(getLoginsuccessmsg());
        return text;
    }

    public void selectRoles() {
        click(getSelectRoles());
    }

}
