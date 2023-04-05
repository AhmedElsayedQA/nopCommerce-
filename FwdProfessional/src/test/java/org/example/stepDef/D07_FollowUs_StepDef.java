package org.example.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_homePage;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class D07_FollowUs_StepDef {
    P03_homePage homePage=new P03_homePage();
    @When("user clicks on facebook icon")
    public void clickOnFacebookIcon(){
        homePage.faceBookIcon().click();

    }
    @Then("user should be directed to facebook page")
    public void directedToFacbookPage(){
         Set<String> pages=Hooks.driver.getWindowHandles();
        Iterator<String> it=pages.iterator();
        String parentId=it.next();
        String childId=it.next();
        Hooks.driver.switchTo().window(childId);
        String actualURL=Hooks.driver.getCurrentUrl();
        String expectedURl="https://www.facebook.com/nopCommerce";
        System.out.println(actualURL);
        Assert.assertTrue(actualURL.contains(expectedURl));


    }
    @When("user clicks on twitter icon")
    public void clickOnTwitterIcon(){
        homePage.twitterIcon().click();
    }
    @Then("user should be directed to twitter page")
    public void directedToTwitterPage(){
        Set<String> pages=Hooks.driver.getWindowHandles();
        Iterator<String> it=pages.iterator();
        String parentId=it.next();
        String childId=it.next();
        Hooks.driver.switchTo().window(childId);

        String actualURL=Hooks.driver.getCurrentUrl();
        String expectedURl="https://twitter.com/nopCommerce";
        System.out.println(actualURL);
        Assert.assertTrue(actualURL.contains(expectedURl));

    }

    @When("user clicks on rss icon")
    public void clickOnRssIcon(){
        homePage.rssIcon().click();

    }
    @Then("user should be directed to rss page")
    public void directedToRssPage(){
        Set<String> pages=Hooks.driver.getWindowHandles();
        Iterator<String> it=pages.iterator();
        String parentId=it.next();
        String childId=it.next();
        Hooks.driver.switchTo().window(childId);

        String actualURL=Hooks.driver.getCurrentUrl();
        String expectedURl="https://demo.nopcommerce.com/new-online-store-is-open";
        System.out.println(actualURL);
        Assert.assertTrue(actualURL.contains(expectedURl));

    }
    @When("user clicks on youtube icon")
    public void clickOnYoutubeIcon(){
        homePage.youtubeIcon().click();

    }
    @Then("user should be directed to youtube page")
    public void directedToYoutubePage(){
        Set<String> pages=Hooks.driver.getWindowHandles();
        Iterator<String> it=pages.iterator();
        String parentId=it.next();
        String childId=it.next();
        Hooks.driver.switchTo().window(childId);

        String actualURL=Hooks.driver.getCurrentUrl();
        String expectedURl="https://www.youtube.com/user/nopCommerce";
        System.out.println(actualURL);
        Assert.assertTrue(actualURL.contains(expectedURl));

    }

}
