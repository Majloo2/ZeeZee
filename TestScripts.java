package com.orange.testScripts;

import org.testng.annotations.Test;

import com.orange.base.library.Base;
import com.orange.pages.DashboardPage;
import com.orange.pages.LoginPage;
import com.orange.pages.MyInfoPage;
import com.orange.pages.PerformancePage;
import com.orange.pages.TimePage;

public class TestScripts extends Base {

	
	
	
	
	public void hold(int sec) throws InterruptedException {
		
		Thread.sleep(sec*1000);
	
	}
	
	
	
	@Test//@Ignore
	public void LoginPageTests() {

		try {

			LoginPage home = new LoginPage();

			hold(5);
			home.UsernameAndPassword("Admin2", "admin123");
			home.LoginButton();
			home.ClearUsernameAndPass();

			home.UsernameAndPassword("Admin", "admin1237");
			home.LoginButton();
			home.ClearUsernameAndPass();
			hold(5);
			home.UsernameAndPassword("Admin", "admin123");
			home.LoginButton();
			hold(3);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
sssssssssssssssss
	@Test//@Ignore
	public void DashboardTests() {
		try {

			LoginPage home = new LoginPage();
			hold(5);
			home.UsernameAndPassword("Admin", "admin123");
			home.LoginButton();

			DashboardPage dash = new DashboardPage();

			dash.ClockLogo();
			Library.GoBack();
			hold(3);

			dash.TimeSheetToApprove();
			Library.GoBack();
			hold(3);

			dash.MyLeave();
			Library.GoBack();
			hold(3);

			dash.GearIcon();
			hold(3);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test//@Ignore
	public void MyInfoTestCases() {
		try {

			LoginPage home = new LoginPage();

			hold(2);
			home.UsernameAndPassword("Admin", "admin123");
			home.LoginButton();
			hold(2);
			home.MyInfoTab();

			MyInfoPage MyInfo = new MyInfoPage();
			MyInfo.ClearFullName();
			MyInfo.FirstAndLastName("Ahmad", "M", "Ketaneh");
			hold(4);
			MyInfo.SaveButton();
			hold(5);

			MyInfo.ExpiryDate("2023-08-20");

			hold(5);
			MyInfo.SaveButton();

			MyInfo.BloodTypeList();
			hold(3);

			MyInfo.SmokerBox();
			hold(3);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	//@Ignore
	@Test
	public void TimePageTests() {
		try {

			LoginPage home = new LoginPage();

			hold(2);
			home.UsernameAndPassword("Admin", "admin123");
			home.LoginButton();
			hold(2);
			home.TimeButton();
			hold(2);

			TimePage time = new TimePage();
			hold(4);
			time.EmployeeNameBox("a");
			hold(4);

			time.PickOneEmployee();
			hold(2);

			time.ViewButtonTimeSheetPage();
			hold(3);
			Library.GoBack();
			hold(2);

			time.RecordViewButton();
			hold(2);
			Library.GoBack();

			hold(2);
			time.AttendanceTab();
			hold(3);

			time.PunchingOptionUnderAttendanceTab();
			hold(2);

			time.InOutButtonPunchesPage();
			hold(2);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test//@Ignore
	public void PerformancePageTests() throws InterruptedException {

		try {

			LoginPage home = new LoginPage();

			hold(2);
			home.UsernameAndPassword("Admin", "admin123");
			home.LoginButton();
			hold(2);
			home.PerformanceTab();
			hold(5);

			PerformancePage perf = new PerformancePage();

			perf.EmployeeReviewsArrowButton();
			hold(5);
			perf.EmployeeReviewsArrowButton();
			perf.EmployeeNameBox("pau");
			hold(5);
			perf.ArrowDown();
			hold(3);
			perf.SearchButton();
			hold(3);
			perf.ResetButton();
			
						
			
		}catch (Exception e) {
	// TODO: handle exception
}
	}

	}


