package com.seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownconcepts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome105\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		WebElement CountryDropdown = driver.findElement(By.name("Country"));
		dropdownsel(CountryDropdown, "Brazil");
		Thread.sleep(3000);
		dropdownsel(CountryDropdown, "Central African Republic");
		//Select ss = new Select(CountryDropdown);
		/*ss.selectByIndex(2);
		Thread.sleep(2000);
		ss.selectByValue("Algeria");
		Thread.sleep(2000);
		ss.selectByVisibleText("Angola");
		Thread.sleep(3000);*/
		
		/*List<WebElement> Opt = ss.getOptions();
		
		for(WebElement e :Opt) {
			if(e.getText().equals("Bangladesh")) {
				e.click();
				break;*/
		
				
			}

	public static void dropdownsel(WebElement ele, String Value) {
	Select ss = new Select(ele);
	List<WebElement> Alloptions = ss.getOptions();
	
	for(WebElement opt :Alloptions) {
		if(opt.getText().equals(Value)) {
			opt.click();
			break;
			
		}
	}
	}}
	

