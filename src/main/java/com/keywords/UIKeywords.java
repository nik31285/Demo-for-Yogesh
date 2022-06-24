package com.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	 static WebDriver driver;
	
	public static void launchURL(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		}
	}

	public static void enterUsername(String uName) {
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys(uName);
	}

	public static void enterPassword(String pWords) {
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(pWords);
	}

	public static void clickOnLogin() {
		driver.findElement(By.cssSelector("input#btnLogin")).click();
	}

	public static void verifyTitleName() {
		String ActualTitleName=driver.getTitle();
		System.out.println(ActualTitleName);
		Assert.assertTrue(ActualTitleName.contains("OrangeHRM"));
	}

	public static void isAvailable() throws Exception {
		System.out.println("Hello");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#MP_btn")).click();
		
	}
}
