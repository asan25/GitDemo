package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TextContextSetup;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefinition {
    /**
     * Single Responsibility Principle(SRP)
     * loosely couple--is that mean you class enhance in the future
     * tithed couple--you cannot change method place from one class to another class
     * Factory Design Pattern
     * */
    public String offerPageProductName;
    TextContextSetup textContextSetup;
    public PageObjectManager pageObjectManager;
    public OfferPageStepDefinition(TextContextSetup textContextSetup){
        this.textContextSetup=textContextSetup;
    }

    @Then("user searched for {string} shortname in offers page")
    public void user_searched_for_something_shortname_in_offers_page_to_check_if_product_exist_with_the_same_name(String shortName) throws InterruptedException {
    switchToOffersPage();
        OffersPage offersPage = new  OffersPage(textContextSetup.driver);
        offersPage.searchItem(shortName);
        Thread.sleep(3000);
        offerPageProductName = offersPage.productName();
        System.out.println(offerPageProductName);
    }

    public void switchToOffersPage(){
        //you can use this method
        //if already switched to this page skip it and us if
        //if(textContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
        LandingPage landingPage = textContextSetup.pageObjectManager.getLandingPage();
        landingPage.selectTopDealsPage();

        textContextSetup.genericUtils.SwitchWindowToChild();
    }

    @Then("validate product name in offers page matches with Landing Page")
    public void validate_product_name_in_offers_page_matches_with_landing_page() {
        Assert.assertEquals(offerPageProductName,textContextSetup.landingPageProductName);
    }

}
