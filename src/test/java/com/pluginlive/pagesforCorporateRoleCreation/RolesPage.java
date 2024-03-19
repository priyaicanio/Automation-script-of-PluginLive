package com.pluginlive.pagesforCorporateRoleCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class RolesPage extends BaseClass {

    public RolesPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class ='ant-btn ant-btn-primary sc-ftTHYK fCoamy']")
    private WebElement newRole;

    public WebElement getNewRole() {
        return newRole;
    }
    public void clicknewRole(){
        click(getNewRole());
    }






}
