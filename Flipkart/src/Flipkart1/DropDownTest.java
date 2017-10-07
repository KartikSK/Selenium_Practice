package Flipkart1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
	public static WebDriver driver;
	
	public static void main (String[] args) throws InterruptedException
	{
			LaunchDriver();
			DropDown();
	}
	
	public static void LaunchDriver() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\KnowledgeRepo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://styresolutions.com/solutions-enquiry.aspx");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getClass());
		//driver.close();
		//Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[contains(text(),'Men\'s Fashion')]")).click();
		//Thread.sleep(5000);
	}
	public static void DropDown() throws InterruptedException{
		WebElement we; 
		//driver.findElement(By.xpath("//a[Contains(text(),'Enquiry')]")).click();
		we = driver.findElement(By.xpath("//select[@id='ddlCCatg']"));
		Select oSelect = new Select(we);
		//oSelect.selectByVisibleText("Testing");
		//oSelect.selectByIndex(3);
		oSelect.selectByValue("Testing");
		Thread.sleep(5000);
	}

}
