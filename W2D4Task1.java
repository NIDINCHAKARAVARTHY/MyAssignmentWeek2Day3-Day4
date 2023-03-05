package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W2D4Task1 {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id='username_container']/input[1]")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//form[@id='login_form']/input")).sendKeys("Leaf@123");
		driver.findElement(By.xpath("//label[text()='Password']/following::input[2]")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/ancestor::button")).click();
        driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button")).click();
		
	}

}
