package com.pluginlive.pagesforStudentRolesAccepting;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends BaseClass {
    public HomePage() throws IOException {

        PageFactory.initElements(driver, this);
    }

    public WebElement getRolesLink() {
        return rolesLink;
    }

    @FindBy(linkText = "Roles")
    private WebElement rolesLink;

    public void rolesbutton() throws InterruptedException {
        Thread.sleep(2000);
        click(getRolesLink());
    }


}
