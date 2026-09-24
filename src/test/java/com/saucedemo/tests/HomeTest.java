package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeTest extends BaseTest {

    @Test
    @DisplayName("TC01 - Verificar elementos principales en la página de inicio (Desktop)")
    public void testHomePageElementsDesktop() {
        homePage.navigateToHomePage();

        String title = homePage.getPageTitle();
        System.out.println("Título verificado: " + title);

        assertTrue(title.length() > 0, "El título no debería estar vacío");
        assertTrue(homePage.isSearchIconVisible(), "El ícono de búsqueda debería ser visible");
        assertTrue(homePage.isCartIconVisible(), "El carrito de compras debería ser visible");
    }
}