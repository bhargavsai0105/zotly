package testng.mkt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTestNg {

	@Test(priority=2)
	public void  test_case_01() throws InterruptedException {

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://beta.zotly.com/#/sign-in?redirectURL=%2Fdashboard");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);		
		//------------------------ SIGNING IN --------------------//
		
		String str1="//input[@id='email']";
		WebElement email= driver.findElement(By.xpath(str1));
		email.sendKeys("bhargavsai0105@gmail.com");
		
		String str2="//input[@id='password']";
		WebElement password= driver.findElement(By.xpath(str2));
		password.sendKeys("Sai0105$");
		Thread.sleep(3000);
		
		String str3="//button/span/span[text()=' Sign in ']";
		driver.findElement(By.xpath(str3)).click();
		Thread.sleep(5000);
		
		System.out.println();
		driver.findElement(By.name("action"));

		
	}
	@Test(priority =01) 
	public void  test_case_02() throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://beta.zotly.com/#/sign-in?redirectURL=%2Fdashboard");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);		
		//------------------------ SIGNING IN --------------------//
		
		String str1="//input[@id='email']";
		WebElement email= driver.findElement(By.xpath(str1));
		email.sendKeys("bhargavsai0105@gmail.com");
		
		String str2="//input[@id='password']";
		WebElement password= driver.findElement(By.xpath(str2));
		password.sendKeys("Sai0105$");
		Thread.sleep(3000);
		
		String str3="//button/span/span[text()=' Sign in ']";
		driver.findElement(By.xpath(str3)).click();
		Thread.sleep(5000);
		
		System.out.println();
		
	}
	@Test(priority=03)
public void  test_case_03() throws InterruptedException {

	// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.get("https://beta.zotly.com/#/sign-in?redirectURL=%2Fdashboard");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);		
	//------------------------ SIGNING IN --------------------//
	
	String str1="//input[@id='email']";
	WebElement email= driver.findElement(By.xpath(str1));
	email.sendKeys("bhargavsai0105@gmail.com");
	
	String str2="//input[@id='password']";
	WebElement password= driver.findElement(By.xpath(str2));
	password.sendKeys("Sai0105$");
	Thread.sleep(3000);
	
	String str3="//button/span/span[text()=' Sign in ']";
	driver.findElement(By.xpath(str3)).click();
	Thread.sleep(5000);
	
	System.out.println();
	
		
	}
	@Test(priority=04)
public void  test_case_04() throws InterruptedException {
	

	// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.get("https://beta.zotly.com/#/sign-in?redirectURL=%2Fdashboard");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);		
	//------------------------ SIGNING IN --------------------//
	
	String str1="//input[@id='email']";
	WebElement email= driver.findElement(By.xpath(str1));
	email.sendKeys("bhargavsai0105@gmail.com");
	
	String str2="//input[@id='password']";
	WebElement password= driver.findElement(By.xpath(str2));
	password.sendKeys("Sai0105$");
	Thread.sleep(3000);
	
	String str3="//button/span/span[text()=' Sign in ']";
	driver.findElement(By.xpath(str3)).click();
	Thread.sleep(5000);
	
	System.out.println();
	
}
	@Test(priority=05)
public void  test_case_05() throws InterruptedException, IOException {
	

	// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.get("https://beta.zotly.com/#/sign-in?redirectURL=%2Fdashboard");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);		
	//------------------------ SIGNING IN --------------------//
	
	String str1="//input[@id='email']";
	WebElement email= driver.findElement(By.xpath(str1));
	email.sendKeys("bhargavsai0105@gmail.com");
	
	String str2="//input[@id='password']";
	WebElement password= driver.findElement(By.xpath(str2));
	password.sendKeys("Sai0105$");
	Thread.sleep(3000);
	
	String str3="//button/span/span[text()=' Sign in ']";
	driver.findElement(By.xpath(str3)).click();
	Thread.sleep(5000);
	
	System.out.println();
	Thread.sleep(5000);
//	smtp objSender = new  smtp();
//	objSender.send();
	
	
}
	
	
}


