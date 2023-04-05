package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.example.Pages.P04_subCategory;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class D05_Hovering_StepDef {
P03_homePage hover =new P03_homePage();
P04_subCategory sub=new P04_subCategory();
    Actions act = new Actions(Hooks.driver);
    String mainPageSubCatName;

    @When("user hover to main categories")
    public void hoverToMainCategories(){


        act.moveToElement(hover.mainCat()).build().perform();
         mainPageSubCatName=hover.subCat().getText();
        System.out.println("when annotation"+mainPageSubCatName);




    }
    @And("click on one of the sub-categories")
    public void clickingSubCategory(){
        act.moveToElement(hover.subCat()).click().build().perform();


    }
    @Then("sub-category page should be opened")
    public void navigateToSubCategoryPage(){
        String subCatPageTitle=sub.pageTitle().getText();
//        System.out.println("1"+subCatPageTitle);
//        System.out.println("2"+mainPageSubCatName);

        Assert.assertTrue(subCatPageTitle.toLowerCase().trim().contains(mainPageSubCatName.toLowerCase().trim()));

    }

}
