package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatePage {
	WebDriver driver;
	By createlink=By.xpath("//*[@id=\"ast-desktop-header\"]/div[2]/div/div/div/div[3]/div/div[2]/div/a[1]");
	By regemail=By.xpath("//input[@id='reg_email']");
	By regpass=By.xpath("//input[@id='reg_password']");
	By regbutton=By.xpath("//button[@name='register']");
	By username=By.xpath("//input[@id='username']");
	By loginpass=By.xpath("//input[@id='password']");
	By login=By.xpath("//button[@name='login']");
	public CreatePage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver=driver;
				}
				
				 public void createclick() { driver.findElement(createlink).click(); }
				 
				 
				
					/* Create Account
					 * public void createsetvalues(String regisemail,String regispass) {
					 * driver.findElement(regemail).sendKeys(regisemail);
					 * driver.findElement(regpass).sendKeys(regispass); } public void regclick() {
					 * driver.findElement(regbutton).click(); }
					 */
				 
	 
	public void login(String uname,String logpass)
	 
	 { 
		  driver.findElement(username).sendKeys(uname);
	 driver.findElement(loginpass).sendKeys(logpass);
	 driver.findElement(login).click(); 
	  System.out.println("The page title is : " +driver.getTitle());

	 }
	 

}
