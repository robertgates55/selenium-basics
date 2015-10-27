package com.ai.example.CseleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class Example2 extends BaseTest {

    // private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void testEmailFieldIsEnabled() {
        // Navigate to The Internet
        driver.get("http://the-internet.herokuapp.com/");
        // Create wait
        WebDriverWait wait = new WebDriverWait(driver,10);
        // Wait for the Forgot Password link
        WebElement forgotPasswordLink = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.linkText("Forgot Password")));
        // Click Forgot Password link
        forgotPasswordLink.click();
        // Wait for the Email field
        WebElement emailField = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.id("email")));
        // Assert the Email field is enabled
        assertTrue(emailField.isEnabled(), "Email field should be enabled");
    }

}
