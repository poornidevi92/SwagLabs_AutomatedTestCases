package D1_SeleniumAutomatedTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1_Swaglabs {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd= new FirefoxDriver();
		wd.get("https://www.saucedemo.com/");
		
		WebElement Username = wd.findElement(By.id("user-name"));
		Username.sendKeys("standard_user");
		WebElement password = wd.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement Login = wd.findElement(By.id("login-button"));
		Login.submit();
		
		WebElement AddtoCart = wd.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddtoCart.click();
		Thread.sleep(2000);
		
		WebElement AddtoCartVerify = wd.findElement(By.id("shopping_cart_container"));
		AddtoCartVerify.click();
		
		WebElement RemoveCartitem = wd.findElement(By.id("remove-sauce-labs-backpack"));
		RemoveCartitem.click();
	
	}

}
