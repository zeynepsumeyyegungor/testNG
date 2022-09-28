package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_HardAssert extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01(){
        //amazon anasayfasina gidiniz
        driver.get("https://amazon.com");
        //title'in "Amazon" icerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        //arama kutusunnun erisilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
    }
}
