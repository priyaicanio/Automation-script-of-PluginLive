package com.pluginlive.pagesforStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class EmailVerfication extends BaseClass {

    public EmailVerfication() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    int desiredIndex = 0;
    @FindBy(xpath = "(//input[@class=\"whsOnd zHQkBf\"])[1]")
    private WebElement emailid;

    public WebElement getEmailid() {
        return emailid;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    public WebElement getEmailpassword() {
        return emailpassword;
    }

    @FindBy(xpath = "//*[text()='Next']")
    private WebElement nextButton;

    @FindBy(xpath = "//input[@name=\"Passwd\"]")
    private WebElement emailpassword;


    @FindBy(xpath = "//div[@class=\"yW\"]")
    private List<WebElement> emaillist;

    public WebElement getHideexpandedCOntent() {
        return hideexpandedCOntent;
    }

    @FindBy(xpath = "//div[@id=\":ty\"]")
    private WebElement hideexpandedCOntent;

    public List<WebElement> getEmaillist() {
        return emaillist;
    }

    @FindBy(xpath = "//a[text()='Activate Account']")
    private WebElement activateAccountbutton;

    public WebElement getActivateAccountbutton() {
        return activateAccountbutton;
    }

    public void emaillogin(String email, String password) throws InterruptedException {
        click(getEmailid());
        Thread.sleep(2000);
        sendkeys(getEmailid(), email);
        click(getNextButton());
        Thread.sleep(2000);
        sendkeys(getEmailpassword(), password);
        click(getNextButton());
    }

    public void emaillist() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < getEmaillist().size(); i++) {
            WebElement emailElement = getEmaillist().get(i);
            String emailText = emailElement.getText();
            System.out.println("Email " + (i + 1) + ": " + emailText);

            // System.out.println("Email " + (i + 1) + ": " + getEmaillist().get(i).getText());

            if (i == desiredIndex) {
                emailElement.click();
                break;
            }

        }
        Thread.sleep(5000);
        scrolldown(getActivateAccountbutton());
        Thread.sleep(2000);
        click(getActivateAccountbutton());
    }


}





