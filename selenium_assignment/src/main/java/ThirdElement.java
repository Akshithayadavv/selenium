import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThirdElement {
    WebDriver driver;

    public ThirdElement(WebDriver driver){
        this.driver=driver;
    }

    By thirdElement= By.xpath("(//a[@class=\"a-link-normal\"])[5]");


    public WebElement ThirdElement() {
        return driver.findElement(thirdElement);
    }
}
