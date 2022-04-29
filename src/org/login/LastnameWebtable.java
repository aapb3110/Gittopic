package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastnameWebtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AAPB\\eclipse-workspace\\Seleneium April\\dri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement tabledata = driver.findElement(By.id("customers"));
		 List<WebElement> allrow = tabledata.findElements(By.tagName("tr"));
		 
		 for (int i = 0; i < allrow.size(); i++) {
			 if (i/2==1) {
			 
				 WebElement element = allrow.get(i);
				 String text2 = element.getText();
				 System.out.println(text2);
				
			}}}}


