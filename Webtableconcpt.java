package com.seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableconcpt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement Tablehead = driver.findElement(By.xpath("//table[@id = 'customers']//tr[1]//th[2]"));
		WebElement Table = driver.findElement(By.xpath("//table[@id = 'customers']//tr[2]//td[1]"));
		
		String Tabval = Table.getText();
		System.out.println(Tabval);
		
		/*for (int r = 2; r<=6; r++) {
			for(int c = 1; c<=3; c++) {
				WebElement Result = driver.findElement(By.xpath("//table[@id = 'customers']//tr["+r+"]//td["+c+"]"));
				String Textval = Result.getText();
				System.out.println(Textval);
			}
			System.out.println(" ");
		}*/
		
		for (int hr = 1; hr<=1; hr++) {
			for (int hc = 1; hc<=3; hc++) {
			WebElement tabhead = driver.findElement(By.xpath("//table[@id = 'customers']//tr[1]//th["+hc+"]"));
			String Headval = tabhead.getText();
			System.out.println(Headval);
			for(int r = 2; r<=7; r ++) {
				for (int c = 1; c<=3; c++) {
					WebElement tabres = driver.findElement(By.xpath("//table[@id = 'customers']//tr["+r+"]//td["+c+"]"));
					String Tabvalue = tabres.getText();
					System.out.println(Tabvalue);
					
				}
			}
			System.out.println(" ");
		}
	}
System.out.println(" ");
}};
