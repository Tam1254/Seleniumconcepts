package com.seleniumconcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selcon {

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws AWTException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Username = driver.findElement(By.xpath("//input[@type = 'text']"));
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
		WebElement Login = driver.findElement(By.name("login"));
	
		Username.sendKeys("mailtamiz@gmail.com");
		Password.sendKeys("Tamtam@123");
		Login.click();
		WebElement Your_Profile = driver.findElement(By.xpath("//div[@class = 'om3e55n1 alzwoclg']"));
		Your_Profile.click();
		Actions ac = new Actions(driver);
		ac.moveToElement(Your_Profile).build().perform();
		Thread.sleep(5000);
		WebElement Logout = driver.findElement(By.xpath("//div[@class = 'alzwoclg cqf1kptm siwo0mpr gu5uzgus']/div//span[text() = 'Log Out']"));
		Logout.click();
		driver.navigate().refresh();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		js.executeScript("window.open()");
		ArrayList <String> tab1 = new ArrayList <String> (driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		driver.get("https://www.amazon.in/");
		WebElement Account_List = driver.findElement(By.xpath("//span[text() = 'Account & Lists']"));
		ac.moveToElement(Account_List).build().perform();
		WebElement MyAccounts = driver.findElement(By.xpath("//div[@id = 'nav-al-your-account']//span[text() = 'Your Account']"));
		MyAccounts.click();
		
		js.executeScript("window.open()");
		ArrayList <String> tab2 = new ArrayList <String> (driver.getWindowHandles());
		driver.switchTo().window(tab2.get(2));
		driver.get("https://www.flipkart.com/");
		WebElement Closebutton = driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']"));
		ac.moveToElement(Closebutton).build().perform();
		Closebutton.click();
		WebElement Fashion = driver.findElement(By.xpath("//a//div[@class = '_1psGvi SLyWEo'] //div[text() = 'Fashion']"));
		ac.moveToElement(Fashion).build().perform();
		WebElement Women_Ethnic = driver.findElement(By.xpath("//div[@class = '_2IjXr8']//div//a[text() = 'Women Ethnic']"));
		ac.moveToElement(Women_Ethnic).build().perform();
		
		js.executeScript("window.open()");
		ArrayList <String> tab3 = new ArrayList <String> (driver.getWindowHandles());
		driver.switchTo().window(tab3.get(3));
		driver.get("https://www.google.com/");
		WebElement Gmaillink = driver.findElement(By.xpath("//div[@class = 'gb_e gb_f']//a[@class = 'gb_d']"));
		ac.contextClick(Gmaillink).build().perform();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		ArrayList <String> tab1R = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab1R.get(0));
		driver.get("https://www.google.com/");
		
		ArrayList <String> tab2R = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab2R.get(1));
		driver.get("https://www.google.com/");
		
		ArrayList <String> tab3R = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab3R.get(2));
		driver.get("https://www.google.com/");
		
		ArrayList <String> tab4R = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tab4R.get(3));
		driver.get("https://www.flipkart.com//");
		
		js.executeScript("window.open()");
		ArrayList <String> tabnew = new ArrayList <String> (driver.getWindowHandles());
		driver.switchTo().window(tabnew.get(5));
		driver.get("https://www.globalsqa.com/demo-site/sliders/");
		WebElement red = driver.findElement(By.xpath("//div[@id = 'red']//span[contains(@class,'ui-slider-handle')]"));
		
		for(int i = 0; i<=50;i++) {
			red.sendKeys(Keys.ARROW_LEFT);
		}


	}

}
