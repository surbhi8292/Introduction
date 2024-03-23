import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String option = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(option);
		driver.findElement(By.id("checkBoxOption2")).click();
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByVisibleText(option);
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		if (alertText.contains(option)) {
			System.out.println("Correct execution");
		} else {
			System.out.println("Incorrect execution");
		}
//		String arr[]= alertText.split(",");
//		String a[]= arr[0].split(" ");
//		System.out.println(a[1]);
		// System.out.println(alertText.split(",")[0].split(",")[1]);

	}

}
