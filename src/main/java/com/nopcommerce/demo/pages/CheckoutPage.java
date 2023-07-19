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

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement guestCheckout;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressLine1Field;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCodeField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'billing-buttons-container']//button[@class = 'button-1 new-address-next-step-button']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayRadioButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class = 'button-1 shipping-method-next-step-button']")
    WebElement continueShipping;

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class = 'button-1 payment-method-next-step-button']")
    WebElement continuePayment;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement creditCardType;


    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expiryMonth;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expiryYear;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath = "//button[@class = 'button-1 payment-info-next-step-button']")
    WebElement continueNextStep;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyPaymentText;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space() = 'Next Day Air']")
    WebElement verifyShippingText;

    @CacheLookup
    @FindBy(xpath = "//span[1]/strong[1]")
    WebElement veryTotal;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyOrderSuccessfulText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueAtThankYouPage;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement register;

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement secondDayAir;

    @CacheLookup
    @FindBy(xpath = "//li[@class = 'shipping-method']//span[@class = 'value']")
    WebElement verifySecondAir;

    public String verifyWelcomeSignInText() {
        CustomListeners.test.log(Status.PASS, "Verify WelCOme Sign Text" + verifyWelcomeSignInText());
        Reporter.log("Check Welcome Text" + verifyWelcomeText.toString() + "<br>");
        return getTextFromElement(verifyWelcomeText);
    }

    public void clickOnGuestCheckout() {
        clickOnElement(guestCheckout);
        CustomListeners.test.log(Status.PASS, "Click on Guest CHeck Out" + guestCheckout);
        Reporter.log("Check Click on Guest Check Out" + guestCheckout.toString() + "<br>");
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
        CustomListeners.test.log(Status.PASS, "Enter First Name" + firstNameField);
        Reporter.log("Check First Name" + firstName.toString() + "<br>");
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
        CustomListeners.test.log(Status.PASS, "Enter Last name" + lastName);
        Reporter.log("Check last Name" + lastName.toString() + "<br>");
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, "Enter Email ID" + email);
        Reporter.log("Check Email ID" + email.toString() + "<br>");
    }

    public void selectCountryName(String country) {
        selectByVisibleTextFromDropDown(countryField, country);
        CustomListeners.test.log(Status.PASS, "Select Country Name" + country);
        Reporter.log("Check Country Field" + country.toString() + "<br>");
    }

    public void enterCityName(String city) {
        sendTextToElement(cityField, city);
        CustomListeners.test.log(Status.PASS, "Enter City Name" + city);
        Reporter.log("Check City Name" + city.toString() + "<br>");
    }

    public void enterAddressLine1(String address1) {
        sendTextToElement(addressLine1Field, address1);
        CustomListeners.test.log(Status.PASS, "Enter Adress Line 1 " + address1);
        Reporter.log("Check Adress Line" + address1.toString() + "<br>");
    }

    public void enterPostalCode(String postalCode) {
        sendTextToElement(postalCodeField, postalCode);
        CustomListeners.test.log(Status.PASS, "Check Postal COde" + postalCode);
        Reporter.log("Enter Postal Code" + postalCode.toString() + "<br>");
    }

    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneNumberField, phoneNumber);
        CustomListeners.test.log(Status.PASS, "Enter Phone Number" + phoneNumber);
        Reporter.log("Check Phone Number" + phoneNumber.toString() + "<br>");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click On Continue Button" + confirmButton);
        Reporter.log("Check on Continue Button" + confirmButton.toString() + "<br>");
    }

    public void clickOnNextDayAirRadioButton() {
        clickOnElement(nextDayRadioButton);
        CustomListeners.test.log(Status.PASS, "Click On Next Day Air" + nextDayRadioButton);
        Reporter.log("Check On Next Day Air" + nextDayRadioButton.toString() + "<br>");
    }

    public void clickOnContinueLink() {
        clickOnElement(continueShipping);
        CustomListeners.test.log(Status.PASS, "Click On Continue Button" + continueShipping);
        Reporter.log("Check on Continue Button" + continueShipping.toString() + "<br>");
    }

    public void selectCreditCardRadioButton() {
        clickOnElement(creditCard);
        CustomListeners.test.log(Status.PASS, "Select Credit Card" + creditCard);
        Reporter.log("Check Credit Card" + creditCard.toString() + "<br>");
    }

    public void clickOnContinue() {
        clickOnElement(continuePayment);
        CustomListeners.test.log(Status.PASS, "Click On Continue" + continuePayment);
        Reporter.log("Check Click on Continue Card" + continuePayment.toString() + "<br>");
    }

    public void selectCreditCard(String value) throws InterruptedException {
        selectByValueFromDropDown(creditCardType, value);
        CustomListeners.test.log(Status.PASS, "Select Credit Card" + continuePayment);
        Reporter.log("Choose Credit Card" + continuePayment.toString() + "<br>");
    }

    public void enterCardHolderName(String name) {
        sendTextToElement(cardHolderNameField, name);
        CustomListeners.test.log(Status.PASS, "Enter Card Holder Name" + cardHolderNameField);
        Reporter.log("Check Card Holder Name" + cardHolderNameField.toString() + "<br>");

    }

    public void enterCardNumber(String number) {
        sendTextToElement(cardNumberField, number);
        CustomListeners.test.log(Status.PASS, "Enter Card number" + cardNumberField);
        Reporter.log("Check Card Number" + cardNumberField.toString() + "<br>");
    }

    public void selectExpiryMonth(String value) {
        selectByValueFromDropDown(expiryMonth, value);
        CustomListeners.test.log(Status.PASS, "Select Expiry Month" + expiryMonth);
        Reporter.log("Choose Expiry Month" + expiryMonth.toString() + "<br>");
    }

    public void selectExpiryYear(String value) {
        selectByValueFromDropDown(expiryYear, value);
        CustomListeners.test.log(Status.PASS, "Select Expity Year" + expiryYear);
        Reporter.log("Choose Expiry Year" + expiryYear.toString() + "<br>");
    }

    public void enterCardCode(String number) {
        sendTextToElement(cardCode, number);
        CustomListeners.test.log(Status.PASS, "Enter Card Code" + cardCode);
        Reporter.log("Choose Card Code" + cardCode.toString() + "<br>");
    }

    public void clickContinueButton() {
        clickOnElement(continueNextStep);
        CustomListeners.test.log(Status.PASS, "Click Continue Button" + continueNextStep);
        Reporter.log("Choose Continue Button" + continueNextStep.toString() + "<br>");
    }

    public String verifyPaymentMethod() {
        CustomListeners.test.log(Status.PASS, "Verify Payment Month" + verifyPaymentText);
        Reporter.log("Choose Payment Month" + verifyPaymentText.toString() + "<br>");
        return getTextFromElement(verifyPaymentText);

    }

    public String verifyShippingMethod() {
        CustomListeners.test.log(Status.PASS,"Verify Shipping Method" + verifyShippingText);
        Reporter.log("Choose Shipping Text" + verifyShippingText.toString() + "<br>");
        return getTextFromElement(verifyShippingText);
    }

    public String verifyTotalAmount() {
        CustomListeners.test.log(Status.PASS,"Verify Total Amount" + veryTotal);
        Reporter.log("Choose Total Amount" + veryTotal.toString() + "<br>");
        return getTextFromElement(veryTotal);
    }

    public void clickOnConfirmButton() {
                clickOnElement(confirmButton);
                CustomListeners.test.log(Status.PASS, "Click On Confirm Button" + confirmButton);
                Reporter.log("Choose a Confirm Button" + confirmButton.toString() + "<br>");
    }

    public String verifyThankYouText() {
        CustomListeners.test.log(Status.PASS, "Verify Thank You Text" + verifyText);
        Reporter.log("Check Thank You Text" + verifyText.toString() + "<br>");
        return getTextFromElement(verifyText);
    }

    public String verifyOrderIsSuccessful() {
        CustomListeners.test.log(Status.PASS, "Verify Order Success" + verifyOrderSuccessfulText);
        Reporter.log("Choose Thank You Text" + verifyOrderSuccessfulText.toString() + "<br>");
        return getTextFromElement(verifyOrderSuccessfulText);
    }

    public void clickOnContinueButtonOnThankYouPage() {
                clickOnElement(continueAtThankYouPage);
                CustomListeners.test.log(Status.PASS, "Click On Continue Button" + continueAtThankYouPage);
                Reporter.log("Check on Continue Button" + continueAtThankYouPage.toString() + "<br>");
    }

    public void clickOnRegisterTab() {
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS, "Click on Register Tab" + register);
        Reporter.log("Check on Register Tab " + register.toString() + "<br>");
    }

    public void clickOnSecondDayAir() {
                clickOnElement(secondDayAir);
                CustomListeners.test.log(Status.PASS, "Click on Second Day" + secondDayAir);
                Reporter.log("Check on Second Day" + secondDayAir.toString() + "<br>");
    }

    public String verifySecondDayAir() {
        CustomListeners.test.log(Status.PASS, "Verify Second" + verifySecondAir);
        Reporter.log("Check and Verify Second Day" + verifySecondAir.toString() + "<br>");
        return getTextFromElement(verifySecondAir);
    }


}
