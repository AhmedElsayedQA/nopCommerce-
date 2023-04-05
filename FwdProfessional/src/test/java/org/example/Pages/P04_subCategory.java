package org.example.Pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_subCategory {
    public WebElement pageTitle(){
        return Hooks.driver.findElement(By.className("page-title"));

    }


}
