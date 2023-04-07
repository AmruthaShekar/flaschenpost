package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.TestBase;
import page.FlaschenPostHomePage;
import page.FlaschenPostZipCodePage;

public class FlaschenPostZipCodePageTest extends TestBase{
	
	FlaschenPostZipCodePage flaschenPostZipCodePage;
//	FlaschenPostHomePage flaschenPostHomePage;
	
		
	@BeforeClass
	public void setUp() {
		intialization();
		flaschenPostZipCodePage = new FlaschenPostZipCodePage();
	}
    
	@Test
	public void deliveryAreaTest() {		
	Assert.assertTrue(flaschenPostZipCodePage.validateDeliveryArea());	
	}
	
	@Test
	public void postalCodeTest() {
		boolean flag = flaschenPostZipCodePage.validatePostalCode();
		Assert.assertTrue(flag);	
		System.out.println(" postalCodeTest");
	}
	
	@Test
	public void setPostalCodeTest() throws InterruptedException {
		flaschenPostZipCodePage.writePostalCode();		
	}
	
	@Test
	public void homePageTest() {
		String title = flaschenPostZipCodePage.verifyHomePageTitle();
		Assert.assertEquals(title, "flaschenpost.de - Lebensmittel & Getränke in nur 120 Minuten");		
	}
	
	@Test
	public void beerSelectionTest(){
		flaschenPostZipCodePage.addToCart();
	}
}
