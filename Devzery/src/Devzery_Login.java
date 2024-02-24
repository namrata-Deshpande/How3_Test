import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Devzery_Login {

	public static void main(String[] args) {
		//Login user
WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.devzery.com");
		driver.findElement(By.xpath("//*[@id=\"outlined-required\"]")).sendKeys("namratabayas@gmail.com");
		driver.findElement(By.className("loginPass")).sendKeys("Namrata#12345");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

}
