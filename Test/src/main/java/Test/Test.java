package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Actions.Action_ZestMoney;

public class Test {
	public static WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
		String path="C://drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5);
		Action_ZestMoney az=new Action_ZestMoney();
		az.Amazon(driver);
		az.Flipkart(driver);
		az.compareAmount(driver);
		driver.quit();
	}


}
