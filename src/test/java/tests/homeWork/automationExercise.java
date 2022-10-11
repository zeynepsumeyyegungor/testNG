package tests.homeWork;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class automationExercise {
        /*
     1. Tarayıcıyı başlatın
     2. 'http://automationexercise.com' url'sine gidin
     3. 'Ürünler' düğmesine tıklayın
     4. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
     5. 'Ürünü Görüntüle' düğmesine tıklayın
     6. 'Yorumunuzu Yazın'ın görünür olduğunu doğrulayın
     7. Adı, e-posta adresini ve incelemeyi girin
     8. 'Gönder' düğmesini tıklayın
     9. 'İncelemeniz için teşekkür ederiz' başarı mesajını doğrulayın.
      */


    @Test
    public void test01() {

    //2. 'http://automationexercise.com' url'sine gidin
        AutomationExercisePage automationExercisePage = new AutomationExercisePage();
        Driver.getDriver().get(ConfigReader.getProperty("autoE"));

    //3. 'Ürünler' düğmesine tıklayın
        automationExercisePage.product.click();

    //4. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(automationExercisePage.allProducts.isDisplayed());

    //5. 'Ürünü Görüntüle' düğmesine tıklayın
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(automationExercisePage.View).perform();
        automationExercisePage.View.click();
    //6. 'Yorumunuzu Yazın'ın görünür olduğunu doğrulayın
        Assert.assertTrue(automationExercisePage.ilkUrun.isDisplayed());

    //7. Adı, e-posta adresini ve yorumunuzu girin
        automationExercisePage.name.sendKeys(ConfigReader.getProperty("auname"));
        automationExercisePage.email.sendKeys(ConfigReader.getProperty("auemail"));
        automationExercisePage.review.sendKeys("Hersey cok guzel");

    //8. 'Gönder' düğmesini tıklayın
        automationExercisePage.submit.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    //9. 'İncelemeniz için teşekkür ederiz' başarı mesajını doğrulayın.
       Assert.assertTrue(automationExercisePage.thankYou.isDisplayed());


    }
}
