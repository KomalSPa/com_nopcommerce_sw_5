package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddRadio;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osRadio;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement software;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyPrice;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class = 'close']")
    WebElement verifyProductAddedMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@class = 'close']")
    WebElement crossButton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;

    public void selectProcessor(String text) {

        selectByVisibleTextFromDropDown(processor, text);
        CustomListeners.test.log(Status.PASS, "To Select Processor" + processor);
        Reporter.log("To Select Processor1" + processor.toString() + "<br>");
    }

    public void selectRam(String text) {
        selectByVisibleTextFromDropDown(ram, text);
        CustomListeners.test.log(Status.PASS, "For Select RAM" + ram);
        Reporter.log("Select RAM" + ram.toString() + "<br>");
    }

    public void selectHDDRadioButton() {
        clickOnElement(hddRadio);
        CustomListeners.test.log(Status.PASS, "For Select Radio Button" + hddRadio);
        Reporter.log("Select Radio Button" + hddRadio.toString() + "<br>");
    }

    public void selectOSRadioButton() {
        clickOnElement(osRadio);
        CustomListeners.test.log(Status.PASS, "For OS Radio Button" + osRadio);
        Reporter.log("Select OS Radio Button" + osRadio.toString() + "<br>");
    }

    public void selectSoftware() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(software);
        CustomListeners.test.log(Status.PASS, "For Select Software" + software);
        Reporter.log("Select Software" + software.toString() + "<br>");
    }

    public String verifyCorrectPrice() {
        CustomListeners.test.log(Status.PASS, "Verify Correct Price" + verifyPrice);
        Reporter.log("Correct Price" + verifyPrice.toString() + "<br>");
        return getTextFromElement(verifyPrice);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Clicking on Add to Cart Button");
        Reporter.log("Click on Add to Cart Button" + addToCart.toString() + "<br>");
    }

    public String verifyProductHasBeenAddedText() {
        CustomListeners.test.log(Status.PASS, "Verify Product been Added" + verifyProductAddedMessage);
        Reporter.log("Product has been Added" + verifyProductAddedMessage.toString() + "<br>");
        return getTextFromElement(verifyProductAddedMessage);
    }

    public void closeTheBar() {
        clickOnElement(crossButton);
        CustomListeners.test.log(Status.PASS, "Close the Bar" + crossButton);
        Reporter.log("Bar is Closed" + crossButton.toString() + "<br>");
    }

    public void mouseHoverToShoppingCart() {
        mouseHoverToElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "Go to Shopping Cart" + shoppingCart);
        Reporter.log("Shopping Cart" + shoppingCart.toString() + "<br>");
    }

    public void clickOnGoToCart() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS, "Go to Cart" + goToCart);
        Reporter.log("Go to the Cart" + goToCart.toString() + "<br>");
    }

}
