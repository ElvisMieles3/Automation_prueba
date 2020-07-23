package com.certificacion.prueba;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Automation {

    private WebDriver driver;

    By linkTest = By.xpath("//*[text()='Link Test']");
    By linkByContent = By.linkText("linkByContent");
    By back = By.linkText("Back");
    By linkByHtml = By.linkText("linkByHtml");

    By selects = By.linkText("Select Test");

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chromedriver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://sahitest.com/demo");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void metodoLinkTest()  {

        driver.findElement(linkTest).click();
        driver.findElement(linkByContent).click();
        driver.findElement(back).click();
        driver.findElement(linkByHtml).click();

    }
    @Test
    public void Selects () {
        driver.findElement(selects).click();
        Select s1Id =  new Select (driver.findElement(By.id("s1Id")));
        s1Id.selectByVisibleText("o1");


        Select s2Id =  new Select (driver.findElement(By.id("s2Id")));
        s2Id.selectByVisibleText("o2");


        Select s3Id =  new Select (driver.findElement(By.id("s3Id")));
        s3Id.selectByVisibleText("o1");
        s1Id.selectByIndex(1);

        Select s4Id =  new Select (driver.findElement(By.id("s4Id")));
       s4Id.deselectByIndex(1);

        Select s1 =  new Select (driver.findElement(By.id("s1")));
        s1.selectByVisibleText("Business Phone");
        
    }
}
