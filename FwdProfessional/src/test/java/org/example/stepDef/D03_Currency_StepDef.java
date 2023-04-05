package org.example.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D03_Currency_StepDef {
    P03_homePage currency=new P03_homePage();
    @Given("user select euro currency from dropdown menu")
    public void selectCurrency(){
//        currency.currencyDropdown().sendKeys("euro");
        Select CDD= new Select(currency.currencyDropdown());
        CDD.selectByIndex(1);


    }

     @Then("product's price should have euro symbol")
    public void checkPricesSymbol(){
        String[] prods=new String[4];
        for (int i=0;i<currency.prods().size();i++){
         prods[i]=currency.prods().get(i).getText();
        }
         for (int i=0;i<currency.prods().size();i++){

             Assert.assertTrue(prods[i].contains("€"),"product no"+(i+1)+"has an error");
     }
}}

