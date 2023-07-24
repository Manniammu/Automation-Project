package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
	WebDriver driver;
	 By addcart=By.xpath("//button[2][@name='add-to-cart']");
	 //By cart=By.xpath("//*[@id=\"product-64548\"]/div[2]/form/a");
	 //By checkout=By.xpath("//*[@id=\"post-7\"]/div/div/section/div/div/div/div/div/div[1]/div[2]/div/div/a");
	 By checkout=By.xpath("//*[@id=\"woofc-area\"]/div/div[3]/div[3]/div/div/a");
	 By account=By.xpath("//*[@id=\"ast-desktop-header\"]/div[2]/div/div/div/div[3]/div/div[2]/div/a[1]");
	 
	 public Cart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
	}
	public void cartadd()
	 {
		 driver.findElement(addcart).click();
		 System.out.println("The page title is : " +driver.getTitle());
		 
	 }

		/*
		 * public void viewcart() { driver.findElement(cart).click();
		 * 
		 * }
		 */
	public void checkout()
	
	{
		driver.findElement(checkout).click();
	}
	public void account()
	{
		driver.findElement(account).click();
	}
	
		

}
