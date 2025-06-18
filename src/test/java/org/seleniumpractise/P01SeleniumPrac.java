package org.seleniumpractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P01SeleniumPrac extends BaseHelperClass {

	
	public static void main(String[] args) throws IOException {
		
		excelRead("C:\\Users\\UsEr\\eclipse-workspace_01\\SmartSkillsMockPractise\\Screenahots\\LoginFbData1.xlsx", "LoginFb", 3, 4, "dd-MMM-yyyy");
		WebDriver driver = new ChromeDriver();
		driver.get("www.flipkart.com");
		driver.manage().window().maximize();
		driver.get("www.facebook.com");	
		}
	
	
	
}
