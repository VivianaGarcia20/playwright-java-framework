package com.saucedemo.factory;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    /**
     * Inicializa el navegador y contexto según el tipo de ejecución ("desktop" o "mobile")
     */
    public Page initPage(String isMobile) {
        playwright = Playwright.create();
        
        // Lanzamos el navegador Chromium en modo visible (headless = false)
        browser = playwright.chromium().launch(
            new BrowserType.LaunchOptions().setHeadless(false)
        );

        if ("true".equalsIgnoreCase(isMobile)) {
            // Emulación de dispositivo móvil (Pixel 5)
            context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(393, 851)
                    .setDeviceScaleFactor(2.75)
                    .setIsMobile(true)
                    .setHasTouch(true)
                    .setUserAgent("Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36")
            );
        } else {
            // Vista Desktop con pantalla completa
            context = browser.newContext(new Browser.NewContextOptions()
                    .setViewportSize(1920, 1080)
            );
        }

        page = context.newPage();
        return page;
    }

    public void closePage() {
        if (context != null) context.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}