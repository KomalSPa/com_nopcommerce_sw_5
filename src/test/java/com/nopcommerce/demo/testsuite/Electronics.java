package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Electronics extends BaseTest {

    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesSuccessfully() {

        homePage.mouseHoverToElectronics();
        homePage.mouseHoverAndClickOnCellPhones();
        String expectedCellPhoneText = "Cell phones";
        Assert.assertEquals(cellPhonePage.verifyCellPhoneText(), expectedCellPhoneText, "Unable to verify text.");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverToElectronics();
        homePage.mouseHoverAndClickOnCellPhones();
        String expectedCellPhoneText = "Cell phones";
        Assert.assertEquals(cellPhonePage.verifyCellPhoneText(), expectedCellPhoneText, "Unable to verify text.");
        cellPhonePage.clickOnListViewTab();
        cellPhonePage.clickOnNokiaLumia1020Link();
        String expectedText = "Nokia Lumia 1020";
        Assert.assertEquals(nokiaLumiaPage.verifyNokiaLumiaText(), expectedText, "Unable to verify text.");
        String expectedPrice = "$349.00";
        Assert.assertEquals(nokiaLumiaPage.verifyPrice(), expectedPrice, "Unable to verify price.");
        nokiaLumiaPage.clearQuantity();
        nokiaLumiaPage.inputQuantity("2");
        nokiaLumiaPage.clickOnAddToCart();
        String expectedAddedToCartMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(nokiaLumiaPage.verifyProductHasBeenAddedMessage(), expectedAddedToCartMessage, "Unable to verify message.");
        nokiaLumiaPage.clickOnCrossButtonToCloseBar();
        nokiaLumiaPage.mouseHoverOnShoppingCart();
        nokiaLumiaPage.clickOnGoToCart();
        String expectedShoppingCartMessage = "Shopping cart";
        Assert.assertEquals(shoppingCartPage.verifyTextShoppingCart(), expectedShoppingCartMessage, "Unable to verify text.");
        String expectedQuantity = "2";
        String actualQuantity = driver.findElement(By.xpath("//input[@class='qty-input']")).getAttribute("value");
        Assert.assertEquals(actualQuantity, expectedQuantity, "Unable to verify quantity.");;
        String expectedTotalAmount = "$698.00";
        Assert.assertEquals(shoppingCartPage.verifyTotalAmount(), expectedTotalAmount, "Unable to verify total.");
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckoutButton();
        String expectedWelcomeText = "Welcome, Please Sign In!";
        Assert.assertEquals(checkoutPage.verifyWelcomeSignInText(), expectedWelcomeText, "Unable to verify text.");
        checkoutPage.clickOnRegisterTab();
        String expectedRegisterText = "Register";
        Assert.assertEquals(registerPage.verifyRegisterText(), expectedRegisterText, "Unable to verify text.");
        registerPage.enterFirstName("Mukz");
        registerPage.enterLastName("Shah");
        registerPage.enterEmail("mukz123456@gmail.com");
        registerPage.enterPassword("Mukz123");
        registerPage.enterConfirmPassword("Mukz123");
        registerPage.clickOnRegisterButton();
        String expectedRegistrationMessage = "Your registration completed";
        Assert.assertEquals(registerPage.verifyRegistrationCompleteMessage(), expectedRegistrationMessage, "Unable to verify message.");
        registerPage.clickOnContinueTab();
        String expectedShoppingCartText = "Shopping cart";
        Assert.assertEquals(shoppingCartPage.verifyTextShoppingCart(),expectedShoppingCartText, "Unable to verify text.");
        shoppingCartPage.clickOnLoginLink();
        loginPage.enterEmail("mukz123456@gmail.com");
        loginPage.enterPassword("Mukz123");
        loginPage.clickOnLoginButton();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckoutButton();
        checkoutPage.selectCountryName("United Kingdom");
        checkoutPage.enterCityName("London");
        checkoutPage.enterAddressLine1("123 The Best Street");
        checkoutPage.enterPostalCode("LN1 1LN");
        checkoutPage.enterPhoneNumber("11223344556");
        checkoutPage.clickOnContinueButton();
        checkoutPage.clickOnSecondDayAir();
        checkoutPage.clickOnContinueLink();
        checkoutPage.selectCreditCardRadioButton();
        checkoutPage.clickOnContinue();
        checkoutPage.selectCreditCard("visa");
        checkoutPage.enterCardHolderName("Mukz");
        checkoutPage.enterCardNumber("1254658974125698");
        checkoutPage.selectExpiryMonth("10");
        checkoutPage.selectExpiryYear("2025");
        checkoutPage.enterCardCode("222");
        checkoutPage.clickContinueButton();
        String expectedPaymentMethod = "Credit Card";
        Assert.assertEquals(checkoutPage.verifyPaymentMethod(), expectedPaymentMethod, "Unable to verify method.");
        String expectedShippingMethod = "2nd Day Air";
        Assert.assertEquals(checkoutPage.verifySecondDayAir(), expectedShippingMethod, "Unable to verify method.");
        String expectedTotal = "$698.00";
        Assert.assertEquals(checkoutPage.verifyTotalAmount(), expectedTotal, "Unable to verify total.");
        checkoutPage.clickOnConfirmButton();
        String expectedThankYouText = "Thank you";
        Assert.assertEquals(checkoutPage.verifyThankYouText(), expectedThankYouText, "Unable to verify text.");
        String expectedOrderSuccessfulMessage = "Your order has been successfully processed!";
        Assert.assertEquals(checkoutPage.verifyOrderIsSuccessful(), expectedOrderSuccessfulMessage, "Unable to verify message.");
        checkoutPage.clickOnContinueButtonOnThankYouPage();
        String expectedWelcomeStoreText = "Welcome to our store";
        Assert.assertEquals(homePage.verifyWelcomeToStoreText(), expectedWelcomeStoreText, "Unable to verify text.");
        homePage.clickOnLogoutLink();
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Unable to verify URL.");

    }


}
