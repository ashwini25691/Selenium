package com.qa.testcases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.utilities.TestUtils;
import com.qa.utilities.WebDriverListener;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", TestUtils.WORKSAPCE_PATH + "//drivers//chromedriver.exe");	
		ChromeOptions	chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--proxy-server=104.223.100.80:8080");
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addExtensions(new File("C:\\Users\\Ashwini\\Downloads\\TouchVPN.crx"));
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(chromeOptions.CAPABILITY, chromeOptions);
		
		
		
		ChromeDriver driver=new ChromeDriver(cap);
		driver.get("chrome-extension://bihmplhobchoageeokmgbdihknkjbknd/index.html");
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

		driver.get("https://wallethub.com/join/light");
		driver.findElement(By.cssSelector("a[ng-click='switch_tab('login');")).click();
		


	}

}
