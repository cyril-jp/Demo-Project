package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoClass extends Base
{
@Test(priority=1)
	void logIn()
	{
	 String username="admin";
	 String pin="admin";
	WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
	user.sendKeys(username);
	WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys(pin);
	WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
	signIn.click();
	System.out.println("logIn");
	}

@Test(priority=2)
void correctUserIncorectPin()
{
 String username="admin";
 String pin="cyril";
WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
user.sendKeys(username);
WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys(pin);
WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
signIn.click();
System.out.println("correctUserIncorectPin");
}

@Test(priority=3)
void incorrectUsercorectPin()
{
 String username="cyril";
 String pin="admin";
WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
user.sendKeys(username);
WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys(pin);
WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
signIn.click();
System.out.println("incorrectUsercorectPin");
}

@Test
void incorrectUserIncorectPin()
{
 String username="cyril";
 String pin="cyril";
WebElement user=driver.findElement(By.xpath("//input[@type='text']"));
user.sendKeys(username);
WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
password.sendKeys(pin);
WebElement signIn=driver.findElement(By.xpath("//button[@type='submit']"));
signIn.click();
System.out.println("incorrectUserIncorectPin");
}


}
