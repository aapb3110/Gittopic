package org.login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleselectDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AAPB\\eclipse-workspace\\Seleneium April\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement txtbtn = driver.findElement(By.xpath("//a[text()=\'Create New Account\']"));
		txtbtn.click();
		WebElement dropday = driver.findElement(By.id("day"));
		Select select = new Select(dropday);
		select.selectByValue("30");
		WebElement dropmonth = driver.findElement(By.id("month"));
		Select select1 = new Select(dropmonth);
	
		select1.selectByIndex(9);
		WebElement dropyear = driver.findElement(By.id("year"));
		Select select2 = new Select(dropyear);
		
		select2.selectByVisibleText("1990");
		
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = select2.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.println(text);
			
		}
		
	
		
		
	}

}
