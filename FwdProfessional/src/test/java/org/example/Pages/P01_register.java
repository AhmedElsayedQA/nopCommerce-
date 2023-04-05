package org.example.Pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement regBtn(){


              return   Hooks.driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));


    }
    public WebElement maleGender() {

        return Hooks.driver.findElement(By.id("gender-male"));
    }

        public WebElement femaleGender() {

            return Hooks.driver.findElement(By.id("gender-female"));
        }



    public WebElement firstName(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastName(){
        return Hooks.driver.findElement(By.id("LastName"));

    }
    public WebElement DoBD(){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }
    public WebElement DoBM(){
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));

    }
    public WebElement DoBY(){
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));

    }
    public WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));

    }
    public WebElement passWord(){
        return Hooks.driver.findElement(By.id("Password"));

    }
    public WebElement confirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));

    }


    public WebElement registerBtn(){
        return Hooks.driver.findElement(By.id("register-button"));

    }
    public WebElement successMsg(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"result\"]"));

    }

    public WebElement failureMsg(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));

    }


}
