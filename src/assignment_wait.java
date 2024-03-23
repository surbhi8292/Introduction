import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class assignment_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//div[@class='form-group'][1]/input")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//div[@class='form-group'][2]/input")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]/span[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		Select dropdown= new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		dropdown.selectByValue("consult");
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".container>a")));
		List<WebElement> products=driver.findElements(By.cssSelector(".btn.btn-info"));
		for(WebElement i:products) {
			i.click();
		}
//		for(int i=0; i<products.size(); i++) {
//			products.get(i).click();
//		}
		driver.findElement(By.xpath("//li[@class='nav-item active']/a")).click();
	

	

	

	}

}
