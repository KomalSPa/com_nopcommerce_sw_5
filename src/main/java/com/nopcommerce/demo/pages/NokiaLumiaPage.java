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

import javax.rmi.CORBA.Util;

public class NokiaLumiaPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement verifyPhoneText;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement verifyPhonePrice;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement verifyProductAddedMessage;

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantity;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'bar-notification success']//p[@class = 'content']")
    WebElement getVerifyProductAddedMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'bar-notification success']//span[@class = 'close']")
    WebElement closeBar;

    @CacheLookup
    @FindBy(xpath = "//span[@class = 'cart-label']")
    WebElement mouseHover;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement goToCart;

    public String verifyNokiaLumiaText() {
        CustomListeners.test.log(Status.PASS, "Verify Nokia Lumia" + verifyPhoneText);
        Reporter.log("Check Verify Nokia Lumia" + verifyPhoneText.toString() + "<br>");
        return getTextFromElement(verifyPhoneText);
    }

    public String verifyPrice() {
        CustomListeners.test.log(Status.PASS, "Verify Nokia Lumia Price" + verifyPhonePrice);
        Reporter.log("Check Verify Nokia Lumia Price" + verifyPhonePrice.toString() + "<br>");
        return getTextFromElement(verifyPhonePrice);
    }

    public void clearQuantity() {
        driver.findElement((By) quantity).clear();
        CustomListeners.test.log(Status.PASS, "Clear Quantiry" + quantity);
        Reporter.log("Check Clear Quantiry" + quantity.toString() + "<br>");

    }

    public void inputQuantity(String number) {
        sendTextToElement(quantity, number);
        CustomListeners.test.log(Status.PASS, "Input Quantity" + number);
        Reporter.log("Check Input Quantiry" + number.toString() + "<br>");
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click On Add to cart" + addToCart);
        Reporter.log("Check Click On Add to cart" + addToCart.toString() + "<br>");
    }

    public String verifyProductHasBeenAddedMessage() {
        CustomListeners.test.log(Status.PASS, "Verify product has been Aded MSG" + verifyProductAddedMessage);
        Reporter.log("Check product has been Aded MSG" + verifyProductAddedMessage.toString() + "<br>");
        return getTextFromElement(verifyProductAddedMessage);
    }

    public void clickOnCrossButtonToCloseBar() {
        clickOnElement(closeBar);
        CustomListeners.test.log(Status.PASS, "Click On Cross Button to Close" + closeBar);
        Reporter.log("Check Click On Cross Button to Close" + closeBar.toString() + "<br>");
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(mouseHover);
        CustomListeners.test.log(Status.PASS, "Mouse hover to Shopping Cart" + mouseHover);
        Reporter.log("Check Mouse hover to Shopping Cart" + mouseHover.toString() + "<br>");
    }

    public void clickOnGoToCart() {
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS, "Click on Go to Cart" + goToCart);
        Reporter.log("Check Click on Go to Cart" + goToCart.toString() + "<br>");
    }
}
