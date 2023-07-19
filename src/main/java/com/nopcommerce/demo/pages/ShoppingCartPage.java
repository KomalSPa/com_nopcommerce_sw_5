package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//input[@class = 'qty-input']")
    WebElement quantity;

    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class ='value-summary']/strong")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfService;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout;

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement login;


    public String verifyTextShoppingCart() {
        CustomListeners.test.log(Status.PASS, "Verify Text Shopping Cart" + verifyText);
        Reporter.log("Check Verify Text Shopping Cart" + verifyText.toString() + "<br>");
        return getTextFromElement(verifyText);
    }

    public void clearQuantity() {
        driver.findElement((By) quantity).clear();
        CustomListeners.test.log(Status.PASS, "Clear Quantity" + quantity);
        Reporter.log("Check Clear Quantity" + quantity.toString() + "<br>");
    }

    public void quantityAmount(String quantityRequired) {
        sendTextToElement(quantity, quantityRequired);
        CustomListeners.test.log(Status.PASS, "Quantity Amount" + quantityRequired);
        Reporter.log("Check Quantity Amount" + quantityRequired.toString() + "<br>");
    }

    public void updateShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(updateCart);
        CustomListeners.test.log(Status.PASS, "Update Shoping Cart" + updateCart);
        Reporter.log("Check Update Shoping Cart" + updateCart.toString() + "<br>");
    }

    public String verifyTotalAmount() {
        CustomListeners.test.log(Status.PASS, "Verify Total Amount" + verifyTotal);
        Reporter.log("Check Verify Total Amount" + verifyTotal.toString() + "<br>");
        return getTextFromElement(verifyTotal);
    }

    public void clickOnTermsOfService() {
        clickOnElement(termsOfService);
        CustomListeners.test.log(Status.PASS, "Click On term of Services" + termsOfService);
        Reporter.log("Check Click On term of Servicest" + termsOfService.toString() + "<br>");

    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkout);
        CustomListeners.test.log(Status.PASS, "Click On CheckOut Button" + checkout);
        Reporter.log("Check Click On CheckOut Button" + checkout.toString() + "<br>");
    }

    public void clickOnLoginLink() {
        clickOnElement(login);
        CustomListeners.test.log(Status.PASS, "Click On Login link" + login);
        Reporter.log("Check Click On Login link" + login.toString() + "<br>");
    }


}





