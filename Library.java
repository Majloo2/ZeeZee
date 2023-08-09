package com.orange.base.library;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {

	public static final Logger log = LogManager.getLogger(Library.class);
	private int waitInSec = 90;
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver _driver) {
		if (_driver != null) {
			this.driver = _driver;
		}
	}

	private void startChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
	}

	private void PageLoadCompelte() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitInSec));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(waitInSec));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(waitInSec));
	}

	public void sleep(double inSeconds) {
		try {
			Thread.sleep((long) (inSeconds * 1000));
		} catch (Exception e) {
			log.error("Error: ", e);
		}
	}

	public enum Browsers {
		CHROME
	}

	public WebDriver startABrowser(Browsers browser) throws Exception {
		switch (browser) {
		case CHROME:
			startChromeBrowser();
			break;

		default:

			startChromeBrowser();
			break;
		}

		sleep(5);

		// driver.manage().deleteAllCookies();

		driver.manage().window().maximize();
		PageLoadCompelte();
		return driver;
	}

	public void HiddenElementClick(By by) {
		WebElement elem = driver.findElement(by);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elem);

		elem.click();

	}

	public void MoveToElement(WebElement elem) {

		Actions action = new Actions(driver);
		action.moveToElement(elem).click().build().perform();

	}
	public void ClearText (By by) {
		
		WebElement element = driver.findElement(by);
		element.clear();
	}
	public void HoverOver(By by) {
		PageLoadCompelte();
		WebElement elem = driver.findElement(by);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elem);

	}

public void EmptyText (By by) throws InterruptedException {
		
		WebElement element = driver.findElement(by);
		element.sendKeys(Keys.CONTROL+"a");
		hold(5);
		element.sendKeys(Keys.DELETE);
	}

	public void CheckBoxSelect(By by) {
		WebElement box = driver.findElement(by);

		if (box.isSelected()) {

		} else {
			box.click();
		}
	}

	public void NextElementTabAndTwoDown(By by) throws InterruptedException  {
		
		WebElement element = driver.findElement(by);
		element.sendKeys(Keys.TAB);
		hold(5);
		element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
	}
	
	
	
	
	
	
	public void ClickBack() {
		driver.navigate().back();
	}

	public void scroll(WebElement elem) {

		Actions action = new Actions(driver);
		action.scrollToElement(elem).build().perform();
		sleep(1);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void select(By by, String optionValue) {

		WebElement options = driver.findElement(by);

		Select select = new Select(options);
		options.click();
		select.selectByVisibleText(optionValue);

	}
	public void  ArrowDownMovement(By by) {
		WebElement DropDownList = driver.findElement(by);
		DropDownList.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
	}
		
	public void hiddenDiv(By by, By by2) {

		driver.findElement(by).findElement(by2).click();
	}

	public void Clickk(By by) {
		PageLoadCompelte();
		WebElement item = driver.findElement(by);
		item.click();
	}

	public void MoveToElementAndclicke(WebElement element) {

		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();

	}

	public void DropDownOption(By by, String optionValue) {

		WebElement dropDownElem = driver.findElement(by);

		Select select = new Select(dropDownElem);
		select.selectByVisibleText(optionValue);

	}
	public void hold(long input) throws InterruptedException {

		Thread.sleep(input*1000);
		
	}
	public void textInput(By by, String inputString) throws InterruptedException {

		WebElement textElement = driver.findElement(by);
		textElement.sendKeys(Keys.CONTROL+"a");
		hold(5);
		textElement.sendKeys(Keys.DELETE);
		textElement.clear();
		textElement.sendKeys(inputString);

	}

	
	
	public void  boxField(By by, String input) throws InterruptedException {

		WebElement text = driver.findElement(by);
		hold(3);
		text.click();
		hold(3);
		text.sendKeys(input);
		
	}
	
	public void scrollIntoCenter(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public WebElement Visibility(By by) {
		WebElement elem = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitInSec));
		elem = wait.until(ExpectedConditions.visibilityOfElementLocated(by));

		return elem;
	}
	
	
	public void  ListWeb (By by, int number) {
		
		List <WebElement> links = driver.findElements(by);
		WebElement choice = links.get(number);
		choice.click();
		
		
		
		
		
	}
	
	public void ThirdOptionDown (By by) throws InterruptedException {
		
		
		  WebElement element = driver.findElement(by);
		  element.click();
		  
		  
		  element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		  hold(3); 
		  element.sendKeys(Keys.ENTER); 
		  hold(2);
		 
				
		
		
		//Library.ListWeb(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-custom-fields > div > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div > div.oxd-select-text--after"), number);
		
		/*
		 * List <WebElement> calendar = driver.findElements(By.xpath(
		 * "//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/comment()"
		 * )); Library.hold(6); calendar.get(BloodType).click(); Library.hold(6);
		 */
		
		//Library.select(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-custom-fields > div > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div > div.oxd-select-text-input"), bloodtype);
	}
	
	
	
	public void SecondOptionDown (By by) throws InterruptedException {
		
		
		  WebElement element = driver.findElement(by);
		  element.click();
		  
		  
		  element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		  hold(3); 
		  element.sendKeys(Keys.ENTER); 
		  hold(2);
	}
	
	
	
	
	public String getAbslutePath(String PicUpload) {
		String finalAbsolutePath = null;
		try {
			
			File testData = new File(PicUpload);
			finalAbsolutePath = testData.getAbsolutePath();
			
						
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return finalAbsolutePath;
				
	}
	
	
	
	
	public void UploadFile(By by, String PhotoPath) {
		
		String WantedPhoto = (PhotoPath);
		
		
		driver.findElement(by).sendKeys(WantedPhoto);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void GoBack () {
		driver.navigate().back();
	}
}
