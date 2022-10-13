package com.seleniumconcepts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selbasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chrome105\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=guru99+selenium");
		driver.findElement(By.xpath("//div[@id = 'web']//ol//li//a//span")).click();
		JavascriptExecutor JE = (JavascriptExecutor)driver;
		JE.executeScript("window.open()");
		ArrayList <String> Tab1 = new ArrayList <String> (driver.getWindowHandles()); 
		driver.switchTo().window(Tab1.get(1));
		driver.get("https://demoqa.com/text-box");
		WebElement Nametag = driver.findElement(By.xpath("//input[@id = 'userName']"));
		System.out.println(Nametag.isDisplayed());
		System.out.println(Nametag.isEnabled());
		driver.navigate().back();
	}
}
