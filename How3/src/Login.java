
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	public static void main(String[] args) {
		
      WebDriver driver = new ChromeDriver();
		
			driver.get("https://how3-web-next-git-feature-apple-news-ui-how3.vercel.app/news");
		
		

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		driver.findElement(By.cssSelector(".h-5")).click();
		
		
		// login user 
		driver.findElement(By.linkText("Login")).click();
		 
		 driver.findElement(By.id("username")).sendKeys("namratabayas@gmail.com"); 
		 driver.findElement(By.id("password")).sendKeys("xyz12345"); 
		driver.findElement(By.name("action")).click();
		
		
		 // navigate to other page
		 driver.navigate().to("https://api.twitter.com/oauth/authenticate?oauth_token=KN-LKgAAAAABpVSzAAABjc-kTvk&login_hint=");
		 driver.navigate().back();
		 
		 
			
		
		 
		 
		 

	}

}
