package com.tetyanav.michaels.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends Page {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void navigateTo() throws InterruptedException {
        WebElement productButton = driver.findElement(By.className("products"));
        productButton.click();
    }

    public void navigateToCategory() throws InterruptedException {
        WebElement paperCraftButton = driver.findElement(By.cssSelector("#category-level-1 > li:nth-child(10) > a"));
        paperCraftButton.click();
        Thread.sleep(2000);
    }

    public void navigateToProduct() throws InterruptedException {
        WebElement recollectionsMemoryBoxChosing = driver.findElement(By.cssSelector("a[title='Recollections™ Memory Box']"));
        recollectionsMemoryBoxChosing.click();
    }

    public String getProductName() {
        WebElement productElement = driver.findElement(By.className("productname"));
        String productName = productElement.getText();
        return productName;
    }
    public void addToFavorites() throws InterruptedException {
        WebElement savetoMyFavouritesButton = driver.findElement(By.cssSelector("ul .addtoff"));
        savetoMyFavouritesButton.click();
    }

    public void addToMyPrintableList() throws InterruptedException {
        WebElement addToPrintableListButton = driver.findElement(By.cssSelector("ul .print-list"));
        addToPrintableListButton.click();
        WebElement closeButton = driver.findElement(By.cssSelector("#cboxClose"));
        closeButton.click();
    }
}
