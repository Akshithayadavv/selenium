import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    By signIn = By.cssSelector("a[data-nav-ref='nav_ya_signin']");

//    public void goToSignIn(){
//        WebElement e=  driver.findElement(signIn);
//        Actions action = new Actions(driver);
//        action.moveToElement(e).build().perform();
//    }

    public WebElement goToSignIn(){
        return  driver.findElement(signIn);
    }

}
