import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetResolution {
    public static void main(String[] args) {
        
        // Set the desired screen resolution
        int width = 50000;
        int height = 40000;

        
        ChromeOptions chromeOptions = new ChromeOptions();
		
        chromeOptions.addArguments("--window-size=" + width + "," + height);

        
        WebDriver driver = new ChromeDriver();
      

       
        driver.get("https://how3-web-next-git-feature-apple-news-ui-how3.vercel.app/news");
        driver.navigate().to("https://how3-web-next-git-feature-apple-news-ui-how3.vercel.app/articles/this-meme-coin-is-on-fire-heres-why/7e8d3c21-c4a2-4902-8aeb-f34bc94f6f90");

        
        driver.close();
    }
}
