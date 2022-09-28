package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utilities.Driver;

import java.awt.dnd.DragGestureEvent;

public class C05_AmazonPageClass {
    @Test

    public void test01() {
        AmazonPages amazonPage = new AmazonPages();
        Driver.getDriver().get("https://amazon.com");
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }
}
