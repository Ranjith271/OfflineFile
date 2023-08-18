import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement create = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		create.click();
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		fname.sendKeys("Ranjith");
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("Kumar");
		WebElement email = driver.findElement(By.xpath(" (//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		email.sendKeys("7904639586");
		WebElement pass = driver.findElement(By.xpath("//input[@ autocomplete='new-password']"));
		pass.sendKeys("Ranjith@1234");
		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		gender.click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\ScreenShot.sc.png");
		FileUtils.copyFile(source, destination);
		WebElement  day = driver.findElement(By.id("day"));
		Select s= new Select(day);
		s.selectByValue("23");
		WebElement  month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("Aug");
		WebElement  year = driver.findElement(By.id("year"));
		Select y= new Select(year);
		 y.selectByIndex(2023);
		
		
	}

}
///\ScreenShot