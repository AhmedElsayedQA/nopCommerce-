package org.example.stepDef;

import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.swing.*;

import java.util.Locale;

import static org.example.stepDef.Hooks.driver;

public class D04_Search_StepDef {
    P03_homePage homePage=new P03_homePage();

    @When("user enter {string} in search bar")
    public void enterProductName(String itemName){
        homePage.searchBar().sendKeys(itemName);
        homePage.searchBar().submit();
//        homePage.searchElements().size();
        SoftAssert soft= new SoftAssert();
        for (int i=0;i<homePage.searchElements().size();i++)
        {

            soft.assertTrue(homePage.searchElements().get(i).getText().toLowerCase().contains(itemName),
                    "Element no "+(i+1)+"contain the word "+itemName);
            System.out.println( homePage.searchElements().get(i).getText()
            );

        }
        soft.assertAll();


    }
    @When("^user enter (.*) in the search bar$")
    public void enterProductSku(String b){
        homePage.searchBar().sendKeys(b);
        homePage.searchBar().submit();
        homePage.searchElement().click();
//        System.out.println(homePage.searchElements().size());
//        System.out.println(homePage.searchElements().get(0).getText());
////        Actions act = new Actions(driver);
//        act.moveToElement(
//        homePage.searchElements().get(0).click();

        String actualSku=homePage.sku().getText();
        System.out.println(actualSku);
        System.out.println(b);
        System.out.println(actualSku.toLowerCase()+b.toLowerCase());

        Assert.assertTrue(actualSku.toLowerCase().contains(b.toLowerCase()));


    }

    }
