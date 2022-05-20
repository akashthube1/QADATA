package com.seleniumwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.filpkart.com");
		//dr.manage().window().maximize();
		Thread.sleep(3000);
		String titlepage = dr.getTitle();
		System.out.println(titlepage);
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		
		dr.findElement(By.xpath("//div[text()='Grocery']")).click(); 
		Thread.sleep(3000);
		String url = dr.getCurrentUrl();
	    System.out.println(url);
		String titlepage1 = dr.getTitle();
		System.out.println(titlepage1);
		
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _1IsWyb _3dESVI']")).click();
		Thread.sleep(3000);
		
		
		//dr.findElement(By.xpath("//button[@class='_2KpZ6l _1IsWyb _3dESVI']")).click();
		dr.close();
	}

}
