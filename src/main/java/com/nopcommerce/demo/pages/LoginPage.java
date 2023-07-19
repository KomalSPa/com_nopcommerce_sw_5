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

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id ="Password" )
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Log in')]")
    WebElement loginButton;
    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter email" + email);
        Reporter.log("Check Click On email" + email.toString() + "<br>");
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter password" + password);
        Reporter.log("Check Click On Password" + password.toString() + "<br>");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click On Login Buton" + loginButton);
        Reporter.log("Check Click On Login Buton" + loginButton.toString() + "<br>");

    }
}
