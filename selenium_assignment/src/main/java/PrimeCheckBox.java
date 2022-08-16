import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrimeCheckBox {
    WebDriver driver;

    public PrimeCheckBox(WebDriver driver){
        this.driver=driver;
    }

    By checkBox= By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[1]");

   // By element=By.xpath("(//div[@class=\"aok-relative\"])[1]");

    By details=By.xpath("(//div[@class=\"a-row a-size-base a-color-secondary s-align-children-center\"])[1]");

    public WebElement checkBox(){return driver.findElement(checkBox);}

    //public WebElement element(){return driver.findElement(element);}

    public String details(){
        String message=driver.findElement(details).getText();
        return message;
    }

}
