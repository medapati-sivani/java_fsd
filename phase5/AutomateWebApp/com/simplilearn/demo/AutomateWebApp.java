package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomateWebApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIVANI\\OneDrive\\Desktop\\phase5\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
	
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
		email.sendKeys("sivani@gmail.com");
		Thread.sleep(10000);
		
		
		WebElement pass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
		pass.sendKeys("Dhoni@123");
		Thread.sleep(5000);
		
		
		
		WebElement repass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content"));
		repass.sendKeys("Dhoni@123");
		Thread.sleep(5000);
		

		WebElement country=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content"));
		country.sendKeys("India");
		Thread.sleep(5000);

		WebElement Fname=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content"));
		Fname.sendKeys("Sivani");
		Thread.sleep(5000);

		WebElement Lname=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
		Lname.sendKeys("Medapati");
		Thread.sleep(5000);

		WebElement JobTitle=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content"));
		JobTitle.sendKeys("Student");
		Thread.sleep(5000);

		WebElement phone=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
		phone.sendKeys("6303539121");
		Thread.sleep(5000);

		WebElement comName=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
		comName.sendKeys("Sasi");
		Thread.sleep(5000);

		WebElement add=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content"));
		add.sendKeys("Tanuku");
		Thread.sleep(5000);

		WebElement city=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
		city.sendKeys("Tanuku");
		Thread.sleep(5000);

		WebElement state=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content"));
		state.sendKeys("Andhra pradesh");
		Thread.sleep(5000);

		WebElement postal=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
		postal.sendKeys("534211");
		Thread.sleep(5000);
		
		WebElement create= driver.findElement(By.id("sView1:r1:0:b1"));
		create.submit();
		Thread.sleep(5000);

	}
}