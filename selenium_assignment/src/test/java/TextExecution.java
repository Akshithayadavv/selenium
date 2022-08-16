import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TextExecution {
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


    @Test(priority = 1)
    public void launch () throws IOException, InterruptedException {
        prop.load(fis);
        System.setProperty("webdriver.chrome.driver","/home/akshiy/Desktop/chromedriver_linux64/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(prop.getProperty("url"));
        HomePage homePage = new HomePage(driver);
        homePage.goToSignIn().click();

    }

    @Test(priority = 2)
    public  void loginPage() throws IOException {
        prop.load(fis);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailId().sendKeys(prop.getProperty("mailId"));
        loginPage.continuebtn().click();
        loginPage.sendPassWord().sendKeys(prop.getProperty("passWord"));
        loginPage.SignIn().click();
    }
        @Test(priority = 3)
    public void searchingMobiles() throws InterruptedException {


        SearchForMobiles searchForMobiles = new SearchForMobiles(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        searchForMobiles.searching();

        PrimeCheckBox primeCheckBox=new PrimeCheckBox(driver);
        primeCheckBox.checkBox().click();
       // pc.element().click();
        String k=primeCheckBox.details();
        System.out.println(k);
    }

    @Test(priority =4)
    public void goToOrders(){
        GoToOrders goToOrders=new GoToOrders(driver);
        goToOrders.orders().click();
        goToOrders.duration().click();
        goToOrders.lastYear().click();
    }
    @Test(priority = 5)
    public void addNewAddress() throws IOException,InterruptedException{
        String s="Yadav";
        prop.load(fis);
        NewAddress newAddress = new NewAddress(driver);
        newAddress.signIn().click();
        newAddress.yourAddress().click();
        newAddress.newAdd().click();
        newAddress.name().sendKeys(prop.getProperty("name"));
        newAddress.phoneNo().sendKeys(prop.getProperty("phoneNo"));
        newAddress.street().sendKeys(prop.getProperty("street"));
        newAddress.city().sendKeys(prop.getProperty("city"));
        newAddress.state().click();
        newAddress.stateselection().click();
        Thread.sleep(3000);
        newAddress.zipCode().sendKeys(prop.getProperty("zipCode"));
        Thread.sleep(5000);
        newAddress.addAddress().click();
        Thread.sleep(5000);
        Assert.assertTrue(s.equalsIgnoreCase(newAddress.Alert()));
        LogOut logOut= new LogOut(driver);
        logOut.signIn().click();
        Thread.sleep(5000);
        logOut.signOut().click();
        loginPage();

    }
//    @Test(priority = 6)
//    public  void logIn_page1() throws IOException {
//        prop.load(fis);
//        LoginPage lp = new LoginPage(driver);
//        lp.emailId().sendKeys(prop.getProperty("mailId"));
//        lp.continuebtn().click();
//        lp.sendPassWord().sendKeys(prop.getProperty("passWord"));
//        lp.SignIn().click();
//    }
    @Test(priority = 6)
    public void addNewPayment() throws IOException, InterruptedException {
        String s="Karthikeya yadav";
        prop.load(fis);
        PaymentMethod paymentMethod = new PaymentMethod(driver);
        paymentMethod.signIn().click();
        paymentMethod.yourPayments().click();

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,5500)", "");
//       //Thread.sleep(5000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//        pm.newAdd().click();
//        pm.cardNo().sendKeys(prop.getProperty("cardNo"));
//        pm.nameOnCard().sendKeys(prop.getProperty("nameOnCard"));
      //  pm.cancel().click();
        Assert.assertTrue(s.equalsIgnoreCase(paymentMethod.Alert()));
////       LogOut lo= new LogOut(driver);
////        lo.signIn();
////        Thread.sleep(3000);
////        lo.signOut().click();
    }

}