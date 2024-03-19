package com.pluginlive.pagesforStudentRolesAccepting;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class RolesPage extends BaseClass {
    public RolesPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    int desiredIndex = 0;

    @FindBy(xpath = "//input[@placeholder=\"Search by keyword\"]")
    private WebElement roleSearch;

    @FindBy(xpath = "//div[@class= 'sc-jMakVo hJvgyk']")
    private List<WebElement> rolesList;

    public WebElement getRoleSearch() {
        return roleSearch;
    }

    public List<WebElement> getRolesList() {
        return rolesList;
    }

    public WebElement getApplyButton() {
        return applyButton;
    }

    @FindBy(xpath = "//div[text()=\"Apply\"]")
    private WebElement applyButton;

    @FindBy(xpath = "//div[text()='Continue']")
    private WebElement ContinueButton;

    public WebElement getContinueButton() {
        return ContinueButton;
    }

    public void RoleSearch(String search) throws InterruptedException {
        implicitywait();

        Thread.sleep(2000);
        click(getRoleSearch());
        Thread.sleep(2000);
        sendkeys(getRoleSearch(), search);
    }

    public void RoleList() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < getRolesList().size(); i++) {
            WebElement rolesElement = getRolesList().get(i);
            String rolesText = rolesElement.getText();
            System.out.println("Roles " + (i + 1) + ": " + rolesText);

            System.out.println("Roles " + (i + 1) + ": " + getRolesList().get(i).getText());

            if (i == desiredIndex) {
                rolesElement.click();
                break;
            }

        }
        Thread.sleep(2000);
        click(getApplyButton());
        Thread.sleep(3000);
        click(getContinueButton());
    }


}