package org.example.Pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_WishList {
    public WebElement quantity(){
        return Hooks.driver.findElement(By.className("qty-input"));
    }
}
