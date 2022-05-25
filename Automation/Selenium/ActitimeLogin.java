package com.firefoxbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akash\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://online.actitime.com/thinkquotient2/login.do");
				
		WebElement wb = dr.findElement(By.id("username")); 
		wb.sendKeys("thubeakash555@gmail.com");
		Thread.sleep(3000);
		
	    WebElement wb1 = dr.findElement(By.name("pwd"));
		wb1.sendKeys("Akash@1000");
		Thread.sleep(3000);
		
	    dr.findElement(By.id("loginButton")).click();
	    Thread.sleep(3000);
	    
	    WebElement wb2 = dr.findElement(By.xpath("//input[@class='components-SearchInput-searchInput--3lzZ5EiK']']")); 
	    wb2.sendKeys("calls");
	    //dr.close();

	}

}
