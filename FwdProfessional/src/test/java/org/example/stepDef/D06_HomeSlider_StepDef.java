package org.example.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;


public class D06_HomeSlider_StepDef {
    P03_homePage homePage=new P03_homePage();
    @When("user clicks on first slider")
    public void clickFirstSlider(){
//        homePage.slider().findElement(By.xpath("//a[1]")).click();
homePage.slider().click();


    }
    @Then ("user should navigate to first product page")
    public void navigateToFirstProductPage(){
        String actualURL=Hooks.driver.getCurrentUrl();
        String expectedURL="https://demo.nopcommerce.com/galaxy-s22-ultra";
        System.out.println(actualURL);
        Assert.assertTrue(actualURL.contains(expectedURL));



    }
    @When("user clicks on second slider")
    public void clickSecondSlider(){
        homePage.slider().findElement(By.xpath("//a[2]")).click();

    }
    @Then ("user should navigate to second product page")
    public void navigateToSecondProductPage(){
        String actualURL=Hooks.driver.getCurrentUrl();
        String expectedURL="https://demo.nopcommerce.com/iphone-14-pro";
        System.out.println(actualURL);
        Assert.assertTrue(actualURL.contains(expectedURL));



    }
}

