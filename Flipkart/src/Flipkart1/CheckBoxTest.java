package Flipkart1;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.gdata.util.parser.Action;

public class CheckBoxTest {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		LaunchDriver();
		CheckBox();
		
	}
	
	
	//LaunchDriver
	public static void LaunchDriver() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\KnowledgeRepo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/products/mobiles-mobile-phones/filters/Form_s~Smartphones?sort=plrty");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		

		
		
   }
	
	public static void CheckBox() throws InterruptedException {
		
		for (int i = 1; i < 6; i++) {
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,700)", ""); //used for scroll down the page
//		jse.executeScript("window.scrollBy(0,450)", "");
		driver.findElement(By.xpath("//div[2]/div[2]/div[3]/div/div["+i+"]/label")).click();
//		i++;
		Thread.sleep(5000);
		}
		System.out.println("Successfully Completed the script");
	}
}