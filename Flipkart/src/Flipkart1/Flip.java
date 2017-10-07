package Flipkart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Driver;

public class Flip {
	public static WebDriver driver;
	public static void main (String[] args) throws InterruptedException
	{
		LaunchDriver();
		LogIn();
		//LogOut();
		
	
	}
	
	
	public static WebDriver LaunchDriver() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\KnowledgeRepo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getClass());
		//driver.close();
		return driver;
	}
	public static void LogIn() throws InterruptedException{
		
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		System.out.println("Sign In Clicked Successfully");
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		System.out.println("Register Clicked");
		//Thread.sleep(2000);
		driver.switchTo().frame("loginIframe");
		//driver.findElement(By.xpath(".//*[@id='userName']")).click();
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("9740229828");
		System.out.println("Clicked UserName");
		driver.findElement(By.xpath("//*[@id='checkUser']")).click();
		System.out.println("Clicked Continue");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='j_password_login_uc']")).sendKeys("nalinimp17");
		System.out.println("password sent");
		driver.findElement(By.id("submitLoginUC")).click();
	}
	
	public static void LogOut() {
		driver.findElement(By.xpath("//span[contains(text(),'Welcome')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("LoggedOut");
		
	}
}
