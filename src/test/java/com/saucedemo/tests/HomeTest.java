package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeTest extends BaseTest {

    @Test
    @DisplayName("TC01 - Verificar elementos principales en Desktop")
    public void testHomePageElementsDesktop() {
        page = playwrightFactory.initBrowser("desktop");
        homePage = new com.saucedemo.pages.HomePage(page);

        homePage.navigateToHomePage();
        
        assertTrue(homePage.getPageTitle().length() > 0, "El título no debería estar vacío");
        assertTrue(homePage.isSearchIconVisible(), "El ícono de búsqueda debería ser visible en Desktop");
        assertTrue(homePage.isCartIconVisible(), "El carrito debería ser visible en Desktop");
    }

    @Test
    @DisplayName("TC02 - Verificar elementos principales en Mobile (Pixel 5)")
    public void testHomePageElementsMobile() {
        page = playwrightFactory.initBrowser("mobile");
        homePage = new com.saucedemo.pages.HomePage(page);

        homePage.navigateToHomePage();

        assertTrue(homePage.getPageTitle().length() > 0, "El título no debería estar vacío en Mobile");
        assertTrue(homePage.isCartIconVisible(), "El carrito debería ser visible en la vista Mobile de Pixel 5");
    }
}