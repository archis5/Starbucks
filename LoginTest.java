/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Owner
 */
public class LoginTest {

    private WebDriver driver;
    private String baseUrl;

    public LoginTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testLogin() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://www.starbucks.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("truste-consent-button")).click();

        driver.findElement(By.linkText("Find a store")).click();
        driver.findElement(By.name("place")).click();
        driver.findElement(By.name("place")).clear();
        driver.findElement(By.name("place")).sendKeys("1018 n meacham");
        driver.get("https://www.starbucks.com/store-locator?map=42.045186,-88.048361,11z&place=1018%20N%20Meacham%20Rd,%20Schaumburg,%20IL,%20USA");
        driver.findElement(By.xpath("//main[@id='content']/div[2]/section/div[2]/div/div/div/div/button")).click();
        
        driver.findElement(By.linkText("Cold Coffees")).click();
        //driver.findElement(By.xpath("//*[contains(text(), 'Cold Coffees')]")).click();
        
        driver.findElement(By.linkText("Nitro Cold Brew")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[3]/div/div/div/div/div/div/button")).click();
        driver.findElement(By.xpath("//div[@id='js-content']/div/div[5]/div[2]/div/div/div[2]/div[2]/button/span/span[2]")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[2]/div/div/div[2]/div/div/div/button")).click();
        driver.findElement(By.xpath("//div[@id='js-content']/div/div[3]/div/div/div/div[2]/div/div/div/div/p[3]/button")).click();
        driver.findElement(By.xpath("//main[@id='content']/div[2]/div/div/form/div[2]/div/label")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("josephburns60173@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("JosephBurns60173@");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    }
}
