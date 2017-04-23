package com.tetyanav.michaels;

import com.tetyanav.michaels.page.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class MichaelsTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanch\\Development\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();
        homePage.login();
        assertEquals("Hello Tanya", homePage.getUsername());
    }

    @Test
    public void testLogout() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();
        homePage.login();
        homePage.logout();

        assertEquals("Sign In", homePage.getSignInText());
    }

    @Test
    public void testCorrectItem() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();
        homePage.login();

        ProductPage productPage = new ProductPage(driver);
        productPage.navigateTo();
        productPage.navigateToCategory();
        productPage.navigateToProduct();
        assertEquals("RECOLLECTIONS™ MEMORY BOX", productPage.getProductName());
    }

    @Test
    public void testMyFavorites() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();
        homePage.login();

        ProductPage productPage = new ProductPage(driver);
        productPage.navigateTo();
        productPage.navigateToCategory();
        productPage.navigateToProduct();
        productPage.addToFavorites();

        homePage.navigateToMyFavorite();

        FavoritesPage favoritesPage = new FavoritesPage(driver);
        assertEquals("Recollections™ Memory Box", favoritesPage.getProductName());
    }

    @Test
    public void testMyPrintableList() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();
        homePage.login();

        ProductPage productPage = new ProductPage(driver);
        productPage.navigateTo();
        productPage.navigateToCategory();
        productPage.navigateToProduct();
        productPage.addToMyPrintableList();
        productPage.navigateToMyPrintableList();

        PrintableListPage printableListPage = new PrintableListPage(driver);
        assertEquals("Recollections™ Memory Box", printableListPage.getProductName());
    }

    @Test
    public void testProjectInMyFavorites() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();
        homePage.login();

        ProjectPage projectPage = new ProjectPage(driver);
        projectPage.navigateTo();
        projectPage.navigateToProject();
        projectPage.addToFavorites();

        homePage.navigateToMyFavorite();

        FavoritesPage favoritesPage = new FavoritesPage(driver);
        assertEquals("Bunny Ears Cupcakes", favoritesPage.getProjectName());
    }
}