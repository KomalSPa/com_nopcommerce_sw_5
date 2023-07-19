package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByDropDownList;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement errorMessage;


    public void selectDropDown(String text) {

        selectByVisibleTextFromDropDown(sortByDropDownList, text);
    }

    public void verifyProductsInDescendingOrder() {
        List<WebElement> productNames = driver.findElements(By.xpath("//h2[@class='product-name']/a"));
        List<String> productNameStrings = new ArrayList<String>();
        for (WebElement productName : productNames) {
            productNameStrings.add(productName.getText());
        }
        List<String> sortedProductNames = new ArrayList<String>(productNameStrings);
        Collections.sort(sortedProductNames, Collections.reverseOrder());
        Assert.assertEquals(productNameStrings, sortedProductNames);
        CustomListeners.test.log(Status.PASS, "Verify Product in Descending Order");
        Reporter.log("Verify Product in Descending Order");
    }

    public void addProductToCart() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Add Product to Cart" + addToCart);
        Reporter.log("Add Product to Cart" + addToCart.toString() + "<br>");
    }

    public String getErrorMessage() {
        CustomListeners.test.log(Status.PASS, "Get Error MSG" + errorMessage);
        Reporter.log("Get Error MSG" + errorMessage.toString() + "<br>");
        return getTextFromElement(errorMessage);
    }


}
