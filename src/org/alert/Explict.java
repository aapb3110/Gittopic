package org.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explict {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AAPB\\eclipse-workspace\\Seleneium April\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement btnclk = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnclk.click();
		WebDriverWait d = new WebDriverWait (driver,Duration.ofSeconds(10));
		WebElement until = d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
		until.sendKeys("bharathi");
	}

}
