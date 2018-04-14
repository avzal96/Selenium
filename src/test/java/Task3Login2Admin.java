import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task3Login2Admin {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\xampp\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void MyFirstTest(){
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        // wait.until(titleIs("Webdriver - Szukaj w Google"));
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

}
