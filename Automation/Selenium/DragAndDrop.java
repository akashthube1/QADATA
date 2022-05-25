package com.firefoxbrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akash\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.manage().window().maximize();
	
		dr.navigate().to("https://jqueryui.com/droppable/");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement wb = dr.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
	    WebElement wb1 = dr.findElement(By.xpath("//div[@id='droppable']"));
	    
	    Actions act = new Actions(dr);
	    act.dragAndDrop(wb, wb1).perform();
	    
	    Thread.sleep(3000);
	    dr.close();
	}

}
