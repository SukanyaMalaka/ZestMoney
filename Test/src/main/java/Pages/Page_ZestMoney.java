package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_ZestMoney {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement wbl_search;
	
	@FindBy(xpath="//select[@id='searchDropdownBox']/following::div[1]/div[1]/input[1]")
	public WebElement wbl_searchbutton;
	
	@FindBy(xpath="//a[@id='skippedLink']/following::div[1]/div[1]/div[2]/div[1]/span[4]/div[1]/div/div/span/div/div/div[2]/div[2]/div/div/div/div/div/h2/a/span")
	public List<WebElement> listofMobiles;
	
	@FindBy(xpath="//a[@id='skippedLink']/following::div[1]/div[1]/div[2]/div[1]/span[4]/div[1]/div/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]/span[2]")
	public List<WebElement> MobilesCost;
	
	@FindBy(xpath="//input[@class='LM6RPg']")
	public WebElement wbl_searchFlipkart;
	
	@FindBy(xpath="//input[@class='LM6RPg']/following::button[1]")
	public WebElement wbl_searchbuttonFlipkart;
	
	@FindBy(xpath="//div[@class='_3wU53n']")
	public List<WebElement> flipkartlistofMobiles;
	
	@FindBy(xpath="//div[@class='_3wU53n']/following::div[1]/following::div[2]/div/div/div")
	public List<WebElement> flipcartMobilesCost;
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	public WebElement wbt_close;
	
	
}
