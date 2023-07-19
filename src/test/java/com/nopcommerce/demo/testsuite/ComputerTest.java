package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;

import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {
    HomePage homePage;
    ComputersPage computersPage;
    DesktopPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    ShoppingCartPage shoppingCartPage;
    CheckoutPage checkoutPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        computersPage = new ComputersPage();
        desktopsPage = new DesktopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        shoppingCartPage = new ShoppingCartPage();
        checkoutPage = new CheckoutPage();
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        // 1.1 Click on Computer Menu.
        homePage.selectMenu("Computers");

        // 1.2 Click on Desktop
        computersPage.clickOnDesktop();

        // 1.3 Select Sort By position "Name: Z to A"
        desktopsPage.selectDropDown("Name: Z to A");

        // 1.4 Verify the Product will arrange in Descending order.
        desktopsPage.verifyProductsInDescendingOrder();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {

        homePage.selectMenu("Computers");
        computersPage.clickOnDesktop();
        desktopsPage.selectDropDown("Name: A to Z");
        desktopsPage.addProductToCart();
        String expectedText = "Build your own computer";
        Assert.assertEquals(desktopsPage.getErrorMessage(), expectedText, "Unable to verify text.");
        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRam("8GB [+$60.00]");
        buildYourOwnComputerPage.selectHDDRadioButton();
        buildYourOwnComputerPage.selectOSRadioButton();
        buildYourOwnComputerPage.selectSoftware();
        Thread.sleep(2000);
        String expectedPrice = "$1,475.00";
        Assert.assertEquals(buildYourOwnComputerPage.verifyCorrectPrice(), expectedPrice, "Unable to verify price.");
        buildYourOwnComputerPage.clickOnAddToCartButton();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(buildYourOwnComputerPage.verifyProductHasBeenAddedText(), expectedMessage, "Unable to verify message.");
        buildYourOwnComputerPage.closeTheBar();
        buildYourOwnComputerPage.mouseHoverToShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCart();
        String expectedShoppingCartMessage = "Shopping cart";
        Assert.assertEquals(shoppingCartPage.verifyTextShoppingCart(), expectedShoppingCartMessage, "Unable to verify message.");
        shoppingCartPage.clearQuantity();
        shoppingCartPage.quantityAmount("2");
        shoppingCartPage.updateShoppingCart();
        String expectedTotal = "$2,950.00";
        Assert.assertEquals(shoppingCartPage.verifyTotalAmount(), expectedTotal, "Unable to verify total.");
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckoutButton();
        String expectedWelcomeSignInText = "Welcome, Please Sign In!";
        Assert.assertEquals(checkoutPage.verifyWelcomeSignInText(), expectedWelcomeSignInText, "Unable to verify text.");
        checkoutPage.clickOnGuestCheckout();
        checkoutPage.enterFirstName("Hono");
        checkoutPage.enterLastName("Lulu");
        checkoutPage.enterEmailId("hono8855@gmail.com");
        checkoutPage.selectCountryName("United Kingdom");
        checkoutPage.enterCityName("London");
        checkoutPage.enterAddressLine1("125 Harrow Road");
        checkoutPage.enterPostalCode("IN1 2UK");
        checkoutPage.enterPhoneNumber("03596855967");
        checkoutPage.clickOnContinueButton();
        checkoutPage.clickOnNextDayAirRadioButton();
        checkoutPage.clickOnContinueLink();
        checkoutPage.selectCreditCardRadioButton();
        checkoutPage.clickOnContinue();
        checkoutPage.selectCreditCard("MasterCard");
        checkoutPage.enterCardHolderName("Mr. H. Lulu");
        checkoutPage.enterCardNumber("1111 2222 3333 4444");
        checkoutPage.selectExpiryMonth("8");
        checkoutPage.selectExpiryYear("2049");
        checkoutPage.enterCardCode("852");
        checkoutPage.clickContinueButton();
        checkoutPage.verifyPaymentMethod();
        checkoutPage.verifyShippingMethod();
        checkoutPage.verifyTotalAmount();
        checkoutPage.clickOnConfirmButton();
        String expectedThankYouText = "Thank you";
        Assert.assertEquals(checkoutPage.verifyThankYouText(), expectedThankYouText, "Unable to verify message.");
        String expectedSuccessfulText = "Your order has been successfully processed!";
        Assert.assertEquals(checkoutPage.verifyOrderIsSuccessful(), expectedSuccessfulText, "Unable to verify message");
        checkoutPage.clickOnContinueButtonOnThankYouPage();
        String expectedWelcomeText = "Welcome to our store";
        Assert.assertEquals(homePage.verifyWelcomeToStoreText(), expectedWelcomeText, "Unable to verify text.");


    }}

