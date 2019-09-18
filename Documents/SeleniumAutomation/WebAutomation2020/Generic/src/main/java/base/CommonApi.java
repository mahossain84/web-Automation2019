package base;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonApi {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setup(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/alamgir/Documents/SeleniumAutomation/WebAutomation2020/Generic/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanup() {
        driver.close();

    }
//    @Test
//    public void test1(){
//        String title = driver.getTitle();
//        System.out.println(title);
//        //Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
//    }


    // HelperMethod


    public void tryOnXpath(String locator){
        try {
            driver.findElement(By.xpath(locator)).click();
        }catch(Exception ex ){

            driver.findElement(By.className(locator)).click();
                try{
                    driver.findElement(By.id(locator)).click();
                }catch (Exception ex2){
                    driver.findElement(By.xpath(locator)).click();

                }

        }
    }


    public void typeOnElement(String locator, String value) {
        // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);

        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            driver.findElement(By.id(locator)).sendKeys(value);


        }
    }



    public void clickOnElement(String locator) {
        try{
            driver.findElement(By.cssSelector(locator)).click();
        }catch (Exception ex1 ){
            driver.findElement(By.className(locator)).click();
            try{
                driver.findElement(By.id(locator)).click();
            }catch (Exception ex2){
                driver.findElement(By.xpath(locator)).click();

            }

        }
    }
}
