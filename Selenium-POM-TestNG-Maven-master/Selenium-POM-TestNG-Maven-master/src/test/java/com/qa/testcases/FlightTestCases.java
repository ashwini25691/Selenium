package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.FlightResultPage;
import com.qa.pages.HomePage;
import com.qa.pages.SearchFlightsPage;

public class FlightTestCases extends TestBase {

	HomePage homepage;

	public FlightTestCases() {
		super();
	}

	/*
	 * @BeforeTest public void setExtentReport() { setExtend(); }
	 */

	@BeforeSuite(alwaysRun = true)
	public void setUp() {
		initializaton();
		homepage = new HomePage();
	}

	@Test(groups = { "Simple", "UI" })
	public void TC001_CheckifLogoisPresent() {
		boolean flag = homepage.isLogoDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(groups = { "Functionality" })
	public void TC002_SelectFlightOption() {
		homepage.selectFlightOption();
	}

	@Test(groups = { "Simple", "UI" })
	public void TC003_CheckifLogoisPresent() {
		boolean flag = homepage.isLogoDisplayed();
		Assert.assertTrue(flag);
	}

	@Test
	public void TC004_SelectFlightOption() {
		homepage.selectFlightOption();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		// FormatResult();
		tearDownMain();
	}

}
