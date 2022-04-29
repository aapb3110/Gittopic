package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class samplejavascript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AAPB\\eclipse-workspace\\Seleneium April\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.id("email"));
		
		JavascriptExecutor executor =(JavascriptExecutor) driver; 
		executor.executeScript("arguments[0],setattribute('value','ramkumar')",txtuser);
		Object executeScript = executor.executeScript("return arguments[0],geattribute('value')");
		System.out.println("email");
		WebElement txtpass = driver.findElement(By.xpath("pass"));
		executor.executeScript("arguments[0],setattribute('value','hello123')",txtpass);
		Object executeScript1 = executor.executeScript("return arguments[0],geattribute('value')");
		System.out.println("pass");
		WebElement btnlogin = driver.findElement(By.name("login"));
		executor.executeScript("arguments[0],click()",btnlogin);

}}
