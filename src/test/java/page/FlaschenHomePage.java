package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FlaschenHomePage extends TestBase {

	@FindBy(xpath = "//a[contains(@href, '/bier')]")
	WebElement beer;  
	
	@FindBy(xpath = "//a[contains(@href, '/bier/pils')]")
	WebElement pils;
	
	@FindBy(xpath = "//a[contains(@href, '/glucks/glucks-pils')]")
	WebElement selectBeer;
			
	@FindBy(className = "btn btn-link shadow-none fp_article_basket_adda")
	WebElement addBeertoCart;
	
	public FlaschenHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectBeer() {		
		beer.click();
	}
	
	public void selectPils() {		
		pils.click();
	}
	
	public void addToCart() {
		selectBeer.click();
		addBeertoCart.click();
	}
	
}
