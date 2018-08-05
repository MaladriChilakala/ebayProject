package ebayProject;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;


public class SearchProduct {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities[] browsers = {DesiredCapabilities.firefox(),DesiredCapabilities.chrome()};
	    for(DesiredCapabilities browser : browsers)
	    {
	        try{
	            System.out.println("Testing in Browser: "+browser.getBrowserName());
	            driver = new RemoteWebDriver(new URL("http://10.0.0.64:4444/wd/hub"), browser);

		
		String product1="New Sealed Samsung Galaxy S7 G930F LTE 4G Mobile 32GB 1Yr Wty 4colours";
		String product2="Dell Inspiron 15 3000 Laptop 7th Generation Intel Core i3 8GB Ram 1TB HDD Win10";
		 //  WebDriver driver = new FirefoxDriver();
			driver.navigate().to("https://www.ebay.com.au");
			driver.manage().window().maximize();
			driver.findElement(By.id("gh-ac")).sendKeys(product1);
			driver.findElement(By.id("gh-btn")).click();
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[1]/div/ul/li[1]/div/div[2]/a/h3")).click();
			driver.findElement(By.id("isCartBtn_btn")).click();
			driver.findElement(By.cssSelector("div.adndesc:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)")).click();
			driver.findElement(By.id("contShoppingBtn")).click();
			driver.findElement(By.id("gh-ac")).clear();
			driver.findElement(By.id("gh-ac")).sendKeys(product2);
			driver.findElement(By.id("gh-btn")).click();
			driver.findElement(By.cssSelector("html.history.devicemotion.deviceorientation body.s-page.no-touch.skin-large.srp--list-view.gh-flex div.srp-main.srp-main--isLarge div#mainContent.srp-main-content.clearfix.srp-main-content--flex div.srp-river.srp-layout-inner div#srp-river-main.srp-river-main.clearfix div#srp-river-results.srp-river-results.clearfix ul.srp-results.srp-list.clearfix li#srp-river-results-listing1.s-item div.s-item__wrapper.clearfix div.s-item__info.clearfix a.s-item__link h3.s-item__title")).click();
			driver.findElement(By.id("isCartBtn_btn")).click();
			driver.findElement(By.cssSelector("div.adndesc:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > button:nth-child(1)")).click();
	
			String Product2text = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/span/a")).getText();
	
			String Product1text = driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/span/a")).getText();
			System.out.println(Product1text);
			System.out.println(Product2text);
	
			assertTrue("Checked for product2 and it doesn't match", Product2text.equals(product2));
			assertTrue("Checked for product1 and it doesn't match", Product1text.equals(product1));
	
			driver.findElement(By.id("ptcBtnRight")).click();
			driver.quit();

	        } finally {
	        	
	        	
	        }
	    }
	}

}
