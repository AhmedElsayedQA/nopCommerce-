package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_register;
import org.testng.asserts.SoftAssert;

public class D01_register_stepDef {
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void navigateToRegisterPage() {
        register.regBtn().click();
    }

    @When("user select gender type")
    public void selectGender() {
        register.maleGender().click();

    }

    @And("user enter date of birth")
    public void enterDoB() {
        register.DoBD().sendKeys("2");
        register.DoBM().sendKeys("Aug");
        register.DoBY().sendKeys("1999");

    }

    @And("^user enter \"(.*)\" and \"(.*)\"$")
    public void enterFirstNameAndLastName(String f, String l) {
        register.firstName().sendKeys(f);
        register.lastName().sendKeys(l);

    }

    @And("^user enter \"(.*)\" field$")
    public void enterEmail(String email) {
        register.email().sendKeys(email);

    }

    @And("^user enter \"(.*)\" and \"(.*)\" Password fields$")
    public void fillPasswordFields(String pw, String confPW) {
        register.passWord().sendKeys(pw);
        register.confirmPassword().sendKeys(confPW);


    }

    @And("user clicks on register button")
    public void clickRegBtn() {
        register.registerBtn().click();

    }

    @Then("success message is displayed")
    public void successMessage() {
        SoftAssert soft = new SoftAssert();
        String actualResult = register.successMsg().getText();
        String expectedResult = "Your registration completed";
        soft.assertTrue(actualResult.contains(expectedResult), "Your registration completed");
        String actualMsgColor = register.successMsg().getCssValue("color");
        String expMsgColor = "rgba(76, 177, 124, 1)";
        soft.assertTrue(actualMsgColor.contains(expMsgColor));

        System.out.println(actualMsgColor);
        System.out.println(actualResult);

        soft.assertAll();

    }

    @Then("failure message is displayed")
    public void failureMessage() {
        SoftAssert soft = new SoftAssert();
        String actualResult = register.failureMsg().getText();
        String expectedResult = "The specified email already exists";
        soft.assertTrue(actualResult.contains(expectedResult), "Message");
//        String actualMsgColor=register.successMsg().getCssValue("color");
//        String expMsgColor="rgba(76, 177, 124, 1)";
//        soft.assertTrue(actualMsgColor.contains(expMsgColor));

//        System.out.println(actualMsgColor);
        System.out.println(actualResult);

        soft.assertAll();
    }
}
