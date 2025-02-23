package Assignments.day1;

import org.openqa.selenium.By;

public class HomePage extends MainCoding{

	public HomePage sauseLabsBackPack() throws InterruptedException {
		
		Thread.sleep(1000);
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	
		return this;
		
	}
	
	public HomePage sauseLabsBikeLite() {
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		return this;
	}
	
	public ShoppingCart Cart()
	{
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		return new ShoppingCart();
	}
	
}
