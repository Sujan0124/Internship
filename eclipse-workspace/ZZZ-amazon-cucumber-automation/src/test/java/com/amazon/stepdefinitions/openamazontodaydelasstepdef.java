package com.amazon.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.pages.OpenAmazontodaydeals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before; 

public class openamazontodaydelasstepdef extends Common_Method {
    
    private OpenAmazontodaydeals op;

    public openamazontodaydelasstepdef() {
        op = new OpenAmazontodaydeals(dr); 
    }
    
    @Given("The Amazon website is fully loaded")
    public void openamazon() {
        url("https://www.amazon.in/");
    }
    
    @When("I click the \"Today's Deals\" button")
    public void clicktoday() {
        op.click(); 
    }
    
    @Then("The Daily Deals page should load within 3 seconds")
    public void the_daily_deals_page_should_load_within_3_seconds() {
        
        Duration timeout = Duration.ofSeconds(3);
        WebDriverWait wait = new WebDriverWait(dr, timeout);
        
        By dealsPageConfirmationElement = By.xpath("//h1[contains(text(), 'Today')] | //h1[contains(text(), 'Deals')]");
        
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(dealsPageConfirmationElement));
            
            System.out.println("✅ SUCCESS: The Daily Deals page loaded and the confirmation element was visible within 3 seconds.");
            
        } catch (Exception e) {
            throw new AssertionError("❌ FAIL: The Daily Deals page did NOT load the expected element (" 
                + dealsPageConfirmationElement.toString() + ") within the 3 second limit.", e);
        }
    }
}