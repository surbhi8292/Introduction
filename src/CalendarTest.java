import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monthNumber = "06";

		String date = "15";

		String year = "2027";
		// value="2027-06-15"
		String expDate = year + "-" + monthNumber + "-" + date;

		String[] expectedList = { monthNumber, date, year };

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();

		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(monthNumber) - 1).click();

		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		String actualDate = driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']/input"))
				.getAttribute("value");
		Assert.assertEquals(actualDate, expDate);

//		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup"));
//
//		for(int i =0; i<actualList.size();i++)
//
//		{
//
//		System.out.println(actualList.get(i).getAttribute("value"));
//
//		Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
//
//		}

		driver.close();

	}
//
//
//
//		}

}
