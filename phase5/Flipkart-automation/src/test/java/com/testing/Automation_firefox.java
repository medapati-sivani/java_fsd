package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Automation_firefox {
	WebDriver driver;
	 @Test
	  public void search() {
		  long start = System.currentTimeMillis();
		  driver.get("https://www.flipkart.com/");
		  
		  driver.manage().window().maximize();
		  long finish=System.currentTimeMillis();
		  long totalTime = finish - start; 
			System.out.println("Total Time for page load = "+(totalTime*0.001)+" Seconds");
		  WebElement searchElement = driver.findElement(By.name("q"));
		  searchElement.sendKeys("iphone 13");
		  
			driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button > svg")).click();
			 System.out.println("sucesfully searched iphone 13");
			 
			 
			//driver.get("https://www.flipkart.com/apple-iphone-13-starlight-128-gb/p/itmc9604f122ae7f?pid=MOBG6VF5ADKHKXFX&lid=LSTMOBG6VF5ADKHKXFX4LCPEV&marketplace=FLIPKART&q=iphone+13&store=tyy%2F4io&srno=s_1_2&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&fm=organic&iid=1d812cc2-2c5a-4615-bddf-59e401b8e3bf.MOBG6VF5ADKHKXFX.SEARCH&ppt=hp&ppn=homepage&ssid=z6kiqmf48w0000001665482727584&qH=c68a3b83214bb235");
			JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("window.scrollBy(0,1000)", "");
		    System.out.println("Sucesfully scrolled");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			 //loading image testing
		    WebElement i = driver.findElement
		  	      (By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/img"));

		    Boolean k = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		    if (k) {
		       System.out.println("Image loaded");
		    } else {
		       System.out.println("Image not loaded ");
		    }
		    
			

			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			System.out.println("Reached to bottom of page");
			 
	  }
	  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver= new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
