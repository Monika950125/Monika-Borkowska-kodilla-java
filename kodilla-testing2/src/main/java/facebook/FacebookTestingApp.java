package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FacebookTestingApp {

    public static final String XPATH_BUTTON = "/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]";
    public static final String XPATH_CREATE = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    public static final String NAME_FIELD = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input";
    public static final String LASTNAME_FIELD = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input";
    public static final String EMAIL_FIELD = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_BUTTON));
        acceptCookies.click();

        Thread.sleep(2000);

        WebElement createAccount = driver.findElement(By.xpath(XPATH_CREATE));
//        Select selectBoard = new Select(createAccount);
//        selectBoard.selectByIndex(1);
        createAccount.click();

        WebElement setName = driver.findElement(By.xpath(NAME_FIELD));
        setName.sendKeys("Paulina");


        WebElement setLastname = driver.findElement(By.xpath(LASTNAME_FIELD));
        setLastname.sendKeys("Marczuk");

        WebElement setEmail = driver.findElement(By.xpath(EMAIL_FIELD));
        setEmail.sendKeys("paulka22@gmail.com");
    }
}
