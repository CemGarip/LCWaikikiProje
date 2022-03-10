package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

//BasePage’de sürekli kullandığımız fonksiyonlar daha kısa, anlaşılır hale getiriyoruz.

public class BasePage extends BaseTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    public BasePage(WebDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver,60);
    }
    public void goUrl(String url){ //Websitesi'nin text kısmı String ifadeyle belirtiyoruz.
        driver.get(url);
    }
    public String currentUrl(){ //Websitesi'nde olup olmadığımız kontrol ediyoruz.
        return driver.getCurrentUrl();
    }
    public void pressEnter(By by){ // Aratma işlemini Enter komutu ile sağlayan By class kullanılarak fonksiyon oluşturuyoruz.
        driver.findElement(by).sendKeys(Keys.ENTER);
    }

    public WebElement findElement(By by){ //Element bulma fonksiyonu oluşturuyoruz.
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by)); // WebDriverWait ile element varlığı kontrol edilip işlem uygulanıyor.
        return driver.findElement(by);
    }

    public void click(By by){ //Tıklama fonksiyonu oluşturuyoruz.
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by)); // WebDriverWait ile element tıklanılabilirliği kontrol edilip işlem uygulanıyor.
        findElement(by).click();
    }
    public void sendKeys(By by,String text){//İstenilen text'i yazdırma fonksiyonunu oluşturuyoruz.
        findElement(by).clear();
        findElement(by).sendKeys(text);
    }
    public List<WebElement> listElements(By by) { //Rastgele seçim için Liste oluşturuyoruz.
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        return driver.findElements(by);
    }
    public void scrollToElement(By by) { // Element görünenene kadar scroll fonksiyonunu oluşturuyoruz.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", findElement(by));
    }

}






