package Minggu3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AllKeyWord {
    WebDriver driver = new ChromeDriver();

    public void login(String username, String password) {

        try {

            driver.get("https://www.saucedemo.com/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement usernameTxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//input[@id='user-name']")));
            usernameTxt.sendKeys(username);

            WebElement passwordTxt = driver.findElement(By.xpath("//div//input[@id='password']"));
            passwordTxt.sendKeys(password);

            WebElement loginBtn = driver.findElement(By.xpath("//div//input[@id='login-button']"));
            loginBtn.click();

            WebElement webLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header_label']//div[@class='app_logo' and contains(text(),'Swag Labs')]")));

        } catch (Exception e) {
            e.printStackTrace();
            driver.close();
        }
    }

    public void addToChart() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement addToChartBtn = driver.findElement(By.xpath("//div[@class='inventory_item_description']//button[contains(@id,'sauce-labs-backpack')]"));
        addToChartBtn.click();

        WebElement chartBtn = driver.findElement(By.xpath("//div[contains(@id,'shopping_cart')]//a"));
        chartBtn.click();
    }
}
