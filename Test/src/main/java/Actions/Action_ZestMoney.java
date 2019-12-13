package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.lang.Integer;

import Pages.Page_ZestMoney;

public class Action_ZestMoney {
	private WebDriver driver;
	String AmazonUrl="https://www.amazon.in";
	String FlipkartUrl="https://www.flipkart.com";
	String AmazonAmount;
	String flipKartAmount;
	
	public void Amazon(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		
		Page_ZestMoney pa=PageFactory.initElements(driver,Page_ZestMoney.class);
	    driver.get(AmazonUrl);
	    pa.wbl_search.sendKeys("Apple iPhone XR (64GB) - Yellow");
	    Thread.sleep(2);
	    pa.wbl_searchbutton.click();
	    for(int i=0;i<pa.listofMobiles.size();i++)
	    {
	    	if(pa.listofMobiles.get(i).getText().equals("Apple iPhone XR (64GB) - Yellow"))
	    	{
	    		AmazonAmount=pa.MobilesCost.get(i).getText();
	    		break;
	    	}
	    }
	}
	
	public void Flipkart(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		
		Page_ZestMoney pa=PageFactory.initElements(driver,Page_ZestMoney.class);
	    driver.get(FlipkartUrl);
	    pa.wbl_searchFlipkart.sendKeys("Apple iPhone XR (64GB) - Yellow");
	    Thread.sleep(2);
	    pa.wbt_close.click();
	    Thread.sleep(2);
	    pa.wbl_searchbuttonFlipkart.click();
	    for(int i=0;i<pa.listofMobiles.size();i++)
	    {
	    	if(pa.listofMobiles.get(i).getText().equals("Apple iPhone XR (Yellow, 64 GB)"))
	    	{
	    		flipKartAmount=pa.MobilesCost.get(i).getText();
	    		System.out.println(flipKartAmount);
	    		break;
	    	}
	    }
	}
	
	public void compareAmount(WebDriver driver) throws InterruptedException
	{		
		if(Integer.parseInt(AmazonAmount)==Integer.parseInt(flipKartAmount))
		{
			System.out.println("flipKartAmount" +" "+flipKartAmount+"and"+" "+"AmazonAmount"+" "+AmazonAmount+"are same");
		}
		else if(Integer.parseInt(AmazonAmount)>Integer.parseInt(flipKartAmount))
		{
			System.out.println("flipKartAmount is less"+flipKartAmount);
		}
		else
		{
			System.out.println("AmazonAmount is less"+AmazonAmount);
			
		}
	}
	
}
