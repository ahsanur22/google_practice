package com.google.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.Testbase;
import com.google.pages.bestSellersProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bestSellersProduct extends Testbase{
	
	
	@Given("I am in amazon home page")
	public void i_am_in_amazon_home_page() {
		launchBrowser();
	}

	@When("I click on the all button")
	public void i_click_on_the_all_button() {
		
		WebElement allbutton = driver.findElement(By.id("nav-hamburger-menu"));
		allbutton.click();
	  
	}

	@When("I click on the best sellers button")
	public void i_click_on_the_best_sellers_button() {
		
		bestSellersProductPage bp = new bestSellersProductPage(driver);
		bp.clickBestSeller();
	}

		
		@Then("I can see the list of best selling products successfully")
		public void i_can_see_the_list_of_best_selling_products_successfully() {
			
			bestSellersProductPage bp = new bestSellersProductPage(driver);
			
			bp.gettingbestsellersText();
			
			closeAll();
			
		   
		}
		
		
	}




