package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Automation {
	
WebDriver driver;

@Test
public void register() {
	  
	  	driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&prevRID=X0PWH6ZFC1NW9PMJWVG3&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.name("customerName")).sendKeys("sivani");	
		driver.findElement(By.name("email")).sendKeys("medapatisivani359@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sivani@123");
		driver.findElement(By.name("passwordCheck")).sendKeys("sivani@123");
		driver.findElement(By.id("continue")).submit();	
}

@Test
public void login() {
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.name("email")).sendKeys("medapatisivani359@gmail.com");
		driver.findElement(By.id("continue")).submit();
		
		
	}

@Test
public void search() {
	
	driver.get("http://amazon.com");
	WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
	searchElement.sendKeys("realme pods");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
}



@Test
public void addtocart() {
	
	driver.get("https://www.amazon.in/Airdopes-121v2-Bluetooth-Immersive-Assistant/dp/B08JQN8DGZ/ref=sr_1_7?adgrpid=67442664148&ext_vrnc=hi&gclid=CjwKCAjw7eSZBhB8EiwA60kCWwBwUsgOsBovmDQxM_JoSCR7WkwfV8RrRnB-lgQpSstT1RMv6tBJuBoCdNQQAvD_BwE&hvadid=623302410612&hvdev=c&hvlocphy=20453&hvnetw=g&hvqmt=b&hvrand=13952075633268668748&hvtargid=kwd-515596298528&hydadcr=19936_2301277&keywords=bluetooth+AirPods&qid=1664716438&qu=eyJxc2MiOiI2Ljg1IiwicXNhIjoiNi42NyIsInFzcCI6IjUuNjIifQ%3D%3D&sr=8-7");
	driver.findElement(By.name("submit.add-to-cart")).click();

	
}








  
  
  

  
  @BeforeMethod
	public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVANI\\OneDrive\\Desktop\\phase5\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
	}
  
  
  
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
}