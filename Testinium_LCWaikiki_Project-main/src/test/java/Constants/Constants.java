package Constants;

import org.openqa.selenium.By;

//Constants kısmında ise sabitlerimizi tanımlayacağız.

public class Constants {
    public static String WEBSITE = "https://www.lcwaikiki.com/tr-TR/TR";
    public static By LOGIN_BUTTON = By.className("dropdown-label");
    public static By USER_CLICK = By.id("LoginEmail");
    public static By PASSWORD_CLICK = By.id("Password");
    public static By LOGIN_BUTTON_2 = By.cssSelector("input[name='email']");
    public static String USER = "testinium.lcwaikiki@gmail.com";
    public static String PASSWORD = "123456cem";
    public static String PRODUCT_SEARCH = "Pantolon";
    public static By SEARCH_PRODUCT_CLICK = By.id("search_input");
    public static By MORE_BUTTON = By.cssSelector("button.paginator__button");
    public static By SIZE = By.xpath("(//a[@data-tracking-label='BedenSecenekleri' and not(@class='disabled')])[1]");
    public static By HEIGHT = By.xpath("(//a[@data-tracking-label='BoySecenekleri' and not(@class='disabled')])[1]");
    public static By ELEMENT_LIST = By.cssSelector(".-product-card.productcard--one-of-4");
    public static By ADD_TO_CART = By.id("pd_add_to_cart");
    public static By GO_TO_CART = By.xpath("//i[@class='header-bag-icon bndl-shopping-bag bndl-shopping-bag-dims']");
    public static By ADD_MORE_PRODUCT = By.xpath("//a[@class='oq-up plus']");
    public static By DELETE_PRODUCT = By.xpath("//i[@class='fa fa-trash-o']");
    public static By DELETE_PRODUCT_2 = By.xpath("//a[@class='inverted-modal-button sc-delete ins-init-condition-tracking']");
}
