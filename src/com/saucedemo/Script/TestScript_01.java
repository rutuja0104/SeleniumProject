package com.saucedemo.Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.beust.jcommander.internal.Maps;
import com.saucedemo.generics.Map;
import com.saucedemo.generics.propertyfile;

public class TestScript_01
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
        driver.get(propertyfile.getData("url"));
		Map.readDataTomap("Loginpage");
		driver.findElement(By.id("user-name")).sendKeys(Map.getDataFromMap("username"));
		driver.findElement(By.id("password")).sendKeys(Map.getDataFromMap("password"));
		driver.findElement(By.id("login-button")).click();
	}
}