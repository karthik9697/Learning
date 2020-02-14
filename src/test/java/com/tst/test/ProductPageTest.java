package com.tst.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tst.object.BasePage;
import com.tst.object.HomePageObject1;
import com.tst.object.ProductPageObject;

public class ProductPageTest {
	BasePage bp;
	ProductPageObject ppo;
	HomePageObject1 hpo;
	public ProductPageTest() {
		bp=new BasePage();
		ppo=new ProductPageObject();
		hpo=new HomePageObject1();
	}
	@Test(priority=0)
	public  void VerifyDressSize() {
	hpo.getDressesTab().click();
	Assert.assertTrue(ppo.getDressesSmallSize().isDisplayed());
	Assert.assertTrue(ppo.getDressesMediumSize().isDisplayed());
	Assert.assertTrue(ppo.getDressesLargeSize().isDisplayed());
}
	
	@Test
	public void VerifyProductAddToCart() {
		hpo.getDressesTab().click();
		ppo.getPrintedDress().click();
		ppo.getAddCart().click();
		String ele=ppo.getCartQuantity().getText();
		System.out.println(ele);
		
	}
	@Test public void VerifyCount() {	
		hpo.getDressesTab().click();
		int i=ppo.getShowingcount().size();
		String s=Integer.toString(i);
		System.out.println(s);
		String s1=ppo.getProductcount().getText();
		System.out.println(s1);
		Assert.assertTrue(s1.contains(s), "Failed due to mismatch count");
	}
	@Test public void VerifyTweetAndShare() {
		hpo.getDressesTab().click();
		ppo.getPrintedDress().click();
		Assert.assertTrue(ppo.getTweet().isDisplayed(), "Failed in tweet");
		Assert.assertTrue(ppo.getFShare().isDisplayed(), "Failed in fShare");
	}
	@Test public void VerifyDiscription() {
		hpo.getDressesTab().click();
		ppo.getPrintedDress().click();
		String see=ppo.getDiscription().getText();
		Assert.assertTrue(see.contains("100% cotton double printed dress"), "Failed in Description");
	}
	}
   
	


