package withgitjenkinsdocker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstClassOfThisProject {

	public static void main(String[] args) throws MalformedURLException {
		//DesiredCapabilities dc=DesiredCapabilities.
		FirefoxOptions options=new FirefoxOptions();
		URL url=new URL("http://localhost:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,options);;
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
