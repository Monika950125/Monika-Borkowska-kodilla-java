package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_BUTTON = "//div[contains(@class, \"_4t2a\")]/div/button[2]";
    public static final String XPATH_CREATE = "//div[contains(@class, \"_4t2a\")]/div/button[2]";




    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");


        WebElement selectCombo = driver.findElement(By.xpath(XPATH_BUTTON));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(2);
        selectCombo.submit();

        selectCombo = driver.findElement(By.)
    }
}
