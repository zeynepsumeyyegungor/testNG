package tests.practice05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P01 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void testName() {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ali");

        //fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yıldız");

        //check the gender
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();

        //check the experience
        driver.findElement(By.xpath("//input[@id='exp-2']")).click();

        //fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("28-09-2022");

        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession']")).click();

        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();

        //choose your continent -> Antartica
        WebElement dropdownContinent = driver.findElement(By.xpath("//input[@id='id=continents']"));
        Select select = new Select(dropdownContinent);
        select.deselectByVisibleText("Antartica");

        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//input[@id='selenium_commands']/option[1]")).click();

        //click submit button
        driver.findElement(By.xpath("//input[@id='submit")).click();
    }
}
