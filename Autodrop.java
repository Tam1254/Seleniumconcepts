package com.seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autodrop {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome105\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@aria-label = 'Search']")).sendKeys("Java tut");
		Thread.sleep(2000);
		List<WebElement> Dropoptions = driver.findElements(By.xpath("//ul[@role = 'listbox']//ul//li[@role = 'presentation']//div[@role = 'option']"));
		System.out.println(Dropoptions.size());
		
		/*for (WebElement Opt:Dropoptions) {
			if(Opt.getText().contains("beginners")){
				Opt.click();
				break;
			}
		}*/
		
		drpmeth(Dropoptions, "orialspoint");
		

	}
	
	public static void drpmeth(List <WebElement> ele, String Value) {
		for (WebElement Options : ele) {
			if(Options.getText().contains(Value)) {
				Options.click();
				break;
			}
		}
	}

}
