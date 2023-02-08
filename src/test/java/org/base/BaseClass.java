package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void toCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
	
		System.out.println(currentUrl);
	}
	
	public static void toEnter(WebElement element, String userText) {
		element.sendKeys(userText);
	}
	
	public static void toClick(WebElement element) {
		element.click();
	}
	
		public void implicityWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void toQuit() {
		driver.quit();

	}
	
	public static void toPerformMoveElement(WebElement element) {

		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void toPreformDragAndDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();
	}

	public static void toPerformDoubleClick(WebElement element) {
		a.doubleClick(element).perform();
	}

	public static void toPerformRightClick(WebElement element) {
		a.contextClick(element).perform();
	}

	public static void toPerformEnterKey() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void toPerformTab() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_TAB);
	}

	public static void toPerformShiftKey() {
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);

	}

	public static void toPerformUpKey() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void toPerformDownKey() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void toPerformScrollDown(WebElement pageDown) {

		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].ScrollIntoView(true)", pageDown);
	}

	public static void toPerformScrollUp(WebElement pageUp) {

		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].ScrollIntoView(false)", pageUp);
	}


}
