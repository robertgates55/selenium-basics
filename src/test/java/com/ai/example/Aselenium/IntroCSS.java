package com.ai.example.Aselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntroCSS {

    public static void main(String[] args) {
        // Open Firefox
        WebDriver driver = new FirefoxDriver();

        // Navigate to bbc
        driver.get("http://bbc.co.uk");
        // Click Bottom iPlayer link!
        driver.findElement(By.cssSelector("#orb-aside .orb-nav-iplayer a")).click();


        // Navigate to bbc
        driver.get("http://bbc.co.uk");
        // Get text from top sports story
        String topStoryText = driver.findElement(By.cssSelector("section.hp-module--duo div.hp-top-stories--sport-palette div:first-child .top-story__content h3")).getText();
        // Print that text out!
        System.out.println(topStoryText);

        // Close the browser
        driver.quit();
    }

}
