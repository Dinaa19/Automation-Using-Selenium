package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationUsingTestNGClasses {
    public static void main(String[] args)
    {   //REGISTER WITH VALID DATA
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement Register = driver.findElement(By.className("ico-register"));
        Register.click();
        WebElement female = driver.findElement(By.id("gender-female"));
        female.click();
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("Dina");
        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("ElRefaai");

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        Select select1 = new Select(day);
        select1.selectByValue("19");
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        Select select2 = new Select(month);
        select2.selectByValue("5");
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Select select3 = new Select(year);
        select3.selectByValue("2001");

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("dina_elrefaai@hotmail.com");

        WebElement company = driver.findElement(By.id("Company"));
        company.sendKeys("PCS");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Dinaashraf195$$");

        WebElement Cpassword = driver.findElement(By.id("ConfirmPassword"));
        Cpassword.sendKeys("Dinaashraf195$$");

        WebElement rbottom = driver.findElement(By.id("register-button"));
        rbottom.click();

        // LOGIN WITH THE VALID REGISTERATION DATA

        WebElement login = driver.findElement(By.className("ico-login"));
        login.click();

        WebElement email2 = driver.findElement(By.id("Email"));
        email2.sendKeys("dina_elrefaai@hotmail.com");

        WebElement password2 = driver.findElement(By.id("Password"));
        password2.sendKeys("Dinaashraf195$$");

        WebElement rememberme = driver.findElement(By.id("RememberMe"));
        rememberme.click();

        WebElement login1 = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        login1.click();

        //USER RESET HIS PASSWORD SUCCESSFULLY

        WebElement logout= driver.findElement(By.className("ico-logout"));
        logout.click();

        WebElement login2 = driver.findElement(By.className("ico-login"));
        login2.click();

        WebElement forgotme = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a"));
        forgotme.click();

        WebElement emailrec = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        emailrec.sendKeys("dina_elrefaai@hotmail.com");

        WebElement recover = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button"));
        recover.click();

        WebElement search = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        search.sendKeys("laptop");
        search.click();







    }
}
