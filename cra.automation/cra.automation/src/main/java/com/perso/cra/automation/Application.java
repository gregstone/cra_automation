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

		// set path to driver executable
		// if not specified WebDriver searches the PATH for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\APPLICATIONS\\webdriver\\chromedriver.exe");

		// set up Chrome as web navigator
		WebDriver webDriver = new ChromeDriver();
		// set web navigator options
		ChromeOptions webNavigatorOptions = new ChromeOptions();
		// webNavigatorOptions.addArguments("headless");
		webNavigatorOptions.addArguments("window-size=1200x600");

		// call url
		webDriver.get("https://sts.altengroup.com/adfs/ls/?client-request-id=348d8b37-1668-422c-bf68-96fd3738e5a3&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=LoginOptions%3D3%26estsredirect%3d2%26estsrequest%3drQIIAX2RP2jUUBzH85rrWQ_BIqW4FEruJu_eJe9dckkeKFYQvUHSXnWRW37Je69JL3-uSe7aq7gLIjh1cNStFERBEBf3Th2lOAmCODm6CF7bVVy-4_fz4fu9oZI2YQ3HoYT4tsRATIJNAyh2bdrFJqeuJF0bJND8Wm3Rfv7CDJdbdz6HB39s5_ubQ7QSluWoYLpeJJCXbYhLkW7l2XjUDrJE_4jQCUI_EDqca1DX7UpqSuyDY88YBLBLpY8Dx5DS7_hdm8Pp3FVvbVyG9CyyPNoXr9QDtDYarefZ3nSzhFKwJ1ovnUAc8YfZUKR9UeZTjaXjOG5pveJBkUkfNCYhLkRL8_JoK0oh7sPuozzWmHZhO9AH__Qd6FpL64udsSjKGVFGsejxi_Kn9bsp9-S5wjrkkNTfqw3XDzqcBBxbVgDYFKSDfWu2HbjC5QKEDx15rFazkUgj_kVF39TlbZGLZNrmMIn47XP6Gfikgn5WrhgqW1ioLSrXlVXldwW9np8tbr2r3zI-fL1_NHh71GwuKcfzehGLIfD-dOJt8Li_6aU8aSbhXlFuQECaLjF3dXN_2gyte8ObNiMvq-hXFT27pHy6_P-zTmtL1KAGNmxsmKvEZNRhVufxXw2&cbcxt=&username=jeremy.david%40alten.com&mkt=&lc=");

		// target element
		WebElement targetElm = webDriver.findElement(By.xpath("XPATH"));

		// click on target element
		targetElm.click();
		// submit form
		targetElm.submit();
	}

}
