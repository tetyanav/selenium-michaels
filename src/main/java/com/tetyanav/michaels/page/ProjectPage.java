package com.tetyanav.michaels.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage extends Page {
    public ProjectPage(WebDriver driver) { super(driver); }

    public void navigateTo() throws InterruptedException {
        WebElement myProjectsButton = driver.findElement(By.cssSelector("li.projects.submenu"));
        myProjectsButton.click();
    }
    public void navigateToProject() throws InterruptedException {
        WebElement bakingCraftsButton = driver.findElement(By.cssSelector("a[title=\"Baking Crafts\"]"));
        bakingCraftsButton.click();

        WebElement easterCategory = driver.findElement(By.cssSelector("a[title=\"Easter\"]"));
        easterCategory.click();

        WebElement secondPage = driver.findElement(By.cssSelector("div.pager > ul > li:nth-child(2) > a"));
        secondPage.click();

        Thread.sleep(2000);

        WebElement bunnyEarsCupcakeChosing = driver.findElement(By.cssSelector(".product:nth-child(1) h4 a"));
        bunnyEarsCupcakeChosing.click();
    }

    public void addToFavorites() throws InterruptedException {
        WebElement savetoMyFavouritesButton = driver.findElement(By.cssSelector("ul .addtoff"));
        savetoMyFavouritesButton.click();
    }
}

