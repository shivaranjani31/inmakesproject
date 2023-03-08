package org.inm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class BaseClass {
public static WebDriver driver;
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void windowMaximize() {
		driver.manage().window().maximize();

	}
	public void launchUrl(String url) {
		driver.get(url);

	}
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;

	}
	
	public static String pageUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}
	public void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);

	}
	public void closeEntireBrowser() {
		driver.quit();

	}
	public void clickBtn(WebElement ele) {
		ele.click();

	}
	public void screenshot(String imgname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File image = ts.getScreenshotAs(OutputType.FILE);
	File f = new File("location+ imagname.png");
	FileUtils.copyFile(image, f);

	}
	public static Actions a;
	
	public static void movethecursor(WebElement targetwebelement) {
		a = new Actions(driver);
		a.moveToElement(targetwebelement).perform();
	}
	public static JavascriptExecutor js;
	public static void scrollthepage(WebElement tarwebele) {
	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollintoview(true)", tarwebele);
	}
	public static void scroll(WebElement element) {
	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollintoview(true)", element);
	}
	
	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\MavenProjects\\excel\\Shiva.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Datas");
		Row r = s.getRow(rowNum);
		Cell c = r.createCell(cellNum);
		int cellType = c.getCellType();
		
		String value = "";
		if (cellType==1) {
			String value2 = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			java.util.Date value1 = c.getDateCellValue();
			}
			else {
				double num = c.getNumericCellValue();
				long l = (long)num;
				String value1 = String.valueOf(l);
				System.out.println(value1);
			}
				

	}
	
	public static void createCell(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\MavenProjects\\excel\\Shiva.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Datas");
		Row r = s.getRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

	public static void createRow(int creRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\MavenProjects\\excel\\Shiva.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void updateDataToParticularCell(int getTheRow, int getTheCell, String exisitingData,
			String writeNewData) throws IOException {
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\MavenProjects\\excel\\Shiva.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.getRow(getTheRow);
		Cell c = r.getCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(exisitingData)) {
			c.setCellValue(writeNewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}
}
