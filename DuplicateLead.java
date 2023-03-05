package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class  DuplicateLead {

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
			driver.findElement(By.xpath("//span[text()='Email']")).click();
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("vignesh@gmail.com");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(@class,'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first')]//a"));
			String opt3  = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
			System.out.println(opt3);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
			driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
			 String Actual = driver.getTitle();
		        String title = "Duplicate Lead | opentaps CRM";

		        if (Actual.equals(title)) {
		                   System.out.println("Equal");
		        } else {
		                   System.out.println("NotEqual");
		        }
		        driver.findElement(By.linkText("Create Lead")).click();
				
				driver.close();
				
		

	}

}
