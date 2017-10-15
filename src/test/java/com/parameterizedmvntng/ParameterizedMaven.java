package com.parameterizedmvntng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterizedMaven {
	
	 WebDriver driver;

	 @Test
	 public void demoAuto() throws Exception{
	 			System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
	 			driver  = new ChromeDriver();
	 			driver.manage().window().maximize();
	 			String url = System.getProperty("url");
	 			driver.get(url);
	 			String uname = System.getProperty("uname");
	 			driver.findElement(By.id("email")).sendKeys(uname);
	 			String pass = System.getProperty("pass");
	 			driver.findElement(By.id("pass")).sendKeys(pass);
	 			driver.findElement(By.id("u_0_r")).click();
	 			
	 			
	 }

}
