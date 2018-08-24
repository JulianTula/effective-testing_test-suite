
package com.effectivetesting.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHomePageObject {
	private WebDriver driver;
	
	public AdminHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public AdminEntryPageObject goToEntrySection() {
		driver.findElement(By.xpath("/html/body/div/div[1]/div/ul[1]/li[2]/a")).click();
		
		return new AdminEntryPageObject(driver);
	}
}
