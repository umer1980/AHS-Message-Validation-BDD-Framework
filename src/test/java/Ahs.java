import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ahs {
    public static WebDriver driver;
    @Before
    public void openbrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://ahs.bananaapps.co.uk/");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // driver.manage().deleteAllCookies();

    }
    @Test
    public void userEnterTheInvalidCredentials() {
       driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/article[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("asmin");
        driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/article[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("meedic");
        driver.findElement(By.className("chic-button")).click();
        Assert.assertEquals("invalid user name",driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[1]/form[1]/div[1]")));
    }


}
