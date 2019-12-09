package Facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"/home/user/Desktop/selenium/drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][contains(text(),'Panasonic')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //li[@id='p_n_feature_seven_browse-bin/6215729011']//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	}

}
