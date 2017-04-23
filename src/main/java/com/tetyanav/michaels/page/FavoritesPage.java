package com.tetyanav.michaels.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mailf on 3/18/2017.
 */
public class FavoritesPage extends Page {
    public FavoritesPage(WebDriver driver) {
        super(driver);
    }

    public int getProductCount() {
        List<WebElement> favoriteProducts = driver.findElements(By.cssSelector("div.favoriteblock:nth-child(3) li"));
        int productCount = favoriteProducts.size();
        return productCount;
    }

    public String getProductName() {
        WebElement favoriteProduct = driver.findElement(By.cssSelector("form > div:nth-child(3) > ul > li:nth-child(2) > a:nth-child(2)"));
        String favoriteProductName = favoriteProduct.getText();
        return favoriteProductName;
    }

    public String getProjectName() {
        WebElement projectElement = driver.findElement(By.cssSelector(".top-right form div:nth-child(1) ul > li > a:nth-child(1)"));
        String projectName = projectElement.getText();
        return projectName;
    }

    }
