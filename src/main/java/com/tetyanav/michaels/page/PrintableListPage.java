package com.tetyanav.michaels.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintableListPage extends Page {
    public PrintableListPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {
        WebElement productElement = driver.findElement(By.cssSelector(".printable-list-container div:nth-child(2) a"));
        String productName = productElement.getText();
        return productName;
    }

  }