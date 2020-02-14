package com.tst.test;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tst.object.BasePage;
import com.tst.object.HomePageObject1;

public class HomePageTest1 {
 BasePage bp;
 HomePageObject1 hpo;
	public HomePageTest1() {
		bp=new BasePage();
		hpo=new HomePageObject1();
	}
	int random=new Random().nextInt(50000);
	String email="karthikkrish"+random+"@gmail.com";
	@Test(priority=0)
	public void VerifyTabs() {
		Assert.assertTrue(hpo.getWomenTab().isDisplayed(),"Failed Womentab");
		Assert.assertTrue(hpo.getDressesTab().isDisplayed(),"Failed DressesTab");
		Assert.assertTrue(hpo.getTshirtsTab().isDisplayed(),"Failed TshirtsTab");
		}
	@Test(priority=1)
	public void VerifyWomen() {
		hpo.getWomenTab().click();
		String a=hpo.getWomen().getText();
		Assert.assertTrue(a.contains("WOMEN "), "Failed due to Women mismatch page");
	}
	@Test(priority=2)
	public void VerifyDresses() {
		hpo.getDressesTab().click();
		String s=hpo.getDresses().getText();
		Assert.assertTrue(s.contains("DRESSES"), "Failed due to Dresses mismatch page" );
	}
	@Test(priority=3)
	public void VerifyTshirts() {
		hpo.getTshirtsTab().click();
		String s1=hpo.getTshirts().getText();
		Assert.assertTrue(s1.contains("T-SHIRTS"), "Failed due to Tshirts mismatch page ");
	}
	@Test(priority=4)
    public void VerifyAlertMessage() {
    	 bp.setText(hpo.getNewsLetter(), email);
    	 hpo.getNewsLetterClick().click();
    	 String a=hpo.getAlertMessage().getText();
    	 Assert.assertTrue(a.contains("Newsletter : You have successfully subscribed to this newsletter."),"Due to invalid email address or email already registered");
    }
    
}
