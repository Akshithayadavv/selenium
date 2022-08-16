import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoToOrders {
    WebDriver driver;

    public GoToOrders(WebDriver driver){
        this.driver=driver;
    }
    By orders= By.xpath("//a[@id=\"nav-orders\"]");

    By duration=By.xpath("//span[@class=\"a-button-text a-declarative\"]");

    By lastYear=By.xpath("//a[@id=\"time-filter_2\"]");

    public WebElement orders(){return driver.findElement(orders);}

    public WebElement duration(){return driver.findElement(duration);}

    public WebElement lastYear(){return driver.findElement(lastYear);}
}
