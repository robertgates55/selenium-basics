package com.ai.example.CseleniumTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Example1 {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        // Open Firefox
        driver = new FirefoxDriver();
        // Set implicit wait to 5 seconds
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Create WebDriverWait instance
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testEmailFieldIsEnabled() {
        // Navigate to The Internet
        driver.get("http://the-internet.herokuapp.com/");
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

    @AfterMethod
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}
