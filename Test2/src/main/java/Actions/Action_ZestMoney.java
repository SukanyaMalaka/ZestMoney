package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import java.lang.Integer;
import java.util.Iterator;
import java.util.Set;

import Pages.Page_ZestMoney;

public class Action_ZestMoney {
	private WebDriver driver;
	String url="https://www.tripadvisor.in/";
	
	public void tripAdvisor(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		
		Page_ZestMoney pa=PageFactory.initElements(driver,Page_ZestMoney.class);
	    driver.get(url);
	    pa.wbl_search.click();
	    pa.wbl_mainsearch.sendKeys("Club Mahindra");
	    Thread.sleep(2);
	    pa.wbl_searchbutton.click();
	    pa.firstresult.click();
	    String parentWindow=driver.getWindowHandle();
	    Set<String> s1=driver.getWindowHandles();
	    Iterator<String> itr=s1.iterator();
	    while(itr.hasNext())
	    {
	    	String ChildWindow=itr.next();
	    	if(!parentWindow.equalsIgnoreCase(ChildWindow))
	    	{
	    		driver.switchTo().window(ChildWindow);
	    		pa.reviewLink.click();
	    		pa.wbt_writeReview.click();
	    		 Set<String> s2=driver.getWindowHandles();
	    		    Iterator<String> itr1=s2.iterator();
	    	    while(itr1.hasNext())
	    	    {
	    	    	String ChildWindow1=itr.next();
	    	    	if(!ChildWindow.equalsIgnoreCase(ChildWindow1))
	    	    	{
	    	    		driver.switchTo().window(ChildWindow1);
	    	    		Actions action = new Actions(driver);
	    	    		
	    	    		action.moveToElement(pa.wbl_rating).click().build().perform();
	    	    		pa.wbl_reviewTitle.sendKeys("Title of your review");
	    	    		pa.wbl_YourReview.sendKeys("Your Review");
	    	    		action.moveToElement(pa.wbl_servicesRating).click().build().perform();
	    	    		action.moveToElement(pa.wbl_roomsrating).click().build().perform();
	    	    		action.moveToElement(pa.wbl_valuerating).click().build().perform();
	    	    		pa.wcb_submitreview.click();
	    	    		pa.wbt_submit.click();

	    	    		driver.close();
	    	    	}
	    	    		    	    	
	    	    }
	    	    
	    		driver.close();
	    	}
	    	driver.switchTo().window(parentWindow);
	    
	    }
	    
	}
	
	
		
}
