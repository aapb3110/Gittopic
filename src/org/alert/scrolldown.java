package org.alert;

import java.util.concurrent.Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AAPB\\eclipse-workspace\\Seleneium April\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtprint = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
JavascriptExecutor executor=(JavascriptExecutor )driver;
executor.executeScript("arguments[0], scrollIntoview(true)","down");
WebElement txt = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
executor.executeScript("argumnets[0],scrollIntoview(false)","up");

		
	}

	private static Object scrollIntoview() {
		// TODO Auto-generated method stub
		return null;
	}

}
