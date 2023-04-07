package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import page.FlaschenHomePage;
import page.FlaschenPostZipCodePage;

public class FlaschenHomePageTest extends TestBase{
	
	FlaschenPostZipCodePage flaschenPostZipCodePage;
	FlaschenHomePage flaschenHomePage;
	
	@BeforeClass
	public void setUp() {
		intialization();
		flaschenPostZipCodePage = new FlaschenPostZipCodePage();
//		flaschenHomePage = new FlaschenHomePage();
	}
	
	
	@Test
	public void beerSelectionTest() throws InterruptedException {		
		flaschenPostZipCodePage.writePostalCode();	
		Thread.sleep(3000);
//		flaschenPostHomePage.selectBeer();
		System.out.println("Test");
	}
}
