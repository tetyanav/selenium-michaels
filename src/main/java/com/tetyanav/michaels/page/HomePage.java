package com.tetyanav.michaels.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateTo() throws InterruptedException {
        driver.get("http://www.canada.michaels.com");

        Thread.sleep(2000);

        WebElement closeButton = driver.findElement(By.cssSelector("#cboxContent > #cboxClose"));
        closeButton.click();

        Thread.sleep(1000);
    }
}
