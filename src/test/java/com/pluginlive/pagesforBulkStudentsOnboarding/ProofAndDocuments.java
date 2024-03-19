package com.pluginlive.pagesforBulkStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ProofAndDocuments extends BaseClass {
    public ProofAndDocuments() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    String IDproof = readExcelData1("ProofAndDocument", 1, 0);
    String Addressproof = readExcelData1("ProofAndDocument", 1, 1);

    public WebElement getSaveAndContinueButton() {
        return saveAndContinueButton;
    }

    @FindBy(xpath = "//button[@form=\"documentForm\"]")
    private WebElement saveAndContinueButton;

    @FindBy(xpath = "//input[@value=\"driving_licence\"]")
    private WebElement IDproofDrivingLicense;

    @FindBy(xpath = "(//input[@value=\"aadhaar_card\"])[1]")
    private WebElement IDproofAadhaarCard;

    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement IDproofUploadButton;

    @FindBy(xpath = "//input[@value=\"pan_card\"]")
    private WebElement AddressproofPANCARD;

    @FindBy(xpath = "(//input[@value=\"aadhaar_card\"])[2]")
    private WebElement AddressproofAadharcard;

    @FindBy(xpath = "//input[@value=\"passport\"]")
    private WebElement AddressproofPassport;

    @FindBy(xpath = "//div[text()='Upload File']")
    private WebElement AddressproofUpload;

    public WebElement getIDproofDrivingLicense() {
        return IDproofDrivingLicense;
    }

    public WebElement getIDproofAadhaarCard() {
        return IDproofAadhaarCard;
    }

    public WebElement getIDproofUploadButton() {
        return IDproofUploadButton;
    }

    public WebElement getAddressproofPANCARD() {
        return AddressproofPANCARD;
    }

    public WebElement getAddressproofAadharcard() {
        return AddressproofAadharcard;
    }

    public WebElement getAddressproofPassport() {
        return AddressproofPassport;
    }

    public WebElement getAddressproofUpload() {
        return AddressproofUpload;
    }

    public void proofanddocument() throws InterruptedException {
        Thread.sleep(3000);
        click(getSaveAndContinueButton());
    }

    public void addingproofanddocument(String IDproof, String Addressproof) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        click(getIDproofUploadButton());
        Thread.sleep(2000);
        StringSelection ss = new StringSelection(IDproof);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot r = new Robot();
        r.delay(1000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.delay(1000);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.delay(1000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        enterKey();
        Thread.sleep(2000);


        click(getAddressproofUpload());
        Thread.sleep(2000);
        StringSelection ss1 = new StringSelection(Addressproof);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
        Robot r1 = new Robot();
        r1.delay(1000);
        r1.keyPress(KeyEvent.VK_CONTROL);
        r1.keyPress(KeyEvent.VK_V);
        r1.delay(1000);
        r1.keyRelease(KeyEvent.VK_CONTROL);
        r1.keyRelease(KeyEvent.VK_V);
        r1.delay(1000);
        r1.keyPress(KeyEvent.VK_ENTER);
        r1.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        enterKey();

    }


}
