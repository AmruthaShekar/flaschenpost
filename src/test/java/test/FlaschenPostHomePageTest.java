package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import page.FlaschenPostHomePage;
import page.FlaschenPostZipCodePage;


public class FlaschenPostHomePageTest extends TestBase{
	
//	FlaschenPostHomePage flaschenPostHomePage;
	FlaschenPostZipCodePage flaschenPostZipCodePage;
	
//	public FlaschenPostHomePageTest() {
//		super();
//	}
	
	@BeforeClass
	public void setUp() {
		intialization();
		flaschenPostZipCodePage = new FlaschenPostZipCodePage();
		
	}
	
/*	public void setUp() throws InterruptedException {
		intialization();
	flaschenPostZipCodePage = new FlaschenPostZipCodePage();
			
		
	}*/
	
	@Test
	public void beerSelectionTest() throws InterruptedException {
//		flaschenPostHomePage = new FlaschenPostHomePage();
//		flaschenPostZipCodePage.writePostalCode();	
		Thread.sleep(3000);
//		flaschenPostZipCodePage.selectBeer();
//		System.out.println("Test");
	}
	
/*	@Test
	public void beerCategorySelectionTest() {
		flaschenPostHomePage.selectPils();
	}
	
	@Test
	public void cartTest() {
		flaschenPostHomePage.addToCart();
	} */
	
}
