package Assignments.day1;

import org.testng.annotations.Test;

public class TC_001 extends MainCoding{
	
	@Test
	public void runlogin() throws InterruptedException {
		LoginPage lp = new LoginPage();
		System.out.println("driver instance in Test"+driver);
		lp.enterUsername()
		.enterPassword()
		.clickLogin();
		Thread.sleep(1000);
		HomePage hp = new HomePage();
		hp.sauseLabsBackPack()
		.sauseLabsBikeLite()
		.Cart();
		Thread.sleep(10000);
		ShoppingCart sc = new ShoppingCart();
		sc.checkOut();
		sc.pricing();
	
		
		
		
			

	}
	}


