package com.heck.wowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class FirefoxPlaywrightBrowser extends AbstractPlaywrightBrowser {
    public FirefoxPlaywrightBrowser() {
        this.browser = Playwright.create().firefox();
    }

    @Override
    protected BrowserName getBrowserName() {
        return BrowserName.FIREFOX;
    }

    @Override
    protected Browser launchBrowser() {
        return this.browser.launch(new BrowserType.LaunchOptions().setHeadless(isHeadless()));
    }
}

