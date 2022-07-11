package com.telran.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.beans.BeanProperty;

public class FirstSeleniumTest {
    WebDriver driver;
    //befor - setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("http://www.google.com");

    }
    @Test
    public void openGoogleTest(){
        System.out.println("Site opened!");

            }

     //       @Test
   // public void navigateTest(){
//go back
        //driver.navigate().back();
        // go forward
        //driver.navigate().forward();
        //refresh the page
       // driver.navigate().refresh();
            }
    //Test
    //after-tearDawn


