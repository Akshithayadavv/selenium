import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyCart {

    WebDriver driver;

    public VerifyCart(WebDriver driver){
        this.driver=driver;
    }
    By firsElement= By.xpath("(//div[@class=\"a-section octopus-dlp-image-shield\"])[1]");

    By addToCart=By.xpath("//input[@id=\"add-to-cart-button\"]");

    By goToCart=By.xpath("//a[@class=\"a-button-text\"]");

    By quantity=By.xpath("//span[@class=\"a-dropdown-prompt\"]");

    public WebElement firstElement(){return driver.findElement(firsElement);}
     public WebElement addToCart(){return driver.findElement(addToCart);}

    public WebElement goToCart(){return driver.findElement(goToCart);}

    public String quantity(){
        String message=driver.findElement(quantity).getText();
        return message;
    }


}
