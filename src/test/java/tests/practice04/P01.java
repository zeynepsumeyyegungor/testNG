package tests.practice04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 extends TestBaseBeforeMethodAfterMethod {

    // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
    // ikinci emojiye tıklayın (hayvan emojisini seçin)
    // tüm hayvan emojilerine tıklayın
    // formu doldurun (dilediğinizi yazabilirsiniz)
    // apply butonuna tıklayın


    @Test
    public void test() {
        // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // ikinci emojiye tıklayın (hayvan emojisini seçin)
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

        // tüm hayvan emojilerine tıklayın
        List<WebElement> animals = driver.findElements(By.xpath("//div[@class='mdl-tabs__panel is-active']//img"));

      //  for (WebElement each :animals) {
      //      each.click();
      //  }
        animals.forEach(t->t.click());

        driver.switchTo().defaultContent();

     // formu doldurun (dilediğinizi yazabilirsiniz)
        List<WebElement> boxes = driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));
        //formdaki 11 tane kutuyu bu list'e locate ettik

        //bu listi kullanarak her bir WebElement'i kolayca boxes listinde bulunan webelementlerimize gonderebilecegiz
        List<String> text = new ArrayList<>(Arrays.asList("bu","listi","kullanarak","her","bir","webelementi","kolayca","boxes","listine","bulunan","webelementine"));

        for (int i = 0; i < boxes.size(); i++) {
            boxes.get(i).sendKeys(text.get(i));
        }

        // apply butonuna tıklayın
        driver.findElement(By.xpath("//button[@id='send']")).click();
    }
}
