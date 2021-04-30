package com.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Index.html");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("pankaj.parwe@gmail.com");


        driver.findElement(By.id("enterimg")).click();


        String titleafter = driver.getTitle();
        if (titleafter.equalsIgnoreCase("Register")) {
            System.out.println("test case is passed");
        }else{
                System.out.println("test case is failed");
            }
        


    }

}
