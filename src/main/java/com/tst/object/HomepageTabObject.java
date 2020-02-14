package com.tst.object;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageTabObject extends BasePage {
public HomepageTabObject() {
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
@FindBy WebElement ele=BasePage.driver.findElement(By.xpath("//*[@id=\"columns\"]/p"));
private WebElement AlertMessage;
public WebElement getAlertMessage() {
	String s1=driver.findElement(By.xpath("//*[@id=\"columns\"]/p")).getText();
	String s2="Newsletter : You have successfully subscribed to this newsletter.";
	if(s1.equals(s2)) {
		System.out.println("true");
	}else {
		System.out.println("false");
}
	return AlertMessage;
}
@FindBy(xpath=("//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a"))
private WebElement DressesSmallSize;
	public WebElement getDressesSmallSize() {
		return DressesSmallSize;
	}
@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
private WebElement DressesMediumSize;
	public WebElement getDressesMediumSize() {
		return DressesMediumSize;
	}
@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
private WebElement DressesLargeSize;
	public WebElement getDressesLargeSize() {
		return DressesLargeSize;
	}
@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a")
private WebElement PrintedDress;
	public WebElement getPrintedDress() {
		return PrintedDress;
	}
@FindBy List<WebElement>list=BasePage.driver.findElements(By.xpath("//ul[@class='product_list grid row']/li"));
private WebElement DressesList;

	public WebElement getDressesList() {
	System.out.println(list.size());
		return DressesList;
	}
@FindBy 
private WebElement ProductCount;
	public WebElement getProductCount() {
		return ProductCount;
	}
@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
private WebElement AddCart;
	public WebElement getAddCart() {
		return AddCart;
	}
}

