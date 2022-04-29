package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmalert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AAPB\\eclipse-workspace\\Seleneium April\\dri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement btnclk = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btnclk.click();
		WebElement btngo = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		btngo.click();
		
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("bharathi");
		alert.accept();
	WebElement text = driver.findElement(By.id("demo1"));
	String text2 = text.getText();
	System.out.println(text2);
	
       
	}

}
