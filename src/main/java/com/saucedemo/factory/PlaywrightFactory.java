package com.saucedemo.factory;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    public Page initBrowser(String deviceType) {
        playwright = Playwright.create();
        
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));

        if (deviceType.equalsIgnoreCase("mobile")) {
            // Configuración exacta de emulación para Google Pixel 5
            context = browser.newContext(new Browser.NewContextOptions()
                    .setUserAgent("Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36")
                    .setViewportSize(393, 851)
                    .setDeviceScaleFactor(2.75)
                    .setIsMobile(true)
                    .setHasTouch(true));
            
            System.out.println("--> Iniciando sesión en modo Mobile (Pixel 5)");
        } else {
            // Configuración Desktop por defecto
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1280, 720));
            System.out.println("--> Iniciando sesión en modo Desktop");
        }

        page = context.newPage();
        return page;
    }

    public void closeBrowser() {
        if (context != null) context.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}