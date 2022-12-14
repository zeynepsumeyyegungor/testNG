package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReasubleMethod {
    @Test
    public void test01() throws IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //Ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");
        //Sayfayı kapatınız
        Driver.closeDriver();
    }
    @Test
    public void test02() throws IOException {
        //Amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPages amznPage = new AmazonPages();
        //Nutella aratınız
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuc yazısı Webelementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("AramaSonucWE", amznPage.aramaSonucWE);
        Driver.closeDriver();
    }
}
