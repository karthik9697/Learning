package com.tst.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tst.object.BasePage;
import com.tst.object.HomepageTabObject;

public class HomePageTabTest{
	BasePage bp;
	HomepageTabObject hp;
	public HomePageTabTest() {
		bp=new BasePage();
		hp=new HomepageTabObject();
	}
	@Test
	public void VerifyWomenTab() {
		Assert.assertTrue(hp.getWomenTab().isDisplayed());
		//hp.getWomenTab().click();
	}
	@Test
	public void VerifyDressesTab() {
		Assert.assertTrue(hp.getDressesTab().isDisplayed());
		hp.getDressesTab().click();
	}
	@Test
	public void VerifyTshirtsTab() {
		Assert.assertTrue(hp.getTshirtsTab().isDisplayed());
}
 @Test
 public void VerifyNewsLetter() {
	 Assert.assertTrue(hp.getNewsLetter().isDisplayed());
	
 }
 @Test
 public void VerifyNewsLetterSendKeys() {
	 hp.getNewsLetter().sendKeys("karthikkrishnan9679@gmail.com");
	 }
 @Test
 public void verifyNewsLetterClick() {
	 hp.getNewsLetterClick().click();
	  }

@Test
 public void VerifyAlertMessage() {
	 hp.getNewsLetter().sendKeys("karthikkrishnan969711@gmail.com");
	 hp.getNewsLetterClick().click();
	 Assert.assertTrue(hp.getAlertMessage().isDisplayed());
	}
//@Test
//public void VerifyDressesSmallSize() {
	//hp.getDressesTab().click();
		//boolean eanb=bp.driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")).isDisplayed();
		//System.out.println(eanb);
//	Assert.assertTrue(hp.getDressesSmallSize().isDisplayed());
//}

 /* @Test
 public void verifyEmail() {
	  bp.driver.findElement(By.id("newsletter-input")).sendKeys("rakhesh12@gmail.com");
	  bp.driver.findElement(By.name("submitNewsletter")).click();
	  WebElement ele=bp.driver.findElement(By.xpath("//*[@id=\"columns\"]/p"));
	  String s	=ele.getText();
	  Assert.assertTrue(s.contains("successfully"), "Failed");
 }*/

 @Test
	public  void VerifyDressSmallSize() {
	hp.getDressesTab().click();
	Assert.assertTrue(hp.getDressesSmallSize().isDisplayed());
}
@Test
public void VerifyDressesMediumSize() {
	hp.getDressesTab().click();
	Assert.assertTrue(hp.getDressesMediumSize().isDisplayed());
}
@Test
public void VerifyDressesLargeSize() {
	hp.getDressesTab().click();
}
/*@Test
public void verifyProductCountAndShowingCount() {
	Assert.assertTrue(hp.getProductCount().isDisplayed());
	Assert.assertTrue(hp.getShowingCount().isDisplayed());
	//List<WebElement>prd=hp.get
}*/
@Test
public void VerifyAddCart() {
	hp.getDressesTab().click();
	hp.getPrintedDress().click();
	hp.getAddCart().click();
	
}
@Test
public void verifyDressesList(){
	hp.getDressesTab().click();
	Assert.assertTrue(hp.getDressesList().isDisplayed());
}
}