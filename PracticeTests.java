package com.orange.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.orange.base.library.Base;
import com.orange.pages.LoginPage;

public class PracticeTests extends Base {
@Ignore
	@Test
	public void practice() {
		try {

			LoginPage home = new LoginPage();
			home.UsernameAndPassword("Admin", "admin123");
			Library.hold(2);
			home.LoginButton();
			Library.hold(3);
			home.MyInfoTab();

			// Profile Pic button on MyInfo Page
			Library.Clickk(By.cssSelector(
					"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-navigation > div.orangehrm-edit-employee-imagesection > div.orangehrm-edit-employee-image-wrapper > div"));

			// Add button to upload picture
			/*
			 * Library.Clickk(By.cssSelector(
			 * "#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div > form > div.oxd-form-row > div > div > div:nth-child(2) > div > button > i"
			 * ));
			 */

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			String picture_path = "C:\\Users\\ahmad\\Downloads\\M5.jpg";
			
			
				
			
			
			
			driver.findElement(By.cssSelector(
					"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div > form > div.oxd-form-row > div > div > div:nth-child(2) > input")).sendKeys(picture_path);

			
						
			
			
			

			Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div > form > div.oxd-form-actions > button"));

		} catch (Exception e) {
			// TODO: handle exception
		}

	}




@Test
public void areej () throws InterruptedException {
	
		
	
	
	LoginPage home = new LoginPage();
	home.UsernameAndPassword("Admin", "admin123");
	home.LoginButton();
	Library.hold(3);
	
	Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(3) > a > span"));
	Library.hold(3);
	
	
	Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div:nth-child(1) > div > div:nth-child(9) > div > button.oxd-button.oxd-button--medium.oxd-button--label-success.oxd-table-cell-action-space"));
	Library.textInput(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div > input"), "2000-10-10");
	Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(2) > div > div.oxd-grid-item.oxd-grid-item--gutters.orangehrm-leave-filter.--span-column-2 > div > label > span"));
	Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));
	Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--ghost"));
	
	/*
	 * Library.Clickk(By.
	 * cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li:nth-child(5)"
	 * )); Library.hold(3); Library.HiddenElementClick(By.xpath(
	 * "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/ul/li[4]/a"));
	 * Library.hold(3); Library.hold(3);
	 */

	
	
	/*
	 * Library.HiddenElementClick(By.xpath(
	 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]"));
	 * Library.hold(3);
	 * 
	 * WebElement box = driver.findElement(By.xpath("cssSelector"));
	 * box.sendKeys(Keys.TAB,Keys.ENTER);
	 */
	

}
































}
