import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.remote.CapabilityType;
		import org.openqa.selenium.remote.DesiredCapabilities;
public class Ssl {

	public static void main(String[] args) throws MalformedURLException, IOException {
WebDriver driver= new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
HttpURLConnection Conn= (HttpURLConnection)new URL(url).openConnection();
Conn.setRequestMethod("HEAD");
Conn.connect();
int responseCode= Conn.getResponseCode();
System.out.println(responseCode);


		}
	}