package com.ss;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Phase6ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase6ProjectApplication.class, args);
	}

}
//Selenium testing
/*
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\govin\\chromedriver.exe"); //webdriver is an interface WebDriver
 * driver = new ChromeDriver();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 * driver.get("http://localhost:8095/");
 * 
 * driver.findElement(By.id("inputUsername")).sendKeys("Rengaraj");
 * driver.findElement(By.name("inputPassword")).sendKeys("1234");
 * driver.findElement(By.className("signInBtn")).click();
 * System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
 * driver.findElement(By.linkText("Forgot your password?")).click();
 * driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(
 * "Dhasvin");
 * driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(
 * "Dhasvin");
 * driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(
 * "dashvin@2022");
 * driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys(
 * "raj@2022");
 * driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).
 * sendKeys("rag@342");
 * driver.findElement(By.xpath("//form/input[3]")).sendKeys("9789337564");
 * Thread.sleep(3000);
 * driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
 * System.out.println(driver.findElement(By.cssSelector("form p")).getText());
 * driver.findElement(By.xpath(
 * "//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
 * driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Raj");
 * driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(
 * "rahulshettyacademy"); driver.findElement(By.id("chkboxOne")).click();
 * 
 * driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
 * 
 * }
 * 
 * }
 * 
 */