import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.cssSelector(".table-display"));
		int rowsNo = table.findElements(By.tagName("tr")).size();
		System.out.println("No. of rows:" + rowsNo);
		//table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size())
		int ColumnNo = table.findElements(By.tagName("th")).size();
		System.out.println("No. of columns:" + ColumnNo);
		List<WebElement> secondRoWebElements= table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondRoWebElements.get(0).getText());
		System.out.println(secondRoWebElements.get(1).getText());
		System.out.println(secondRoWebElements.get(2).getText());

	}

}
