package com.heck.wowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class WebkitPlaywrightBrowser extends AbstractPlaywrightBrowser {
    public WebkitPlaywrightBrowser() {
        this.browser = Playwright.create().webkit();
    }

    @Override
    protected BrowserName getBrowserName() {
        return BrowserName.WEBKIT;
    }

    @Override
    protected Browser launchBrowser() {
        return this.browser.launch(new BrowserType.LaunchOptions().setHeadless(isHeadless()));
    }
}

