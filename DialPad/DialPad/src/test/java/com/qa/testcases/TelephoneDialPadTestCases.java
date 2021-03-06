package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

import org.testng.Assert;
import org.testng.IInvokedMethod;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.utilities.*;


public class TelephoneDialPadTestCases {
	LinkedList<String> combos;
	String strTestDataFilePath;


	@BeforeSuite(alwaysRun = true)
	public void setUp() {
		// initializaton();		
		Path root = Paths.get(".").normalize().toAbsolutePath();
		strTestDataFilePath=root.toString().concat("\\src\\main\\java\\com\\qa\\testdata\\TestData.xlsx");
	}
	@Test(groups = "Negative")
	public void TC001_DigitisBlank(Method method) throws Exception {	


		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(), "[null]");
	}
	
	@Test(groups = "Positive")
	public void TC002_DigitStringHasOnlyOneDigit(Method method) throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(),testObjArray[0][1]);
	}
	
	@Test(groups = "Positive")
	public void TC003_DigitStringHasTwoDigitBothWithThreeAlphabets(Method method) throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(),testObjArray[0][1]);
	}
	
	@Test(groups = "Positive")
	public void TC004_DigitEnterIs1(Method method) throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(),testObjArray[0][1]);
	}
	
	@Test(groups = "Positive")
	public void TC005_DigitEnterIs0(Method method) throws Exception {	


		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(),testObjArray[0][1]);
	}
	
	@Test(groups = "Positive")
	public void TC006_DigitStringHasTwoDigitWithThreeAndFourAlphabets(Method method) throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(),testObjArray[0][1]);
	}
	
	@Test(groups = "Positive")
	public void TC007_DigitStringHasTwoDigitBothWithFourAlphabets(Method method) throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(),testObjArray[0][1]);
	}
	
	@Test(groups = "Negative")
	public void TC008_DigitStringHasOneDigitAlongWIthSpecialCharachter(Method method) throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(),testObjArray[0][1]);
	}
	
	@Test(groups = "Negative")
	public void TC009_DigitStringHasTwoDigitAlongWIthSpecialCharachter(Method method) throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(),testObjArray[0][1]);
	}
	
	@Test(groups = "Positive")
	public void TC010_DigitStringHasMoreThan2Digit(Method method) throws Exception {
		Object[][] testObjArray = ExcelUtils.getTableArray(strTestDataFilePath,"TestData",method.getName());
		combos=TelephoneDialPad.retrieveCombinations((String) testObjArray[0][0]);
		Assert.assertEquals(combos.toString(),testObjArray[0][1]);
	}


}


