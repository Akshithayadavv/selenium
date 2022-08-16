import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAddress {

    WebDriver driver;

    public NewAddress(WebDriver driver){this.driver=driver;}


    By signIn = By.cssSelector("a[data-nav-ref='nav_youraccount_btn']");

    By yourAddress=By.xpath("//div[@data-card-identifier='AddressesAnd1Click']");

    By newAdd=By.xpath("//div[@id='ya-myab-plus-address-icon']");

    By name=By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']");

    By phoneNo=By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']");

    By street=By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']");

    By city=By.xpath("//input[@id='address-ui-widgets-enterAddressCity']");

    By state=By.xpath("(//span[@class=\"a-button-text a-declarative\"])[2]");

    By stateselection=By.xpath("//a[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_17']");
    By zipCode=By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']");

    By addAddress=By.xpath("//input[@class='a-button-input']");

    By alert=By.xpath("(//span[@class='a-list-item'])[78]");

    public WebElement signIn(){
        return driver.findElement(signIn);
    }

    public WebElement yourAddress(){return driver.findElement(yourAddress);}

    public WebElement newAdd(){return driver.findElement(newAdd);}

    public WebElement name(){return driver.findElement(name);}

    public WebElement phoneNo(){return driver.findElement(phoneNo);}

    public WebElement street(){return driver.findElement(street);}

    public WebElement city(){return driver.findElement(city);}

    public WebElement state(){return driver.findElement(state);}

    public WebElement stateselection(){return driver.findElement(stateselection);}

    public WebElement zipCode(){return driver.findElement(zipCode);}

    public WebElement addAddress(){return driver.findElement(addAddress);}

    public String Alert(){
        String message=driver.findElement(alert).getText();
        return message;
    }
}
