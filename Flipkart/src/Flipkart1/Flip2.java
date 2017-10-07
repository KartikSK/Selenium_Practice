package Flipkart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Driver;

public class Flip2 {
	
	public static void main (String[] args) throws InterruptedException
	{
	
	  System.setProperty("webdriver.chrome.driver", "E:\\KnowledgeRepo\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.snapdeal.com/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  
	
	}
	
}