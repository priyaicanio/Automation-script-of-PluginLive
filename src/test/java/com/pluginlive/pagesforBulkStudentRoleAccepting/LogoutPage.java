package com.pluginlive.pagesforBulkStudentRoleAccepting;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LogoutPage extends BaseClass {


    public LogoutPage() throws IOException {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[@class=\"ant-avatar ant-avatar-circle ant-avatar-image sc-gEvEer kdoLqB\"]")
    private WebElement dropdownclick;

    @FindBy(xpath = "//div[text()='Logout']")
    private WebElement logoutbutton;

    public WebElement getDropdownclick() {
        return dropdownclick;
    }

    public WebElement getLogoutbutton() {
        return logoutbutton;
    }

    public void logoutfunction() throws InterruptedException {
        Thread.sleep(2000);
        click(getDropdownclick());
        Thread.sleep(3000);
        click(getLogoutbutton());
    }


}
