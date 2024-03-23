import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,700)");
	js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=2000");
	List<WebElement> values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	for(WebElement i: values) {
		sum= sum+Integer.parseInt(i.getText());
	}
	System.out.println(sum);
	String amtText=driver.findElement(By.cssSelector(".totalAmount")).getText();
	String expString= amtText.split(":")[1].trim();
	Assert.assertEquals(sum, Integer.parseInt(expString));
	driver.close();
	
	
		
		
		
		
	

}
}