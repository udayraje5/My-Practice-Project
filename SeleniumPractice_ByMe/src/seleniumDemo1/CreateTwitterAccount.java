package seleniumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateTwitterAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By
				.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/div[1]/div/div[3]/a/div/span/span"))
				.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/label/div/div[2]/div/input"))
				.sendKeys("Uday Arsolikar");
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/label/div/div[2]/div/input"))
				.sendKeys("7264033203");
		Thread.sleep(5000);

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"SELECTOR_1\"]"));
		Select s = new Select(dropdown);
		s.selectByIndex(8);
		Thread.sleep(5000);

		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"SELECTOR_2\"]"));
		Select ss = new Select(dropdown1);
		ss.selectByValue("23");
		Thread.sleep(5000);

		WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"SELECTOR_3\"]"));
		Select sc = new Select(dropdown2);
		sc.selectByValue("1990");
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/span/span"))
				.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/span/span"))
				.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/span/span"))
				.click();
		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//*[@id=\"layers\"]/div[3]/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div/span/span"))
				.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/label/div/div[2]/div/input"))
				.sendKeys("563852");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"home_children_button\"]")).click();
		Thread.sleep(5000);

	}

}


