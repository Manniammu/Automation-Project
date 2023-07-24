package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	WebDriver driver;
	By bdaygift=By.xpath("//*[@id=\"menu-item-40519\"]/a");

	By gift=By.xpath("//*[@id=\"content\"]/div/div/section[6]/div/div/div/div[2]/div/div/div/ul/li[2]/div[1]/a");
	
	public ProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	 public void bdaygiftclick()
	  {
		  driver.findElement(bdaygift).click();
		  }
	
	

	public void productclick()
	  {
		  System.out.println("The page title is : " +driver.getTitle());

		  driver.findElement(gift).click();
		 

		 
		 
	  }
	  
	 


}

