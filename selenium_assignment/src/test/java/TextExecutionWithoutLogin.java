import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class TextExecutionWithoutLogin {
    public WebDriver driver;
    Properties prop = new Properties();
    FileInputStream fis;


    {
        try {
            fis = new FileInputStream("/home/akshiy/IdeaProjects/selenium/selenium_assignment/src/main/resources/testData.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @BeforeTest
    public void launch () throws IOException, InterruptedException {
        prop.load(fis);
        System.setProperty("webdriver.chrome.driver","/home/akshiy/Desktop/chromedriver_linux64/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(prop.getProperty("url"));
        HomePage homePage = new HomePage(driver);
        //hp.goToSignIn().click();

    }
    @Test(priority = 2)
    public void todaysDeals() throws IOException{
        prop.load(fis);
        TodaysDeals todaysDeals=new TodaysDeals(driver);
        todaysDeals.TodaysDeals().click();
    }
    @Test(priority = 3)
    public void thirdElement() throws IOException{
        prop.load(fis);
        ThirdElement thirdElement=new ThirdElement(driver);
        thirdElement.ThirdElement().click();


    }
    @Test(priority = 4)
    public void verifyCart() throws IOException, InterruptedException {
        prop.load(fis);
        String s="1";
        VerifyCart verifyCart=new VerifyCart(driver);
        verifyCart.firstElement().click();
        Thread.sleep(3000);
        verifyCart.addToCart().click();
        verifyCart.goToCart().click();


        String k= verifyCart.quantity();
        System.out.println(k);
        Assert.assertTrue(s.equalsIgnoreCase(verifyCart.quantity()));
    }
    @Test(priority = 5)
    public void searchingMobiles() throws InterruptedException {

       // String fp = "59.80";
        SearchForMobiles searchForMobiles = new SearchForMobiles(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        searchForMobiles.searching();
       // Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5500)", "");
        Thread.sleep(3000);
        String details = searchForMobiles.lastElement();
        System.out.println(details);
        driver.navigate().back();

        //driver.navigate().to("url");
    }

@AfterTest
public void navigation() throws IOException, InterruptedException {

        Navigation navigation=new Navigation(driver);
        navigation.allMenu().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        navigation.mobiles().click();
       // Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        navigation.mainMenu().click();

    }
}
