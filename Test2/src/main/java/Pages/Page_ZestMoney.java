package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_ZestMoney {
	
	@FindBy(xpath="//span[text()='Search']")
	public WebElement wbl_search;
	
	@FindBy(xpath="//input[@id='mainSearch']")
	public WebElement wbl_mainsearch;
	
	@FindBy(xpath="//div[@id='SEARCH_BUTTON_CONTENT']")
	public WebElement wbl_searchbutton;
	
	@FindBy(xpath="//span[contains(text(),\"Club Mahindra Madikeri, Coorg\")]")
	public WebElement firstresult;
	
	@FindBy(xpath="//span[@class='hotels-hotel-review-atf-info-parts-Rating__reviewCount--1sk1X']")
	public WebElement reviewLink;
	
	@FindBy(xpath="//a[text()='Write a review']")
	public WebElement wbt_writeReview;
	
	@FindBy(xpath="//span[@id='bubble_rating']")
	public WebElement wbl_rating;
	
	@FindBy(xpath="//input[@id='ReviewTitle']")
	public WebElement wbl_reviewTitle;
	
	@FindBy(xpath="//textarea[@id='ReviewText']")
	public WebElement wbl_YourReview;
	
	@FindBy(xpath="//span[@id='qid12_bubbles']")
	public WebElement wbl_servicesRating;
	
	@FindBy(xpath="//span[@id='qid11_bubbles']")
	public WebElement wbl_roomsrating;
	
	@FindBy(xpath="//span[@id='qid13_bubbles']")
	public WebElement wbl_valuerating;
	
	@FindBy(xpath="//input[@id='noFraud']")
	public WebElement wcb_submitreview;
	
	@FindBy(xpath="//div[@id='SUBMIT']")
	public WebElement wbt_submit;
	
	
	
}
