import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodaysDeals {

    WebDriver driver;

    public TodaysDeals(WebDriver driver){
        this.driver=driver;
    }

    By todaysDeals= By.xpath("(//a[@class=\"nav-a  \"])[2]");


    public WebElement TodaysDeals() {
        return driver.findElement(todaysDeals);
    }
}
