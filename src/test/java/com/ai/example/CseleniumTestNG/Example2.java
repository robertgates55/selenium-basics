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

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Example2 extends BaseTest {

    // private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void testBBCTopSportsStoryName() {
        // Navigate to bbc
        driver.get("http://bbc.co.uk");
        // Click Bottom iPlayer link!
        driver.findElement(By.cssSelector("#orb-aside .orb-nav-iplayer a")).click();

        // Navigate to bbc
        driver.get("http://bbc.co.uk");
        // Get text from top sports story
        String topStoryText = driver.findElement(By.cssSelector("section.hp-module--duo div.hp-top-stories--sport-palette div:first-child .top-story__content h3")).getText();

        // Assert the top story text is what we expected
        assertEquals(topStoryText, "LiveSportsday - rolling football news");
    }

}
