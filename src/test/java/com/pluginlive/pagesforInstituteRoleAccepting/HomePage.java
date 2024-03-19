package com.pluginlive.pagesforInstituteRoleAccepting;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends BaseClass {


    public HomePage() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[text()='Demo college of engineering 1']")
    private WebElement loginsuccessmsg;

    @FindBy (xpath = "(//li[@role=\"menuitem\"])[3]")
    private WebElement selectRoles;

    public WebElement getLoginsuccessmsg() {
        return loginsuccessmsg;
    }

    public WebElement getSelectRoles() {
        return selectRoles;
    }

    public String loginSuccessMsg(){
        String text = getText(getLoginsuccessmsg());
        return text;
    }
    public void selectRoles(){
        click(getSelectRoles());
    }
}


