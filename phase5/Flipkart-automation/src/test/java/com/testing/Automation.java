package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	WebDriver driver;
  //@Test
  //public void flipkart() {
	//  driver.get("https://www.flipkart.com/");
  //}
  @Test
  public void search() {
	  long start = System.currentTimeMillis();
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com");
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for page load = "+(totalTime*0.001)+" Seconds"); 
		
	    
	   
		 WebElement searchElement = driver.findElement(By.name("q"));
		  searchElement.sendKeys("iphone 13");
		  
			driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button > svg")).click();
			 System.out.println("sucesfully searched iphone 13");
	    
	   //scroll down
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,1000)", "");
	    System.out.println("Sucesfully scrolled");
	    
	   
	   //loading image testing
	    WebElement i = driver.findElement(By.cssSelector("#container > div > div._36fx1h._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div:nth-child(2) > div:nth-child(3) > div > div > div > a > div.MIXNux > div._2QcLo- > div > div > img"));

	    Boolean k = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

	    if (k) {
	       System.out.println("Image loaded");
	    } else {
	       System.out.println("Image not loaded ");
	    }

	    
	   
	    
	    //scroll upto end of page
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		System.out.println("Reached to bottom of page");
		 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVANI\\OneDrive\\Desktop\\phase5\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}