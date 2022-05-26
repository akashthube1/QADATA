package com.firefoxbrowser;

import java.util.*;
import java.util.concurrent.TimeUnit;
//import javax.swing.text.html.HTMLDocument.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukari {

	public static void main(String[] args, Object String) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akash\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.manage().window().maximize();
        dr.navigate().to("https://www.naukri.com/");
        
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		WebElement wb = dr.findElement(By.xpath("//div[text()='Companies]"));
		Actions act = new Actions(dr);
		act.moveToElement(wb).build().perform();
		dr.findElement(By.linkText("Product based")).click();
		
		Set<String> windowid = dr.getWindowHandles();
		Iterator<String> itr = windowid.iterator();
		String parentid=itr.next();
		String childid = itr.next();
		dr.switchTo().window(childid);
		
		dr.findElement(By.xpath("//span[text()='Indian MNC (37)']/preceding-sibling::i")).click();
	}

}
