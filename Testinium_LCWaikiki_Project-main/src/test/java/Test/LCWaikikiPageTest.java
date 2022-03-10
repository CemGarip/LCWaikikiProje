package Test;
import Base.BaseTest;
import Pages.LCWaikikiPage;
import org.junit.Before;
import org.junit.Test;
import static Constants.Constants.*;
//Burada LCWaikikiPage’imizden bilgileri alıp istediğimiz senaryoyla uygulayacağız.

public class LCWaikikiPageTest extends BaseTest {
    LCWaikikiPage lcWaikikiPage;  //Objemizi oluşturduk.
    @Before
    public void beforeTest(){
        lcWaikikiPage = new LCWaikikiPage(getDriver());
    }

    @Test
    public void login() throws InterruptedException { //Yapılacak işlemleri sırası ile yazıyoruz.
        lcWaikikiPage.goURL().assertURL(WEBSITE).login(USER, PASSWORD).goURL().searchProduct(PRODUCT_SEARCH)
                .waitTwosec().moreProduct().waitTwosec().randomClick().waitTwosec().selectSizeHeight().addToCart()
                .goToCart().waitTwosec().increaseProduct().waitTwosec()
                .deleteProduct().waitTwosec().deleteProduct2().waitTwosec();
    }

}



