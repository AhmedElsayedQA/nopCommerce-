package org.example.Pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement currencyDropdown(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> prods(){
        return Hooks.driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));

    }
    public WebElement searchBar(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public List<WebElement> searchElements(){
        return Hooks.driver.findElements(By.xpath
                ("//h2[@class=\"product-title\"]"));


    }
    public  WebElement searchElement(){
        return Hooks.driver.findElement(By.className("product-item"));
    }
    public WebElement sku(){
        return Hooks.driver.findElement(By.xpath("//span[@class=\"value\"]"));
    }

    public WebElement mainCat() {
        return Hooks.driver.findElement(
                By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]"));


    }
    public WebElement subCat() {

        return Hooks.driver.findElement(By.xpath(
                "//ul[@class=\"top-menu notmobile\"]/li[2]/ul/li[2]/a"));
    }
    public WebElement slider(){
        return Hooks.driver.findElement(By.id("nivo-slider"));
    }

    public WebElement faceBookIcon(){
        return Hooks.driver.findElement(By.className("facebook"));
    }
    public WebElement twitterIcon(){
        return Hooks.driver.findElement(By.className("twitter"));
    }
    public WebElement rssIcon(){
        return Hooks.driver.findElement(By.className("rss"));
    }
    public WebElement youtubeIcon(){
        return Hooks.driver.findElement(By.className("youtube"));
    }
    public WebElement addToWishlistIcon(){
        return Hooks.driver.findElements(By.xpath(
                "//button[@class=\"button-2 add-to-wishlist-button\"]")).get(2);

    }
    public WebElement successMessage(){
        return Hooks.driver.findElement(By.cssSelector(".bar-notification.success"));

    }
    public WebElement wishListPageBtn(){
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }

}



