package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement  switchto = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		switchto.click();
		WebElement  option = driver.findElement(By.xpath("//a[@style='color: white']"));
		option.click();
		WebElement  SimpleAlret = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		SimpleAlret.click();
		driver.switchTo().alert().accept();
	}
}
