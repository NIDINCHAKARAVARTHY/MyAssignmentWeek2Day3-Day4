package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2Day3Task2 {
	public static void main (String args[]){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7865432109");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ram123");
		WebElement sele = driver.findElement(By.xpath("//select[@id='day']"));
		Select opt = new Select(sele);
		opt.selectByValue("5");
		WebElement sel = driver.findElement(By.id("month"));
		Select  opt1 = new Select (sel);
		opt1.selectByValue("12");
		Select opt2 = new Select (driver.findElement(By.id("year")));
		opt2.selectByVisibleText("1994");
		driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
		
	}

}
