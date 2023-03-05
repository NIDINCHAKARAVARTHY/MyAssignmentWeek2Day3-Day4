package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String args[]) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]/parent::div")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Rvai");
		driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kavin");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Raj");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.id("createContactForm_description")).sendKeys("We are learning Selenium");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ravikumar@gmail.com");
		 WebElement sele = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select opt1 = new Select (sele);
		 opt1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Selenium WebDriver");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title= driver.getTitle();
		System.out.println("Title of the page : "+title);
		
	}

}
