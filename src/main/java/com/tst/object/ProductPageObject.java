package com.tst.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageObject extends BasePage {
	public ProductPageObject() {
		PageFactory.initElements(driver, this);
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
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement PrintedDress;
		public WebElement getPrintedDress() {
			return PrintedDress;
			}
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	private WebElement AddCart;
		public WebElement getAddCart() {
			return AddCart;
			}
   @FindBy(xpath="//*[@id=\"layer_cart_product_quantity\"]")
   private WebElement CartQuantity;
   		public WebElement getCartQuantity() {
   			return CartQuantity;
   		}
   @FindBy(xpath="//span[@class='heading-counter']")
   private WebElement Productcount;
   public WebElement getProductcount(){
	   return Productcount;
   }
   @FindBy(xpath="//ul[@class='product_list grid row']/li")
   private List<WebElement> Showingcount;
   public List<WebElement> getShowingcount(){
	   return Showingcount;
   }
   @FindBy(xpath="//button[@class='btn btn-default btn-twitter']")
   private WebElement Tweet;
   public WebElement getTweet() {
	   return Tweet;
   }
   @FindBy(xpath="//button[@class='btn btn-default btn-facebook']")
   private WebElement FShare;
   public WebElement getFShare() {
	   return FShare;
   }
   @FindBy(xpath="//*[@id=\"short_description_content\"]")
   private WebElement Discription;
   public WebElement getDiscription() {
	   return Discription;
   }
}
