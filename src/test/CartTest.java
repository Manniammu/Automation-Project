package test;


import org.testng.annotations.Test;

import pages.Cart;

public class CartTest extends ProductTest{
	
		
	
	@Test
	public void testing() throws InterruptedException 
	
	{
		driver.get("https://homafy.com/product/oil-painting-frame/");
		
		
		Cart c=new Cart(driver);
		Thread.sleep(2000);
		c.cartadd();
		Thread.sleep(2000);
		//c.viewcart();
		//Thread.sleep(5000);
		c.checkout();
		Thread.sleep(2000);
		c.account();
		
	
		
	}

}
