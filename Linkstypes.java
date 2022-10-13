package com.seleniumconcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Linkstypes {
	static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome105\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		System.out.println(Alllinks.size());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		
	
	
	for (WebElement Cllink :Alllinks) {
		String goturl = Cllink.getAttribute("href");
		
		if(goturl.isEmpty()||goturl == null) {
			System.out.println("URL IS EMPTY");
			continue;
		}
		
		URL reclink = new URL(goturl);
		
		try {
			HttpURLConnection urcon = (HttpURLConnection)reclink.openConnection();
			urcon.connect();
			if(urcon.getResponseCode()>=400) {
				System.out.println("The link is broken "+ reclink);
				
			}
			else {
				System.out.println("The link is valid" + reclink);
			}
		} catch (IOException e) {
	
		}
		
	}}}




