package com.base;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public static WebDriver driver ;
	public static ExtentReports extentReports;
	public static File file;
	
	
	protected static  WebDriver browserLaunch(String name) {
		
		if(name.equalsIgnoreCase("Chrome")) {
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("Incognito");
			 driver=new ChromeDriver(option);
			
		}else if(name.equalsIgnoreCase("Edge")){
			 driver=new EdgeDriver();
			 
		}else if(name.equalsIgnoreCase("FireFox")){
			 driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
    protected static void browserURL(WebDriver driver, String url,int sec) {
    	try {
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		} catch (Exception e) {
			System.out.println("Error Occurs");
			e.printStackTrace();
		}
     
    }
	private String timeStamp;
    
    protected void clickElement(WebDriver driver,WebElement element, int sec) {
    	
    	try {
			new WebDriverWait(driver, Duration.ofSeconds(sec)).until(ExpectedConditions.visibilityOf(element));
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
   
    protected void valuePass(WebDriver driver, String value,WebElement name,int sec) {
    	try {
			new WebDriverWait(driver, Duration.ofSeconds(sec)).until(ExpectedConditions.visibilityOf(name));
			name.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    protected void sleep(int milliSec) {
    	try {
			Thread.sleep(milliSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    //Screenshot Method
	protected void screenShot(WebDriver driver,String name) {
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File(".\\Screenshot\\"+name+".png");
		try {
			FileHandler.copy(scrfile, destfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Java Script Executor Methods
	protected void scroll(WebDriver driver, int x, int y) {
		try {
			
			((JavascriptExecutor) driver)
			.executeScript("window.scrollBy("+x+"," +y+");");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void click(WebDriver driver,WebElement element) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.elementToBeClickable(element));
			((JavascriptExecutor) driver)
			.executeScript("arguments[0].click();", element);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void closeTab() {
		driver.close();
	}

	protected static void terminateBrowser(WebDriver driver2) {
		driver.quit();
	}
   public static void extendReportStart(String location) {
	   extentReports=new ExtentReports();
	   file=new File(location);
	   ExtentSparkReporter sparkReporter =new ExtentSparkReporter(file);
	   extentReports.attachReporter(sparkReporter);
	   extentReports.setSystemInfo("OS", System.getProperty("os.name"));
	   extentReports.setSystemInfo("Java Version", System.getProperty("Java.version"));
   }
   public void extentReportTearDown(String location) throws IOException {
	   extentReports.flush();
	   file=new File(location);
	   Desktop.getDesktop().browse((file).toURI());
   }
   public  String takeScreenshot() throws IOException {
	   TakesScreenshot screenShot=(TakesScreenshot) driver;
	   String timeStamb = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	   File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
	   File destiFile=new File("Screenshort\\.png"+ "_" + timeStamp + ".png");
	   FileUtils.copyFile(sourceFile, destiFile);
	   return destiFile.getAbsolutePath();
	
}
   public static void windowhandles(WebDriver driver, int index) {
	   Set<String> allid = driver.getWindowHandles();
	   List<String>id=new ArrayList<String>(allid);
	   driver. switchTo() .window(id.get(index));
}
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//(//input[@class='oxd-input oxd-input--active'])[2]


