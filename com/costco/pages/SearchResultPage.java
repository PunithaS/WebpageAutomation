package com.costco.pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

public class SearchResultPage extends CostcoPage {
	//WebDriver driver;
	
public String getTotalSearchResult()
{
	String totalSearchResult= driver.findElement(By.xpath("//*[@id='box']/div[5]/span")).getText();
	String strar[]=totalSearchResult.split(" of ");
	return(strar[strar.length-1]); //here -1 is to take . in the label
	

}

}
