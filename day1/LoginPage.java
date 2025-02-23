package Assignments.day1;


import org.openqa.selenium.By;

public class LoginPage extends MainCoding {

	public LoginPage enterUsername(){
		
		System.out.println("driver instance in enterUsername"+driver);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		return this;

	}
	public LoginPage enterPassword(){
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		return this;
	}
	public HomePage clickLogin(){
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		return new HomePage();
		
	}
	

}
