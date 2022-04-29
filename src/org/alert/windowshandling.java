package org.alert;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AAPB\\eclipse-workspace\\Seleneium April\\dri\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement btnclk = driver.findElement(By.id("twotabsearchtextbox"));

		btnclk.sendKeys("iphone 13",Keys.ENTER);
		WebElement btntxt = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Blue']"));
		btntxt.click();
		String prntid = driver.getWindowHandle();
		System.out.println(prntid);
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		for (String win : allwin) {
			if(!prntid.equals(win));
			driver.switchTo().window(win);
			
			
		}
	driver.findElement(By.id("submit.add-to-cart")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
