import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {
    WebDriver driver;

    public Navigation(WebDriver driver){
        this.driver=driver;
    }

    By allMenu= By.xpath("//a[@id=\"nav-hamburger-menu\"]");

    By mobiles=By.xpath("//a[@data-ref-tag=\"nav_em_1_1_1_13\"]");

    By mainMenu=By.xpath("(//div[@style=\"align-items: center;\"])[7]");

    public WebElement allMenu(){return driver.findElement(allMenu);}

    public WebElement mobiles(){return driver.findElement(mobiles);}

    public WebElement mainMenu(){return driver.findElement(mainMenu);}
}
