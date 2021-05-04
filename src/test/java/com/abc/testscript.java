package com.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
         /*
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("pankaj.parwe@gmail.com");


        driver.findElement(By.id("enterimg")).click();



        String titleafter = driver.getTitle();
        if (titleafter.equalsIgnoreCase("Register")) {
            System.out.println("test case is passed");
        }else{
                System.out.println("test case is failed");
            }
       */

        driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Pankaj");
        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Parwe");

       driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("amravati");
        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("pankaj.parwe@gmail.com");
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9890865105");
        driver.findElement(By.xpath("//input[@ng-model='radiovalue' and @value ='Male']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value ='Cricket']")).click();
    }
}
