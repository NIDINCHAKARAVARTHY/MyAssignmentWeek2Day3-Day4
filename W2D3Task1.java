package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W2D3Task1 {
public static void main(String args[]) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorativeSubmit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_companyName')]")).sendKeys("TESTLEAF");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstName')]")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_lastName')]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_primaryEmail')]")).sendKeys("ramkumar123@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_primaryPhoneNumber')]")).sendKeys("7658587565");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		
}}