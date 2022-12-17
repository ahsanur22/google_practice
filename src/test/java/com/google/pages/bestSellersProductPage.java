package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bestSellersProductPage {
	// web element
	// i can write a method to click on the all button
	
	
		WebDriver driver;
		
		public bestSellersProductPage(WebDriver dr ) {
			this.driver = dr;
			PageFactory.initElements(dr,this);
		}
	
	@FindBy(xpath = "(//a[@class='hmenu-item' and contains(text(),'Best Sellers')])[1]")
	WebElement bestsellers;
	
	public void clickBestSeller() {
		bestsellers.click();
	}
	
	
	
	@FindBy(xpath = "//span[@class='a-size-extra-large a-color-base _p13n-zg-banner-landing-page-header_style_zgLandingPageBannerText__3HlJo']")
	WebElement bestsellersText;
	
	public void gettingbestsellersText() {
		System.out.println(bestsellersText.getText());
	}
	

}
