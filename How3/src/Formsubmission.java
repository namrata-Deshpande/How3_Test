

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formsubmission {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://how3-web-next-git-feature-apple-news-ui-how3.vercel.app/news");
		
		
		
		driver.findElement(By.cssSelector(".h-5")).click();
		driver.findElement(By.linkText("Login")).click();
		// form submission 
				driver.findElement(By.linkText("Sign up")).click();
				driver.findElement(By.id("username")).sendKeys("namrata_bayas"); 
				 driver.findElement(By.id("password")).sendKeys("xyz12345");
				 driver.findElement(By.id("email")).sendKeys("namratabayas@gmail.com");
				 driver.findElement(By.name("action")).click();
				 driver.close();
	}

}
