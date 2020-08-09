package com.perso.cra.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// set up Chrome as web navigator
		WebDriver webDriver = new ChromeDriver();
		// set web navigator options
		ChromeOptions webNavigatorOptions = new ChromeOptions();
		webNavigatorOptions.addArguments("headless");
		webNavigatorOptions.addArguments("window-size=1200x600");

		// call url
		webDriver.get("URL_TO_CALL");

		// target element
		WebElement targetElm = webDriver.findElement(By.xpath("XPATH"));

		// click on target element
		targetElm.click();
		// submit form
		targetElm.submit();
	}

}
