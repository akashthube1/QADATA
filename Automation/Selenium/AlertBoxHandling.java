package com.firefoxbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akash\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		dr.findElement(By.id("alertBox")).click();
		//switch to alert box
		Alert alt = dr.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		
		Thread.sleep(2000);
		
		dr.findElement(By.id("confirmBox")).click();
		Alert alt1 = dr.switchTo().alert();
		Thread.sleep(3000);
		alt1.dismiss();
		
		Thread.sleep(2000);
		
		dr.findElement(By.id("promptBox")).click();
		Alert alt2 = dr.switchTo().alert();
		Thread.sleep(3000);
		alt2.dismiss();
	}

}
