package com.tst.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject1 extends BasePage {
	public HomePageObject1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//a[@title='Women']"))
	private WebElement WomenTab;
		public WebElement getWomenTab() {
			return WomenTab;
		}
	@FindBy(xpath=("//*[@id='block_top_menu']/ul/li[2]/a"))
		private WebElement DressesTab;
			public WebElement getDressesTab() {
				return DressesTab;
		    }
	@FindBy(xpath=("//ul//li[3]//a[@title='T-shirts']"))
		private WebElement TshirtsTab;
			public WebElement getTshirtsTab() {
				return TshirtsTab;
		    }
	@FindBy(xpath=("//span[@class='cat-name']"))
		private WebElement Women;
			public WebElement getWomen() {
				return Women;
			}
	@FindBy(xpath=("//span[@class='cat-name']"))
		private WebElement Dresses;
			public WebElement getDresses() {
				return Dresses;
			}
	@FindBy(xpath="//span[@class='cat-name']")
	private WebElement Tshirts;
		public WebElement getTshirts() {
			return Tshirts;
		}
	@FindBy(xpath=("//input[@id='newsletter-input']"))
		private WebElement NewsLetter;
			public WebElement getNewsLetter() {
				return NewsLetter;
			}
	@FindBy(xpath=("//button[@name='submitNewsletter']"))
		private WebElement NewsLetterClick;
			public WebElement getNewsLetterClick() {
				return NewsLetterClick;
			}
	@FindBy (xpath=("//*[@id=\"columns\"]/p"))
		private  WebElement AlertMessage;
			public WebElement getAlertMessage() {
			return AlertMessage;
			}


}
