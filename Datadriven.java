package com.seleniumconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Datadriven {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chrome105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		FileInputStream fs = new FileInputStream("D:\\TQM1.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet s = wb.getSheet(0);
		
		for (int i = 1; i <=6;i++) {
			String UserName = s.getCell(1, i).getContents();
			String Password = s.getCell(2, i).getContents();
			
			driver.findElement(By.name("email")).sendKeys(UserName);
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys(Password);
	
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
			driver.navigate().refresh();
			
		}
		

	}

}
