package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement multi = driver.findElement(By.id("cars"));
		Select s = new Select(multi);
		boolean multiple = s.isMultiple();
		System.out.println("To Check the Multiple " + multiple);
		s.selectByIndex(1);
		s.selectByValue("audi");
		s.selectByVisibleText("Volvo");
	
		System.out.println("=============================================");
		List<WebElement> options = s.getOptions();
	for (WebElement webElement : options) {
		System.out.println("Get All options: " + webElement.getText() );
	}
	for (WebElement  alloption : options) {
		System.out.println("Select All options "+ alloption.getText());
	}
	}
}
