package google;

import config.WebDriverConfig;
import org.openqa.selenium.WebDriver;

public class GoogleTestingApp {
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");
    }
}
