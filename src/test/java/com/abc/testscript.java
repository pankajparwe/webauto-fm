package com.abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class testscript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*


        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pankaj.parwe@gmail.com");
        driver.findElement(By.xpath("//img[@id='enterimg']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);




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

        //langauges
        WebElement lanListElement = driver.findElement(By.id("msdd"));
       Select lanmultiselect = new Select(lanListElement);

        lanmultiselect.selectByVisibleText("Hindi");




        //skills dropdown
        WebElement SkillsLIstElement = driver.findElement(By.id("Skills"));
        Select SkillsDropdown = new Select(SkillsLIstElement);
        SkillsDropdown.selectByVisibleText("Adobe Photoshop");


        //country
        WebElement countryList = driver.findElement(By.id("countries"));
        Select countrydropdown = new Select(countryList);
        countrydropdown.selectByVisibleText("India");

        //select country
        WebElement selectcountrylist = driver.findElement(By.id("select2-country-container"));
        Select selectcountryelement = new Select(selectcountrylist);
        selectcountryelement.selectByVisibleText("India");






        //year
        WebElement YearListElement = driver.findElement(By.id("yearbox"));
        Select YearboxDropdowwn = new Select(YearListElement);
        YearboxDropdowwn.selectByVisibleText("1919");



        //month
        WebElement MonthLestElement = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
        Select MonthDropdown = new Select(MonthLestElement);
        MonthDropdown.selectByVisibleText("February");

        //day
        WebElement DayListElement = driver.findElement(By.id("daybox"));
        Select DayDropdown = new Select(DayListElement);
        DayDropdown.selectByVisibleText("4");







        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Pankaj@1234");
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Pankaj@1234");
        driver.quit();



    }
}
