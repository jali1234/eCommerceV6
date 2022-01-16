package com.eCommerce.testCases;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.eCommerce.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();

		public String baseURL = readconfig.getApplicationURL();
		public String username= readconfig.getUserName();
		public String password= readconfig.getPassword();
		public static WebDriver driver;
		
		
		public static Logger logger;

		@BeforeTest
		@Parameters("browser")		
		public void setup(String br)

		{
		logger=Logger.getLogger("eCommerce");
		PropertyConfigurator.configure("Log4j.properties");
		
		if (br.equals ("chrome"))
		{	
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());		
		driver = new ChromeDriver();
		}
		
		else if (br.equals ("firefox"))
		{	
		System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());		
		driver = new FirefoxDriver();
		}
		
		else if (br.equals ("ie"))
		{	
		System.setProperty("webdriver.ie.driver", readconfig.getIEPath());		
		driver = new InternetExplorerDriver();
		}		
		
		driver.manage().window().maximize();		
		
		}

		@AfterTest

		public void tearDown()
		{
		 driver.quit();
		}
		
		public void captureScreenshot(WebDriver driver, String tname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") +"/Screenshots/" + tname + ".png");
			FileUtils.copyFile(source, target);
			}
			
}
