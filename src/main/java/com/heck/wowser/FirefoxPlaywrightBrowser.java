package com.heck.wowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import lombok.var;

public class FirefoxPlaywrightBrowser extends AbstractPlaywrightBrowser {
    public FirefoxPlaywrightBrowser() {
        this.browser = Playwright.create();
    }

    @Override
    protected BrowserName getBrowserName() {
        return BrowserName.FIREFOX;
    }

    @Override
    protected Browser launchBrowser() {
        var launchoptions = new BrowserType.LaunchOptions()
                .setHeadless(isHeadless())
                .setChannel("firefox");

        return this.browser.firefox().launch(launchoptions);
    }
}

