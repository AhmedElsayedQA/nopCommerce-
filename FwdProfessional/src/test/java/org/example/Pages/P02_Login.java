package org.example.Pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {
    public WebElement LoginLink(){
        return Hooks.driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));

    }
    public WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));

    }
    public WebElement password(){
        return Hooks.driver.findElement(By.id("Password"));


    }
    public  WebElement loginBtn(){
        return Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));


    }
    //div[@class="message-error validation-summary-errors"]
    public  WebElement myAccount(){
        return Hooks.driver.
                findElement(By.xpath("//div[@class=\"header-links\"]//a[@href=\"/customer/info\"]"));


    }
    public  WebElement FailureMsg(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));


    }


}
