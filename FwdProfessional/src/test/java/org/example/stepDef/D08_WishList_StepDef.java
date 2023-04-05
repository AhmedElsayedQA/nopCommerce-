package org.example.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.example.Pages.P05_WishList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.function.Function;

public class D08_WishList_StepDef {
    P03_homePage homePage=new P03_homePage();
    P05_WishList wishList=new P05_WishList();
    @When("user clicks on add to wishlist icon")
    public void clickOnWishlistIcon(){
        homePage.addToWishlistIcon().click();

    }
    @Then("a green success message should appear")
    public void successMessageIsDisplayed(){
        Assert.assertTrue(homePage.successMessage().isDisplayed());
        String actualColor=homePage.successMessage().getCssValue("background-color");
        String expectedColor="rgba(75, 176, 122, 1)";
        System.out.println(actualColor);
        Assert.assertEquals(actualColor,expectedColor);
    }
//    @When ("user clicks on add to wishlist icon")
    @Then ("user navigate to wishlist page")
    public void navigateToWishlistPage(){
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.invisibilityOf(homePage.successMessage()));
    homePage.wishListPageBtn().click();

    }
    @Then ("element should be added to wishlist")
    public void productIsAddedToWishlist(){
        System.out.println(wishList.quantity().getAttribute("value"));
        Assert.assertNotEquals(wishList.quantity().getAttribute("value"),0);

    }

}
