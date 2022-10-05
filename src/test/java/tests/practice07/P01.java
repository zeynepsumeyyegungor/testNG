package tests.practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {

// http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
//Tüm yapılacakların üzerini çiz.
//Tüm yapılacakları sil.
//Tüm yapılacakların silindiğini doğrulayın.


    @Test
    public void test01() throws InterruptedException {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        //Tüm yapılacakların üzerini çiz.
        //Tüm yapılacakları sil.
        //Tüm yapılacakların silindiğini doğrulayın.

        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversityPage webUniversityPage = new WebUniversityPage();
        List<String> workList = new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka","Bebekle ilgilen","Çocuğun ödevine yardım et","Selenyum çalış","Uyu"));
        Actions actions = new Actions(Driver.getDriver());
        for (String each : workList) {
            actions.click(webUniversityPage.adNewTodo).sendKeys(each).sendKeys(Keys.ENTER).perform();
        }
        Thread.sleep(1500);

        //Tüm yapılacakların üzerini çiz.
        List<WebElement> drawButtons = webUniversityPage.drawButtons;
        for (WebElement each : drawButtons) {
            each.click();
        }
        Thread.sleep(1500);
        //Tum yapilacaklari sil
        List<WebElement>deleteButtons=webUniversityPage.deleteButtonsWebelement;

        for (WebElement each :deleteButtons ) {
            each.click();
        }
        //Tüm yapılacakların silindiğini doğrulayın.
        List<WebElement> newtodos = webUniversityPage.newtodosWebelement;
        Assert.assertEquals(0,newtodos.size());

    }
}