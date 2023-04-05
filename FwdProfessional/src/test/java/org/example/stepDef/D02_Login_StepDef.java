package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P02_Login;
import org.testng.asserts.SoftAssert;

public class D02_Login_StepDef {
    P02_Login login=new P02_Login();
    @Given("user navigates to login page")
    public void navigateToLoginPage(){
        login.LoginLink().click();


    }
    @Then("^user enters \"(.*)\" and \"(.*)\"$")
    public void enterEmailAndPassWord(String email,String PW){
        login.email().sendKeys(email);
        login.password().sendKeys(PW);

    }
    @And("user press login button")
    public void pressLoginBtn(){
        login.loginBtn().click();

    }
    @Then("user login to the system successfully")
    public void loginSucceeded(){
        SoftAssert soft =new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertTrue(login.myAccount().isDisplayed(),"isn't displayed");
        soft.assertAll();



    }
    @Then("user could not login to the system")
    public void loginDidNotSucceed(){
        String actualMessage=login.FailureMsg().getText();
        String expMessage="Login was unsuccessful";
        String actualColor=
                login.FailureMsg().getCssValue("color");

        SoftAssert soft= new SoftAssert();
        soft.assertTrue(actualMessage.contains(expMessage));
        soft.assertTrue(actualColor.contains("rgba(228, 67, 75, 1)"));
        System.out.println(actualMessage);
        System.out.println(actualColor);
        soft.assertAll();



    }






}
