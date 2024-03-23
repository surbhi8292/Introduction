import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class ChromeOptionss {

	public static void main(String[] args) {
		//you can use to customize and configure a ChromeDriver session
		//https://chromedriver.chromium.org/capabilities
		ChromeOptions options = new ChromeOptions();
		//options.addExtensions(Path Of extension);
		// Set proxy
//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("ipaddress:4444");
//		options.setCapability("proxy", proxy);
//
//		options.setCapability("proxy", proxy);
//
//		Map<String, Object> prefs = new HashMap<String, Object>();
//
//		prefs.put("download.default_directory", "/directory/path");
//
//		options.setExperimentalOption("prefs", prefs);

		// FirefoxOptions options1 = new FirefoxOptions();

		// options1.setAcceptInsecureCerts(true);

		// EdgeOptions options2 = new EdgeOptions();

		options.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());



		}

	}

