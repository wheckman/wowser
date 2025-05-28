package com.heck.wowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class ChromePlaywrightBrowser extends AbstractPlaywrightBrowser {

    public ChromePlaywrightBrowser() {
        this.browser = Playwright.create().chromium();
    }

    @Override
    protected BrowserName getBrowserName() {
        return BrowserName.CHROME;
    }

    @Override
    protected Browser launchBrowser() {
        return this.browser.launch(new BrowserType.LaunchOptions().setHeadless(isHeadless()));
    }
}

