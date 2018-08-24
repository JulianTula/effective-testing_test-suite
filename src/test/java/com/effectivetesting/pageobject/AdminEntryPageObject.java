package com.effectivetesting.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminEntryPageObject {
	private WebDriver driver;
	
	public AdminEntryPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public AdminEntryPageObject deleteEntry() {
//		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/form/button/i")).click();
//		
		
		driver.findElement(By.xpath("/html/body/div/table/thead/tr/th[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div/table/thead/tr/th[8]/a")).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/form/button/i")).click();

//		driver.findElement(By.xpath("/html/body/div/table/thead/tr/th[1]/input")).click();
//		driver.findElement(By.xpath("/html/body/div/ul/li[4]/a/b")).click();
//		driver.findElement(By.xpath("/html/body/div/ul/li[4]/ul/li/a")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	    alert.accept();
	    
	    WebDriverWait waitForMessage = new WebDriverWait(driver, 10);
	    waitForMessage.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]")));
	    
		return this;
	}
	
}
