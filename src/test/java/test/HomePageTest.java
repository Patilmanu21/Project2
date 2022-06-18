package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends BaseTest {
	HomePage hp;
	//it is before class
	
	//commit should be done properly
	@BeforeClass
	public void initObject() {
	 hp=new HomePage(driver);
		
	}
	
  @Test
  public void logout() {
	 
	  hp.getLink().click();
	  hp.getLogoutLink().click();
	  
  }
}
