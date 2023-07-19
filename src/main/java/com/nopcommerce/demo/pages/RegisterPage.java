package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistration;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;


    public String verifyRegisterText() {
        CustomListeners.test.log(Status.PASS, "Verify Register Text" + registerText);
        Reporter.log("Check Verify Register Text" + registerText.toString() + "<br>");
        return getTextFromElement(registerText);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        CustomListeners.test.log(Status.PASS, "Enter First Name" + firstName);
        Reporter.log("Check Enter First Name" + firstName.toString() + "<br>");
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        CustomListeners.test.log(Status.PASS, "Enter Last Name" + lastName);
        Reporter.log("Check Enter Last Name" + lastName.toString() + "<br>");
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter Email" + email);
        Reporter.log("Check Enter Email" + email.toString() + "<br>");
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter Password" + password);
        Reporter.log("Check Enter Password" + password.toString() + "<br>");
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
        CustomListeners.test.log(Status.PASS, "Enter Confirm Password" + confirmPassword);
        Reporter.log("Check Enter Confirm Password" + confirmPassword.toString() + "<br>");
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, "Click On Register button" + registerButton);
        Reporter.log("Check Click On Register button" + registerButton.toString() + "<br>");
    }

    public String verifyRegistrationCompleteMessage() {
        CustomListeners.test.log(Status.PASS, "Verify Registration Complt MSG" + verifyRegistration);
        Reporter.log("Check Verify Registration Complt MSG" + verifyRegistration.toString() + "<br>");
        return getTextFromElement(verifyRegistration);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
        CustomListeners.test.log(Status.PASS, "Click On Continue tab" + continueTab);
        Reporter.log("Check Click On Continue tab" + continueTab.toString() + "<br>");
    }


}
