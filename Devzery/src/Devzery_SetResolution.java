import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Devzery_SetResolution {
    public static void main(String[] args) {
        
      

       
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=30000,2000");

        
        WebDriver driver = new ChromeDriver();
       
 
        driver.get("https://app.devzery.com");
       
    }
}
