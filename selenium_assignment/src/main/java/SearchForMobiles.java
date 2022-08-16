import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchForMobiles {

    WebDriver driver;

    public SearchForMobiles(WebDriver driver){
        this.driver=driver;
    }

    By search=By.xpath("//input[@id='twotabsearchtextbox']");

    By lastElement=By.xpath("(//div[@class=\"sg-col-inner\"])[116]");

//    By selectFirstItem=By.xpath("(//div[@class=\"s-product-image-container aok-relative s-image-overlay-grey s-text-center s-padding-left-small s-padding-right-small s-flex-expand-height\"])[1]");
//
//    By priceValue=By.xpath("(//span[@class=\"a-price-whole\"])[5]");
//
//    By addToCart=By.xpath("//input[@id=\"add-to-cart-button\"]");
//
//
//    By goToCart=By.xpath("//span[@id='sw-gtc']");
//
//    By quantity=By.xpath("//span[@class='a-button-text a-declarative']");
//
//    By clickOneMore=By.xpath("//a[@id='quantity_2']");
//
//    By totalPrice=By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]");

//    public WebElement selectFirstItem(){return driver.findElement(selectFirstItem);}
//
//    public WebElement addToCart(){return driver.findElement(addToCart);}
//
//    public WebElement goToCart(){return driver.findElement(goToCart);}
//
//    public WebElement quantity(){return driver.findElement(quantity);}
//
    //public WebElement lastElement(){return driver.findElement(lastElement);}

    public void searching(){
        WebElement e = driver.findElement(search);
        e.sendKeys("Mobiles");
        e.sendKeys(Keys.ENTER);
    }
    public String lastElement(){
        String s = driver.findElement(lastElement).getText();
        return s;

    }

//    public String getPrice(){
//        String price = driver.findElement(priceValue).getText();
//        return price;
//    }
////    public void increaseQuantity(){
////        WebElement element = driver.findElement(addOneMore);
////        Select select = new Select(element);
////        select.selectByIndex(2);
////    }
//    public String totalPrice(){
//        String s = driver.findElement(totalPrice).getText();
//        return s;
//    }
}
