package test;

import org.testng.annotations.Test;

import pages.CreatePage;

public class Createtest extends BaseClass {

	@Test
	public void testing() throws InterruptedException
	{
		CreatePage ob=new CreatePage(driver);
		ob.createclick();
		ob.createsetvalues("subithamanus@gmail.com", "Manni@2019");
		ob.regclick();
		ob.login("manniammu@gmail.com", "Manni@2019");
		Thread.sleep(2000);
		
		
	}
}
