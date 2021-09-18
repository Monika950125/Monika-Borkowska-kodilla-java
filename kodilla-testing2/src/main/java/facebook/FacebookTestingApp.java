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
    public static final String SECOND_EMIAL_FIELD = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input";
    public static final String PASSWORD_FIELD = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input";
    public static final String BIRTHDAY = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
    public static final String MONTH_OF_BIRTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]";
    public static final String YEAR_OF_BIRTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]";
    public static final String SEX = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label";
    public static final String REGISTER_BUTTON = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[10]/button";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_BUTTON));
        acceptCookies.click();

        Thread.sleep(2000);

        WebElement createAccount = driver.findElement(By.xpath(XPATH_CREATE));
        createAccount.click();


        Thread.sleep(2000);
        WebElement setName = driver.findElement(By.xpath(NAME_FIELD));
        setName.sendKeys("Paulina");


        WebElement setLastname = driver.findElement(By.xpath(LASTNAME_FIELD));
        setLastname.sendKeys("Marczuk");

        WebElement setEmail = driver.findElement(By.xpath(EMAIL_FIELD));
        setEmail.sendKeys("paulka22@gmail.com");

        WebElement setEmail_2 = driver.findElement(By.xpath(SECOND_EMIAL_FIELD));
        setEmail_2.sendKeys("paulka22@gmail.com");

        WebElement setPassword = driver.findElement(By.xpath(PASSWORD_FIELD));
        setPassword.sendKeys("paulka23@");


        WebElement setBirthday = driver.findElement(By.xpath(BIRTHDAY));
        setBirthday.click();
        Select selectDay = new Select(setBirthday);
        selectDay.selectByIndex(26);

        WebElement setMonth = driver.findElement(By.xpath(MONTH_OF_BIRTH));
        setBirthday.click();
        Select selectMonth = new Select(setMonth);
        selectMonth.selectByIndex(5);

        WebElement setYear = driver.findElement(By.xpath(YEAR_OF_BIRTH));
        setYear.click();
        Select selectYear = new Select(setYear);
        selectYear.selectByIndex(25);

        WebElement setSex = driver.findElement(By.xpath(SEX));
        setSex.click();

        WebElement register = driver.findElement(By.xpath(REGISTER_BUTTON));
        register.click();

    }
}
