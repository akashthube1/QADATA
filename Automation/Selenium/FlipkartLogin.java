package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.filpkart.com");
		//WebElement wb = dr.findElement(By.className("_2IX_2- VJZDxU")); 
		WebElement wb = dr.findElement(By.xpath("div/input[@class='_2IX_2- VJZDxU']"));
        wb.sendKeys("9373608873");
        
	    WebElement wb1 = dr.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
        wb1.sendKeys("Akash@100");
	    dr.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
	}

}
