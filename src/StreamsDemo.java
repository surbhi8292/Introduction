import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all webelements into list
		List<WebElement> columnElements= driver.findElements(By.xpath("//tr/td[1]"));
		//capture all text of webelements into new (original) list
		List<String> orgList= columnElements.stream().map(s-> s.getText()).collect(Collectors.toList());
		// sort the original list
		List <String>sortedList=  orgList.stream().sorted().collect(Collectors.toList());
		//compare original and sorted list
		Assert.assertTrue(orgList.equals(sortedList));
	}

}
