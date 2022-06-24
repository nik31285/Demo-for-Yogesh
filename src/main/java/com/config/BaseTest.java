package com.config;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.keywords.UIKeywords;

public class BaseTest {
	@BeforeTest
	public void setUp() {
		UIKeywords.launchURL("chrome");
	}
}
