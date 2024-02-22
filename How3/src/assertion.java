import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
public class assertion {
  @Test
	public static void test()
	{
		//Assertion for test case 
		WebDriver driver = new ChromeDriver();  
		driver.navigate().to("https://how3-web-next-git-feature-apple-news-ui-how3.vercel.app/news");  
		SoftAssert test =new SoftAssert();  
		boolean b=driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[1]/a/span/h1")).isDisplayed();
		test.assertEquals(b, true);
		boolean c=driver.findElement(By.cssSelector(".h-5")).isDisplayed();
		test.assertEquals(c, true);
		
		}

	}


