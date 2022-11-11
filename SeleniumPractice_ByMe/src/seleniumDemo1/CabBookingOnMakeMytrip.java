package seleniumDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CabBookingOnMakeMytrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chCabs']")).click();
		Thread.sleep(5000);

		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).isEnabled());
		Thread.sleep(5000);

		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).isSelected());
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).click();
		Thread.sleep(5000);

		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).isSelected());
		Thread.sleep(5000);
//	       boolean OutSSel = driver.findElement(By.className("tabsCircle appendRight5")).isSelected();
//	       System.out.println(OutSSel);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/label/span")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input"))
				.sendKeys("Pune");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input"))
				.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[2]/label/span")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input"))
				.sendKeys("Mumbai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input"))
				.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/input"))
				.sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[3]/label/span")).click();
		Thread.sleep(5000);

		String month = "Octomber2022";
		String exp_date = "2,3";

		while (true) {
			String monthText = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div"))
					.getText();
			// System.out.println(monthText);
			Thread.sleep(5000);

			if (monthText.equals(month)) {

				break;
			} else {
				driver.findElement(By.xpath(
						"//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]"))
						.click();
			}
		}
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@aria-label='Thu Oct 13 2022']")).getText();
		driver.findElement(By.xpath("//div[@aria-label='Fri Oct 21 2022']")).getText();

		/*
		 * for( WebElement ele:allDates) { Thread.sleep(5000);
		 * System.out.println(ele.getText()); Thread.sleep(5000); ele.click();
		 * 
		 * }
		 */

		System.out.println("Udayraje");
	}

}
