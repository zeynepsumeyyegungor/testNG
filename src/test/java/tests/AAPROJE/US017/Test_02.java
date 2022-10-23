/*
package tests.AAPROJE.US017;


import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.ZeynepAlloverPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Test_02 extends TestBaseRapor {
    ZeynepAlloverPage zeynepAlloverPage = new ZeynepAlloverPage();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    //Vendor olarak giriş yap.
    //"Sign In" butonuna tıkla.
    //"Sign Out"a tıkla.
    //"Store Manager"e Tıkla.
    //"Customer"a Tıkla.
    //"Add New"e Tıkla.
    //"Same as Shipping" butonu işaretlenmediğini kontrol et.
    //"Shipping" Address'teki bilgiler "Billing" adresinden farklı ekleniyor mu test et.
    //"Submit" butonuna çalışıyor mu diye test et.
    //Browserı kapat

    @Test
    public void customerPage() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
        zeynepAlloverPage.signIn.click();
        zeynepAlloverPage.emailTextBox.sendKeys(ConfigReader.getProperty("alloverEmail"));
        zeynepAlloverPage.passwordTextBox.sendKeys(ConfigReader.getProperty("alloverPass"));
        zeynepAlloverPage.signIn2.click();
        zeynepAlloverPage.singOut.click();
        zeynepAlloverPage.storeManager.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.moveToElement(zeynepAlloverPage.customers).click().perform();
        Thread.sleep(1000);
    }

    @Test (dependsOnMethods = "customerPage")
    public void tc_01() throws InterruptedException {
        //"Add New" butonuna tıklanmalı.
        zeynepAlloverPage.customerAddNew.click();

        //"Same as Shipping" butonu işaretlenmediğini kontrol et.
        if (zeynepAlloverPage.sameAsBillingClick.isSelected()) {
            zeynepAlloverPage.sameAsBillingClick.click();
        }
        zeynepAlloverPage.shippingFirstName.sendKeys(faker.name().firstName());
    }
}
*/