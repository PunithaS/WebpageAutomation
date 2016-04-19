package com.costco.pages;

import org.openqa.selenium.WebDriver;

public abstract class CostcoPage {
protected static WebDriver driver;
// this is protected because it should not be accessed by its child class
// this is static because the driver should use the same page for all testing

}
