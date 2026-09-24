package com.saucedemo.pages;

import com.microsoft.playwright.Page;

public class HomePage {

    private final Page page;

    // Localizadores flexibles que abarcan las variantes de Shopify y SauceDemo
    private final String searchIcon = "a[href*='/search'], button[aria-label*='Search'], [class*='search']";
    private final String cartIcon = "a[href*='/cart'], [class*='cart'], #cart-icon-bubble";

    public HomePage(Page page) {
        this.page = page;
    }

    public void navigateToHomePage() {
        page.navigate("https://sauce-demo.myshopify.com/");
        page.waitForLoadState();
    }

    public String getPageTitle() {
        return page.title();
    }

    public boolean isSearchIconVisible() {
        return page.locator(searchIcon).first().isVisible();
    }

    public boolean isCartIconVisible() {
        return page.locator(cartIcon).first().isVisible();
    }
}