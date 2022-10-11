package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExercisePage {

    public AutomationExercisePage(){ //önce const olusturuyoruz, class ismi ile aynı, public yapıyoruz, cunku diğer classlardan ulasacağız

        PageFactory.initElements(Driver.getDriver(),this);
        //pagefactoryden initElements ile, driver classındaki driver methodunu this ile cağırıyoruz, yani bu methodu kullan diyoruz.
    }
    @FindBy (xpath="//*[@class='fa fa-lock']")
    public WebElement signUp;

    @FindBy (xpath="(//*[@name='email'])[2]")
    public WebElement newUserEmail;

    @FindBy (xpath="(//*[@class='btn btn-default'])[2]")
    public WebElement newUserSingUp;

    @FindBy (xpath="//*[@id='id_gender2']")
    public WebElement genderMRS;

    @FindBy (xpath="//*[@class='btn btn-primary']")
    public WebElement newUserContinue;

    @FindBy (xpath = "//*[@href='/logout']")
    public WebElement logOutButton;

    @FindBy (xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement addtoCartMove;

    @FindBy (xpath = "//*[text()='View Cart']")
    public WebElement viewCart;
    @FindBy (xpath = "//*[text()='Proceed To Checkout']")
    public WebElement sepetGorunumu;

    @FindBy (xpath = "(//*[@class='btn btn-default add-to-cart'])[7]")
    public WebElement prductFour;


    @FindBy (xpath = "//*[@id='google_esf']")
    public WebElement iframe;


    @FindBy (xpath="//*[text()=' Products']")
    public WebElement product;

    @FindBy (xpath="(//*[@class='address_address1 address_address2'])[2]")
    public WebElement DeliveryAdress;

    @FindBy (xpath="(//*[@class='address_address1 address_address2'])[5]")
    public WebElement BillingAddress;

    @FindBy(xpath="//*[text()='All Products']")
    public WebElement allProducts;

    @FindBy(xpath="(//input[@id='search_product'])[1]")
    public WebElement searchProduct;

    @FindBy(xpath="(//button[@id='submit_search'])[1]")
    public WebElement submitSearch;

    @FindBy(xpath="//*[text()='Searched Products']")
    public WebElement searchedProducts;

    @FindBy(xpath="//h2[3]']")
    public WebElement blueTopView;

    @FindBy (linkText = "View Product")
    public WebElement viewProduct;

    @FindBy (xpath = "//div[@class='product-image-wrapper']")
    public List<WebElement> searchedProductList;


    @FindBy (xpath="(//*[@style='color: brown;'])[1]")
    public WebElement View;

    @FindBy (xpath="//*[text()='Write Your Review']")
    public WebElement ilkUrun;

    @FindBy (xpath="//*[@type='text']")
    public WebElement name;

    @FindBy (xpath="//*[@type='email']")
    public WebElement email;

    @FindBy (xpath="//*[@name='review']")
    public WebElement review;

    @FindBy (id="button-review")
    public WebElement submit;

    @FindBy (xpath="//iframe")
    public WebElement iframe1;

    @FindBy (xpath="//*[@class='grippy-host']")
    public WebElement cc;

    @FindBy (xpath="//*[text()='Thank you for your review.']")
    public WebElement thankYou;
}