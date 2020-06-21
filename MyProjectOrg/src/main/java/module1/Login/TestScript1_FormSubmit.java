package module1.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testautomationguru.utility.PDFUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript1_FormSubmit {

	public static void main(String[] args) {

		WebDriver driver = null;

		// Car driver
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");

		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.submit();
		// driver.findElement(By.name("btnK")).click();

		// Verify Title

		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);

		PDFUtil pdfUtil = new PDFUtil();
		// pdfUtil.compare(file1, file2);
		// Close browser
		driver.quit();
	}

}
