package com.seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drpdownbootstrap {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chrome105\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		WebElement Drpdwn = driver.findElement(By.xpath("//div[@class = 'comboTreeInputWrapper']//input[@id = 'justAnInputBox']"));
		Drpdwn.click();
		List<WebElement> Drpelements = driver.findElements(By.xpath("//div[@class = 'comboTreeDropDownContainer']//ul//li//span[@class ='comboTreeItemTitle']"));
		System.out.println(Drpelements.size());
		selectmultipledrops(Drpelements, "choice 2","choice 2 2");
		
	}



public static void selectmultipledrops(List<WebElement> ele, String... Value) {
	if(Value[0] == "all") {
		for(WebElement All:ele) {
			All.click();
			
		}
	}
	else {
		for(WebElement All:ele) {
			String res = All.getText();
			for(String val:Value) {
				if(val.equalsIgnoreCase(res)) {
					All.click();
				}
				
			}
		}
	}
}}
