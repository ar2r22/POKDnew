package Tests;

import org.junit.After;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;



public class BaseTest {
    public WebDriver driver;

    @BeforeClass

    public void setUp() throws InterruptedException {
        File file = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        //driver = new ChromeDriver();
        driver=new ChromeDriver();
        //AFT
        //driver.get("http://srv-dev-rrsys-avanpost/oauth2/authorize?response_type=code&client_id=pokd-test&scope=openid+profile+permissions&redirect_uri=https%3A%2F%2Fk8s.supercode.ru%3A3500%2Fokd%2Faft-okd-ui%2F");
        //DEV
        driver.get("http://srv-dev-rrsys-avanpost/oauth2/authorize?response_type=code&client_id=pokd-test&scope=openid+profile+permissions&redirect_uri=https%3A%2F%2Fk8s.supercode.ru%3A3500%2Fokd%2Fdev-okd-ui%2F");
        //FT
        //driver.get("http://srv-dev-rrsys-avanpost/oauth2/authorize?response_type=code&client_id=pokd-test&scope=openid+profile+permissions&redirect_uri=https%3A%2F%2Fk8s.supercode.ru%3A3500%2Fokd%2Fdev-okd-ui%2F");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);

        WebElement searchLogin = driver.findElement(By.name("username"));
        searchLogin.click();
        searchLogin.sendKeys("apokd");

        WebElement searchPass = driver.findElement(By.name("password"));
        searchPass.click();
        searchPass.sendKeys("aPOKD10");
        searchPass.sendKeys (Keys.RETURN);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();

    }

    //@DataProvider(name = "dataProvider")
    //public Object[][] dataProviderMethod() {
    //    return new Object[][]{{"викинги"}, {"викинги1"}};

    //}
    /*@AfterTest
    public void closeBrowser() {
        driver.quit();
        driver = null;
    }

     */
}

