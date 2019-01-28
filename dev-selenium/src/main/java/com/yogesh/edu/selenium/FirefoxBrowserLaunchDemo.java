package com.yogesh.edu.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunchDemo {

	public static void main(String[] args) throws InterruptedException {
		//Creating a driver object referencing WebDriver interface
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\yoges\\\\Downloads\\\\softwares\\\\geckodriver-v0.22.0-win64\\\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();
        
        driver.get("http://google.com");
        
        WebElement we = driver.findElement(By.name("q"));
        we.sendKeys(new String[]{"Yogesh"});
        
        Thread.sleep(5);
        
        //Closing the browser
        driver.quit();
	}
}
