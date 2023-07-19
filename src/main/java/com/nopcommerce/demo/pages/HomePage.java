package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'page-title']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyWelcomeText;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'top-menu notmobile']//a[text() = 'Electronics ']")
    WebElement electronics;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhone;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOut;

    public void selectMenu(String menu) {
        By topMenuBar = By.xpath("//ul[@class='top-menu notmobile']/li/a[text() = '" + menu + " ']");
        clickOnElement(topMenuBar);
        CustomListeners.test.log(Status.PASS, "Select menu" + topMenuBar);
        Reporter.log("Check Select Menu" + topMenuBar.toString() + "<br>");
    }

    public String getErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Get Error messegeu" + errorMessage);
        Reporter.log("Check Error Messege" + errorMessage.toString() + "<br>");
        return getTextFromElement(errorMessage);
    }


    public String verifyWelcomeToStoreText() {
        CustomListeners.test.log(Status.PASS, "Verify Welcome To Store MSG" + verifyWelcomeText);
        Reporter.log("Check Verify Welcome To Store MSG" + verifyWelcomeText.toString() + "<br>");
        return getTextFromElement(verifyWelcomeText);
    }

    public void mouseHoverToElectronics() {
                mouseHoverToElement(electronics);
        CustomListeners.test.log(Status.PASS, "Mouse Hover of Electronincs" + electronics);
        Reporter.log("Check Mouse Hover of Electronincs" + electronics.toString() + "<br>");
    }

    public void mouseHoverAndClickOnCellPhones() {
        mouseHoverToElementAndClick(cellPhone);
        CustomListeners.test.log(Status.PASS, "Mouse Hover and Click Cell Phone" + cellPhone);
        Reporter.log("Check Mouse Hover and Click Cell Phone" + cellPhone.toString() + "<br>");
    }

    public void clickOnLogoutLink() {
        clickOnElement(logOut);
        CustomListeners.test.log(Status.PASS, "Click On LogOut" + logOut);
        Reporter.log("Check Click On LogOut" + logOut.toString() + "<br>");
    }


}
