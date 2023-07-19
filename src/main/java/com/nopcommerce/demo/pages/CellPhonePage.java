package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonePage extends Utility {

    @CacheLookup
    @FindBy(xpath ="//h1[(text() = 'Cell phones')]" )
    WebElement verifyCellPhoneText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;

    @CacheLookup
    @FindBy(xpath ="//h2[@class = 'product-title']//a[(text() = 'Nokia Lumia 1020')]" )
    WebElement productName;

    public String verifyCellPhoneText() {
        // if error please check verifycellphonetext String or WebElement
        CustomListeners.test.log(Status.PASS, "Verify Cell Phone" + verifyCellPhoneText());
        Reporter.log("Check the Cell Phone" + verifyCellPhoneText.toString() + "<br>");
        return getTextFromElement(verifyCellPhoneText);
    }

    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
        CustomListeners.test.log(Status.PASS, "Click on List View" + listViewTab);
        Reporter.log("Check on List View" + listViewTab.toString() + "<br>");
    }

    public void clickOnNokiaLumia1020Link() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(productName);
        CustomListeners.test.log(Status.PASS, "Click on Nokia Lumia" + productName);
        Reporter.log("Check Nokia Lumia" + productName.toString() + "<br>");
    }}
