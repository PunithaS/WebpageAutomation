package com.costco.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CostcoHomePage extends CostcoPage {
	//WebDriver driver; 
		/* this is because we declare the driver object as a parent class and 
		 * we r going to inherit it for its child class */
		
	public CostcoHomePage() //constructor to initiate the driver
	{
	driver= new FirefoxDriver();
	
			
	}
	
	public void openHomePage(String url)//method to open home page
	{
		driver.get(url);
		driver.manage().window().maximize();
		//implicit wait code
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void search(String searchtxt)
	{
		driver.findElement(By.id("SimpleSearchForm_SearchTerm")).sendKeys(searchtxt);
		driver.findElement(By.id("search_submit")).click();
	
		
		//explicit wait code
		//WebDriverWait wait= new WebDriverWait(driver,30);
	
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));

		
	}
	
	
}



//class Super{ static{ System.out.print(" super "); } } class One{ static { System.out.print(" one "); } } class Two extends Super{ static { System.out.print(" two "); } } class Test{ public static void main( String[] args){ One o = null; Two t = new Two(); }

