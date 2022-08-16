import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentMethod {

    WebDriver driver;

    public PaymentMethod(WebDriver driver){this.driver=driver;}

    By signIn = By.cssSelector("a[data-nav-ref='nav_youraccount_btn']");

    By yourPayments=By.xpath("//div[@data-card-identifier='PaymentOptions']");

    By newAdd=By.xpath("//span[@id=\"pp-sPM7RH-61-announce\"]");

    By cardNo=By.xpath("//input[@id=\"pp-bTSjuK-15\"]");

    By nameOnCard=By.xpath("//input[@id=\"pp-T0rkGN-17\"]");

    By cancel=By.xpath("//button[@id=\"pp-iDzLq3-24-announce\"]");
    By alert=By.xpath("(//span[@class=\"a-size-medium pmts-address-field\"])[1]");

    public WebElement signIn(){return driver.findElement(signIn);}

    public WebElement yourPayments(){return driver.findElement(yourPayments);}

    public WebElement newAdd(){return driver.findElement(newAdd);}

    public WebElement cardNo(){return driver.findElement(cardNo);}

    public WebElement nameOnCard(){return driver.findElement(nameOnCard);}

    public WebElement cancel(){return driver.findElement(cancel);}
    public String Alert(){
        String message=driver.findElement(alert).getText();
    return message;
    }
}
