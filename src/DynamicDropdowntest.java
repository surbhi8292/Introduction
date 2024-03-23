import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowntest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		List<WebElement> optionsElements = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		for (WebElement i : optionsElements) {
			System.out.println(i.getText());
			if (i.getText().equalsIgnoreCase("India")) {
				i.click();
				break;
			}
		}
		System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getAttribute("value"));
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
//		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
//		 System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

		


	}
}
