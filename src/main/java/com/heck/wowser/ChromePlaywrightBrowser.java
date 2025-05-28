package com.heck.wowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import lombok.var;

public class ChromePlaywrightBrowser extends AbstractPlaywrightBrowser {

    public ChromePlaywrightBrowser() {
        this.browser = Playwright.create();
    }

    @Override
    protected BrowserName getBrowserName() {
        return BrowserName.CHROME;
    }

    @Override
    protected Browser launchBrowser() {
        var launchoptions = new BrowserType.LaunchOptions()
                .setHeadless(isHeadless())
                .setChannel("chrome");

        return this.browser.chromium().launch(launchoptions);
    }
}

