package ebayProject;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import TestData.Constants;
import java.net.MalformedURLException;




public class TGSearchProduct extends BaseClass{
		 
  @Test
  
  public void ProductSearch() throws InterruptedException, MalformedURLException {
	  try {
	    getDriver().get(Constants.URL);
	    getDriver().findElement(By.id("gh-ac")).sendKeys(Constants.Product1);
	    getDriver().findElement(By.id("gh-btn")).click();
	    getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[1]/div/ul/li[1]/div/div[2]/a/h3")).click();
	    getDriver().findElement(By.id("isCartBtn_btn")).click();
	    getDriver().findElement(By.cssSelector("div.adndesc:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)")).click();
	    getDriver().findElement(By.id("contShoppingBtn")).click();
	    getDriver().findElement(By.id("gh-ac")).clear();
	    getDriver().findElement(By.id("gh-ac")).sendKeys(Constants.Product2);
	    getDriver().findElement(By.id("gh-btn")).click();
	    getDriver().findElement(By.cssSelector("html.history.devicemotion.deviceorientation body.s-page.no-touch.skin-large.srp--list-view.gh-flex div.srp-main.srp-main--isLarge div#mainContent.srp-main-content.clearfix.srp-main-content--flex div.srp-river.srp-layout-inner div#srp-river-main.srp-river-main.clearfix div#srp-river-results.srp-river-results.clearfix ul.srp-results.srp-list.clearfix li#srp-river-results-listing1.s-item div.s-item__wrapper.clearfix div.s-item__info.clearfix a.s-item__link h3.s-item__title")).click();
	    getDriver().findElement(By.id("isCartBtn_btn")).click();
	    getDriver().findElement(By.cssSelector("div.adndesc:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)")).click();

		String Product2text =  getDriver().findElement(By.xpath("/html/body/div[2]/div/div[4]/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/span/a")).getText();

		String Product1text =  getDriver().findElement(By.xpath("/html/body/div[2]/div/div[4]/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/span/a")).getText();
		System.out.println(Product1text);
		System.out.println(Product2text);

		assertTrue("Checked for product2 and it doesn't match", Product2text.equals(Constants.Product2));
		assertTrue("Checked for product1 and it doesn't match", Product1text.equals(Constants.Product1));

		 getDriver().findElement(By.id("ptcBtnRight")).click();
  } catch(Exception e)
	  {
	  	System.out.println(e);
	  }
  }
	 

 }
