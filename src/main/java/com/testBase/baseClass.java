package com.testBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class  baseClass {
	 
		public static WebDriver driver;
		public static Actions ac;
		public static Robot r;
		public static Alert al;
		public static JavascriptExecutor js;
		public static Select s;
		
		public static WebDriver launchurl(String url) {
			
			
			driver.get(url);
			return driver;
			
		}
		public static void click_Element(WebElement ele) {
			if (ele.isDisplayed()) {
			ele.click();	
			}
		}
		public static void exit() {
			driver.quit();
		}
		
		
		public static void send_Values(WebElement ele,String value) {
			if (ele.isDisplayed()) {
			ele.sendKeys(value);	
			}
		}
		
		public static void implicit_wait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
			
		}
		public static void screen_Shot(String name) throws IOException {
			TakesScreenshot tc = (TakesScreenshot)driver;
			File src = tc.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\91831\\eclipse-workspace2\\Goiboibo\\ScreenShot"+name+".png");
			FileUtils.copyFile(src, des);
		}
		public static void frame_Using_Value(String value) {
			driver.switchTo().frame(value);
		}
		
		public static void frame_Using_Index(int index) {
			driver.switchTo().frame(index);
		}
		
		public static void frame_Using_Webelement(WebElement ele) {
			driver.switchTo().frame(ele);
		}
		public static void frame_Using_parentFrame() {
			driver.switchTo().parentFrame();
		}
		public static void frame_Using_MainFrame() {
			driver.switchTo().defaultContent();
		}
		
		public static void moveTo_Element(WebElement ele) {
			ac = new Actions(driver);
			ac.moveToElement(ele).build().perform();
		}
		
		public static void right_Click(WebElement ele) {
			ac = new Actions(driver);
			ac.contextClick(ele).build().perform();
		}
		
		public static void close_browser() {
			driver.close();
		}
		
		public static void maximize() {
			driver.manage().window().maximize();
		}
		
		public static void page_Title() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		public static void page_CurrentUrl() {
			String cu = driver.getCurrentUrl();
			System.out.println(cu);
		}
		
		public static void fillTextBox(WebElement ele,String value) {
			ele.sendKeys(value);
		}
		
		public static void double_Click(WebElement ele) {
			ac = new Actions(driver);
			ac.doubleClick(ele).perform();
		}
		
		public static void drag_and_Drop(WebElement src,WebElement des) {
			ac = new Actions(driver);
			ac.dragAndDrop(src, des);
		}
		
		public static void getDate_And_Time() {
			Date d = new Date();
			System.out.println(d);
		}
		
		public static void getting_Text(WebElement ele) {
			String t = ele.getText();
			System.out.println(t);	
		}
		
		public static void getting_Attribute(WebElement ele, String name) {
		 String a  = ele.getAttribute(name);
		 System.out.println(a);
		}
		
		public static void key_Up(WebElement ele,CharSequence key) {
		  ac = new Actions(driver);
		  ac.keyDown(ele, key).perform();
		}
		
		public static void key_Down(WebElement ele,CharSequence key) {
		  ac = new Actions(driver);
		  ac.keyUp(ele, key).perform();
		}
		public static void for_Cut() throws AWTException {
			r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_X);
		}
		public static void for_copy() {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		}
		public static void for_Paste() {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
		}
		
		public static void alert_Accept() {
			al= driver.switchTo().alert();
			al.accept();
		}
		
		public static void alert_Dismiss() {
			al= driver.switchTo().alert();
			al.dismiss();
		}
		
		public static void alert_Sendkey(String text) {
			al= driver.switchTo().alert();
			al.sendKeys(text);
		}
		
		public static void alert_Gettext() {
			al= driver.switchTo().alert();
			String text = al.getText();
			System.out.println(text);	
		}
		
		public static void executeJavaScript(String command, WebElement ele) {
			js=(JavascriptExecutor)driver;
			executeJavaScript(command, ele);
		}
		
		public static void javaScript_click(WebElement ele) {
			js.executeScript("arguments[0].click", ele);
		}
		
		public static void js_scrollDown(WebElement ele) {
			js.executeScript("arguments[0].scrollIntoView(true)",ele );
		}
		
		public static void js_scrollUp(WebElement ele) {
			js.executeScript("argument[0].scrollIntoView(false)",ele);
		}
		
		public static void select_Index(WebElement dropdown, int index) {
			s = new Select(dropdown);
			s.selectByIndex(index);
		}
		
		public static void select_Value(String value) {
			s.selectByValue(value);
		}
		
		public static void select_Text(String text) {
			s.selectByVisibleText(text);
		}
		
		public static void select_MultiDropDown() {
			s.isMultiple();
		}
		
		public static void select_deSelectIndex(int index) {
			s.deselectByIndex(index);
		}
		
		public static void select_deSelectValue(String value){
			s.deselectByValue(value);
		}
		
		public static void select_deSelectText(String text) {
			s.deselectByVisibleText(text);
		}
	    public static void select_allOption() {
	    	List<WebElement> options = s.getOptions();
	    	for (WebElement opt : options) {
	    		System.out.println(opt.getText());
				
			}
		}
	    
		public static void select_allDeselect() {
			s.deselectAll();
		}
		
		public static void navigate_urlPage(String url) {
			driver.navigate().to(url);
		}
		
		public static void navigate_nextPage() {
			driver.navigate().forward();
		}
		
		public static void navigate_backPage() {
			driver.navigate().back();
		}
		
		public static void navigate_Refresh() {
			driver.navigate().refresh();
		}
		public static void parentWindow() {
			String parentId = driver.getWindowHandle();
			driver.switchTo().window(parentId);
		}
		public static void webtable_tableRow(WebElement table, int index) {
			List<WebElement> listofrows = table.findElements(By.tagName("tr"));
			WebElement rows = listofrows.get(index);	
		}
		public static void webtable_tableData(WebElement row, int index) {
			List<WebElement> alldata = row.findElements(By.tagName("td"));
			WebElement data = alldata.get(index);
			System.out.println(data.getText());
		}
		
		public static void thread_Sleep(int minutes) {
			try {
				Thread.sleep(minutes);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		public static void clickonelement(WebElement ele) {
			ele.click();
		}
		public static void inputvalues(WebElement ele, String data) {
			ele.sendKeys(data);
			
		}
		
		public static WebDriver browserlaunch(String browsername) {
			
			if (browsername.contains("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions ch = new ChromeOptions();
				ch.addArguments("Incognito");
			    driver = new ChromeDriver(ch);
				driver.manage().window().maximize();
			
			}
			else if (browsername.contains("edge")) {
			WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver();
			
				
			}
			else if (browsername.contains("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
			
				
			}
			driver.manage().window().maximize();
			return driver;
		}
		
			

		
	}





