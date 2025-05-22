package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;
    By email=By.id("input-email");
    By password=By.id("input-password");
    By loginButton=By.cssSelector("#content > div > div:nth-child(2) > div > form > input");


    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void EnterEmail(String Email)
    {
        driver.findElement(email).sendKeys(Email);
    }
    public void EnterPassword(String Pass)
    {
        driver.findElement(password).sendKeys(Pass);
    }
    public void clickLogin()
    {
        driver.findElement(loginButton).click();
    }

}
