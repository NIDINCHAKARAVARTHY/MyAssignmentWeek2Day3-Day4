package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {
	public static void main(String args[]) throws InterruptedException {
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
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("01");
		driver.findElement(By.xpath("//input[contains(@id,'ext-gen270')]")).sendKeys("9876543210");
	    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	    Thread.sleep(2000);
	   String opt2 = driver .findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/a")).getAccessibleName();
	   System.out.println(opt2);
	   driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/a")).click();
	   driver.findElement(By.xpath("//a[text()='Delete']")).click();
	   driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	   driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys(opt2);
	   driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	   String opt3 = driver.findElement(By.xpath("//div[text()='No records to display']")).getAccessibleName();
	   System.out.println(opt3);
} 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	