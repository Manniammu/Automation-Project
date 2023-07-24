package test;



import org.testng.annotations.Test;

import pages.ProductPage;

public class ProductTest extends Createtest{
	
@Test
public void testing() throws InterruptedException 
{
	
    ProductPage ob=new ProductPage(driver);
   Thread.sleep(2000);
   ob.bdaygiftclick();
    ob.productclick();
   
    
    }
}
