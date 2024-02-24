import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Devzery_assertion {
	@Test

	public static void test() {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.devzery.com");
		SoftAssert test =new SoftAssert();  
		
		//Login user
				driver.findElement(By.xpath("//*[@id=\"outlined-required\"]")).sendKeys("namratabayas@gmail.com");
				driver.findElement(By.className("loginPass")).sendKeys("Namrata#12345");
				driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
				//Assertion for test case 
				boolean b=driver.findElement(By.className("MuiTypography-root MuiTypography-h6 navText css-vcaenl")).isDisplayed();
				test.assertEquals(b, true);

	}

}
