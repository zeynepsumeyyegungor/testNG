package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeAfter {
    // abstract bu class'dan başka bir yerden bir obje oluşturulmaması için konulur.
    protected WebDriver driver;
    protected String tarih;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formater =DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih = date.format(formater);
    }
    @After
    public void tearDown() throws InterruptedException {
       // driver.close();
    }
}