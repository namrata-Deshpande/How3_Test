import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://how3-web-next-git-feature-apple-news-ui-how3.vercel.app/news");
		       //take a screenshot
				File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		        try {
		            // Save the screenshot to a file
		            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\lenovo\\Videos\\screenshot.png"));
		            System.out.println("Screenshot saved successfully.");
		        } catch (Exception e) {
		            System.out.println("Failed to save screenshot: " + e.getMessage());
		        }


	}

}
