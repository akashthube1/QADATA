package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActtimeLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://online.actitime.com/tcs4/login.do");
		dr.manage().window().maximize();
		//WebElement wb = dr.findElement(By.xpath("div/input[@class='_2IX_2- VJZDxU']"));
		WebElement wb = dr.findElement(By.id("username")); 
		wb.sendKeys("thubeakash555@gmail.com");
		Thread.sleep(3000);
		
	    WebElement wb1 = dr.findElement(By.name("pwd"));
		wb1.sendKeys("Akash@1000");
		Thread.sleep(3000);
		
	    dr.findElement(By.id("loginButton")).click();
	    Thread.sleep(3000);
	    
	    dr.close();
	}

}
