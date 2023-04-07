package page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import base.TestBase;

public class FlaschenPostZipCodePage extends TestBase{
	
	@FindBy(id = "zipcode")
	WebElement deliveryarea;  
		
	@FindBy(xpath = "//input[@class='fp_input']")
	WebElement postalcode;	
			
	@FindBy(xpath = "//button[text()=' Geht klar ']")
	WebElement comeonbtn;
	
//	@FindBy(xpath = "(//div[@class='button_wrapper col-12 col-sm-6 fp_noPadding']//child::button[@type='button'])[1]")
//	WebElement comeonbtn;	
	
//	@FindBy(xpath = "(//div/button)[5]")
//	WebElement comeonbtn;
			
//	@FindBy(css = ".fp_button fp_button_primary fp_button_large")
//	WebElement comeonbtn;
			
//	@FindBy(xpath = "//*[@id=\"zipcode\"]/div/div[1]/div[2]/div/div/div/div[3]/div/button[1]")
//	WebElement comeonbtn;
		
//	@FindBy(xpath = "//button[@class='fp_button fp_button_primary fp_button_large']")
//	WebElement comeonbtn;
	
			
//	@FindBy(xpath = "//a[contains(@href, '/bier')]")
//	WebElement beer; 
	
//	@FindBy(xpath = "//a[@class='i-NSiIDajmQlEG0nBaqy-|19']")
//	WebElement beer; 
	
	
//	@FindBy(xpath = "//ul/li[8]")
//	WebElement beer;
	
	
//	@FindBy(xpath = "//span[text()='Bier']")
//	WebElement beer;
	
	@FindBy(xpath = "//span[contains(text(), 'Bier')]")
	WebElement beer;
		
	
/*	@FindBy(xpath = "//a[contains(@href, '/bier/pils')]")
	WebElement pils;
	
	@FindBy(xpath = "//a[contains(@href, '/glucks/glucks-pils')]")
	WebElement selectBeer;
			
	@FindBy(className = "btn btn-link shadow-none fp_article_basket_adda")
	WebElement addBeertoCart;
	
	public void selectBeer() {		
		beer.click();
	}
	
	public void selectPils() {		
		pils.click();
	}
	
	public void addToCart() {
		selectBeer.click();
		addBeertoCart.click();
	} 	*/
	
	public FlaschenPostZipCodePage() {		
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateDeliveryArea() {
		return deliveryarea.isDisplayed();		
	}
	
//	public void deliveryArea() {
//		deliveryarea.click();
//	}
		
//	public void submitPostalCode() {
//		comeonbtn.click();			
//	}
	
	public boolean validatePostalCode() {
		return postalcode.isDisplayed();
	}
	
	public void writePostalCode(){
//		deliveryArea();
		deliveryarea.click();
//		Thread.sleep(3000);
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(postalcode)).sendKeys("48143");	
//		submitPostalCode();
//		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(comeonbtn)).click();
		comeonbtn.click();	
//		return new FlaschenPostHomePage();
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public void addToCart() {
//		Thread.sleep(3000);
//		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(beer)).click();
//		beer.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", beer);
	} 	
}
