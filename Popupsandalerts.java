package com.seleniumconcepts;

import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupsandalerts {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome105\\chromedriver.exe");
		driver = new ChromeDriver();
		
	
		
		
		

	}



public static void geturl(String url) {
	driver.get(url);

}}
