package Flipkart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip3 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		LaunchDriver();
		TestCase1();
		
	}
	
	
	public static WebDriver LaunchDriver() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\KnowledgeRepo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getClass());
		//driver.close();
		return driver;
	}
	public static void TestCase1 (){
//		search text box entering/sending the value to the text box
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Samsung Mobiles");
//		Click on search icon
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
		
		
	}
	

}
