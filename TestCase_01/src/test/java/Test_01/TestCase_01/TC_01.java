package Test_01.TestCase_01;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class TC_01 {
	@Test

	public static void main(String[] args) throws Exception {
		
		
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
		
		//--------------------TAKING SCREENSHOTS------------------//
		
		System.out.println("Captured successfully");
		
		js.executeScript("window.scrollBy(0,300)");
		
		/*
		 * Screenshot.failScreenCapture(driver);
		 */	
		
		
		
		
		
	}

}
