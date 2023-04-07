package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream	input = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/properties/config.properties");			
			prop.load(input);		 
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}catch (IOException e) {			
			e.printStackTrace();
		}		
	}
	
	public static void intialization() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}	
	
	
	/*ChromeOptions options = new ChromeOptions();
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-setuid-sandbox");

                options.addArguments("--remote-debugging-port=9222");

                options.addArguments("--disable-dev-shm-using");
                options.addArguments("--disable-extensions");
                options.addArguments("--disable-gpu");
                options.addArguments("start-maximized");
options.addArguments("disable-infobars");
                System.setProperty("webdriver.chrome.driver", "/Users/sishukla/Downloads/chromedriver");
                
                
                driver = new ChromeDriver(options)
                
                */
}

