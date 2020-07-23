package com.certificacion.prueba;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Automation {

    private WebDriver driver;

    By linkTest = By.xpath("//*[text()='Link Test']");
    By linkByContent = By.linkText("linkByContent");
    By back = By.linkText("Back");
    By linkByHtml = By.linkText("linkByHtml");

    By selects = By.linkText("Select Test");
    By iframe = By.linkText("IFrames Test");
    By clicks = By.linkText("Clicks Page");

    By alerts = By.linkText("Alert Test");
    By promptTest = By.linkText("Prompt Page");
    By scroll  = By.linkText("Form Test");



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

    @Test
    public void Iframes ()  {

        driver.findElement(iframe).click();
        /// FALTA

    }

    @Test
    public void Clicks  ()  {

        driver.findElement(clicks).click();

        driver.findElement(By.xpath("//input[@value='click me']")).click();
        driver.findElement(By.xpath("//input[@value='dbl click me']")).click();
        driver.findElement(By.xpath("//input[@value='right click me']")).click();

    }

    @Test
    public void Alerts  ()  {

        driver.findElement(alerts).click();

        driver.findElement(By.xpath("//input[@value='Click For Alert']")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//input[@value='Click For Multiline Alert']")).click();
        driver.switchTo().alert().accept();


    }


    @Test
    public void PromptTest ()  {

        driver.findElement(promptTest).click();

        driver.findElement(By.name("b1")).click();
        driver.switchTo().alert().sendKeys("Hola Mundo!");
        driver.switchTo().alert().accept();

        driver.findElement(By.name("b1")).click();
        Alert alert = driver.switchTo().alert();
        String mensajeAlerta = alert.getText();
        System.out.println(mensajeAlerta);
        alert.accept();

    }

    @Test
    public void NuevaPestana ()  {


        //////FALTA

    }

    @Test
    public void VentanasEmergentes ()  {

       // FALTA
    }


    @Test
    public void MoverScroll  ()  {

        driver.findElement(scroll).click();
        driver.switchTo().alert().accept();
        JavascriptExecutor ScrollBy = (JavascriptExecutor) driver;

        ScrollBy.executeScript("window.scrollBy(0,1000)");

        JavascriptExecutor ScrollBy2 = (JavascriptExecutor) driver;

        ScrollBy2.executeScript("window.scrollBy(1000,0)");

    }


}
