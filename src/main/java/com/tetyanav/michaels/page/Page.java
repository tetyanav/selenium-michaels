package com.tetyanav.michaels.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
    protected WebDriver driver;

    public Page(WebDriver d) {
        this.driver = d;
    }

    public void login() {
        WebElement signInLink = driver.findElement(By.cssSelector("a[title='Sign In']"));
        signInLink.click();
        //refactor-> Rename = Shift+F6
        WebElement loginInput = driver.findElement(By.id("dwfrm_login_username"));
        loginInput.sendKeys("testingtanya@yahoo.com");

        WebElement passwordInput = driver.findElement(By.id("dwfrm_login_password"));
        passwordInput.sendKeys("Ternopil_9");

        WebElement submitButton = driver.findElement(By.cssSelector(".formactions > .sign-in"));
        submitButton.click();
    }

    public void logout() {
        WebElement logoutButton = driver.findElement(By.className("usernot"));
        logoutButton.click();
    }

    public String getUsername() {
        WebElement usernameElement = driver.findElement(By.className("username"));
        String username = usernameElement.getText();
        return username;
    }

    public String getSignInText() {
        WebElement loginElement = driver.findElement(By.cssSelector("a[title='Sign In']"));
        String username = loginElement.getText();
        return username;
    }

    public void navigateToMyFavorite () throws InterruptedException {
        WebElement myFavouriteButton = driver.findElement(By.cssSelector("ul > li:nth-child(5) > a:nth-child(2)"));
        myFavouriteButton.click();
    }
    public void navigateToMyPrintableList () throws InterruptedException {
        WebElement myPrintableListButton = driver.findElement(By.className("printablelistglobal"));
        myPrintableListButton.click();
    }

}

