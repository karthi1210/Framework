package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static String windowHandle;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("INCOGNITO");
		driver = new ChromeDriver(chromeOptions);
	}
	
	public static void loadUrl(String url) {
		
		driver.get(url);
		
	}
	
	public static void winMax() {
		
		driver.manage().window().maximize();
		
	}
	
	public static void winMin() {
		
		windowHandle = driver.getWindowHandle();
		driver.manage().window().setPosition(new Point(0, -1000));
		
	}
	
	public static void winMaxAgain() {
		
		driver.switchTo().window(windowHandle);
		winMax();
		
	}
	
	public static void printTitle() {
		
		System.out.println(driver.getTitle());
		
	}
	
	public static String returnTitle() {
		
		return driver.getTitle();
		
	}
	
	public static void printCurrentUrl() {
		
		System.out.println(driver.getCurrentUrl());
		
	}
	
	public static String returnCurrentUrl() {
		
		return driver.getCurrentUrl();
		
	}
	
	public static void fill(WebElement ele,String s) {
		
		ele.sendKeys(s);
		
	}
	
	public static void btnClick(WebElement ele) {
		
		ele.click();
		
	}
	
	public static void browserClose() {
		
		driver.close();
	}
	
	public static void browserQuit() {
		
		driver.quit();
		
	}
	
	public static String getData(int rowNumber,int cellNumber) throws IOException {
		
		File file = new File("C:\\Users\\Karthiksofia\\eclipse-workspace\\FrameWork\\DataDrivenFile\\20th oct trail.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("Karthik");
		
		Row row = sheet.getRow(rowNumber);
		
		Cell cell = row.getCell(cellNumber);
		
		String string = cell.toString();
		
		return string;
		
	}
	
	public static void screenShot(String filename) throws IOException {
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		
		File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Karthiksofia\\eclipse-workspace\\FrameWork\\ScreenShots\\"+filename); 
		
		FileUtils.copyFile(src, des);
		
	}
	
	
}
