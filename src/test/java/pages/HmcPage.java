package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public Actions hotelManagement;
    public Actions roomReservation;
    public Actions addRoom;
    public Actions idUser;
    public WebElement roomReservationText;
    public Actions okButton;

    public HmcPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement userName;


    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadi;



}