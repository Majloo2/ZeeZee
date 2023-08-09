package com.orange.base.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.orange.base.library.Library.Browsers;

public class Base {
	private String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
	public static final Logger log = LogManager.getLogger(Base.class);
		
		public WebDriver driver;
		public static Library Library;
		
		

		@BeforeMethod
		public void beforeEachTest() {
			
			try {
				Library = new Library();
							
				
				driver = Library.startABrowser(Browsers.CHROME);
				driver.get(URL);
				
			} catch (Exception e) {
				log.error("Error: ", e);			
			}
		}

		@AfterMethod
		public void afterEachTest(ITestResult result) {
			try {
						
				Library.sleep(5);
				
			
				
				// if there is a open browser
				if (!(driver == null)) {
					driver.close(); // just close a browser
					if(! (driver.getClass().equals(ChromeDriver.class)) ) {
						driver.quit(); // it will close the browser at the same, driver object gets destroyed
						// driver become null
					}
					
				}
			} catch (Exception e) {
				log.error("Error: ", e);		
			}
		}
}
