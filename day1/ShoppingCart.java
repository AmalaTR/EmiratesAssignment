package Assignments.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ShoppingCart extends MainCoding {
	
	public void checkOut() {
	
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
	}
	
	public void pricing() throws InterruptedException {
		
		
		
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);	
		action.pause(2000).scrollByAmount(0,500).perform();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
		
	}
	
	

}

