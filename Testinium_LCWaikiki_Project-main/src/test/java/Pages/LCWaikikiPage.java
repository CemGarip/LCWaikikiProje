package Pages;

import Base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import static Constants.Constants.*;
//Constants class’ın içine yazdıklarımızı başka bir class içinde kullanmak için import ediyoruz.
//LCWaikikiPage’de Base ve Constants’tan gelenleri birleştiriyoruz ve bunlarla işlerimizi methodlara döküyoruz.(Birleştirici)

import java.util.Random;

public class LCWaikikiPage extends BasePage { //Base Page bağlantısını sağlıyoruz.
    public LCWaikikiPage(WebDriver driver){
        super(driver);
    }

    private static final Logger logger = LogManager.getLogger(LCWaikikiPage.class);
    public LCWaikikiPage goURL(){
        logger.info("Sayfa Açılıyor.");
        goUrl(WEBSITE);
        return this;

    }

    public LCWaikikiPage assertURL(String link){
        logger.info("Sayfa Kontrol Ediliyor.");
        Assert.assertEquals(WEBSITE,currentUrl());
        return this;
    }

    public LCWaikikiPage login(String username, String password) {
        logger.info("Sayfaya Giriş Yapılıyor.");
        click(LOGIN_BUTTON);
        sendKeys(USER_CLICK,username);
        sendKeys(PASSWORD_CLICK,password);
        click(LOGIN_BUTTON_2);
        return this;
    }

    public LCWaikikiPage searchProduct(String product) {
        logger.info("Ürün Aranıyor.");
        sendKeys(SEARCH_PRODUCT_CLICK,product);
        pressEnter(SEARCH_PRODUCT_CLICK);
        return this;
    }

    public LCWaikikiPage waitTwosec() throws InterruptedException {
        logger.info("Sayfanın Yüklenmesi Bekleniyor.");
        Thread.sleep(2000);
        return this;
    }
    public LCWaikikiPage moreProduct()  {
        logger.info("Daha Fazla Ürün Görüntüleniyor.");
        scrollToElement(MORE_BUTTON);
        click(MORE_BUTTON);
        return this;

    }
    public LCWaikikiPage selectSizeHeight() throws InterruptedException {
        click(SIZE); //Ürün seçimi yapılırken beden sonrası boy seçimi gerektiğinden ayrı 2 tıklatma işlemi yaptırıyoruz.
        waitTwosec();
        click(HEIGHT);
        return this;
    }

    public LCWaikikiPage randomClick() throws InterruptedException {
        logger.info("Rastgele Ürün Seçiliyor.");
        Random random = new Random();
        listElements(ELEMENT_LIST).get(random.nextInt(listElements(ELEMENT_LIST).size())).click();
        return this;
    }

    public LCWaikikiPage addToCart(){
        logger.info("Sepete Ekleniyor.");
        click(ADD_TO_CART);
        return this;
    }
    public LCWaikikiPage goToCart(){
        logger.info("Sepete Gidiliyor.");
        click(GO_TO_CART);
        return this;
    }
    public LCWaikikiPage increaseProduct(){
        logger.info("Ürün Sayısı Arttırılıyor.");
        click(ADD_MORE_PRODUCT);
        return this;
    }
    public LCWaikikiPage deleteProduct(){
        logger.info("Ürünler Siliniyor.");
        click(DELETE_PRODUCT);
        return this;
    }
    public LCWaikikiPage deleteProduct2(){
        logger.info("Ürünler Siliniyor.(2)");
        click(DELETE_PRODUCT_2);
        return this;
    }



}
