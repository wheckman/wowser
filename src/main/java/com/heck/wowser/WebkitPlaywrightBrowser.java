package com.heck.wowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import lombok.var;

public class WebkitPlaywrightBrowser extends AbstractPlaywrightBrowser {
    public WebkitPlaywrightBrowser() {
        this.browser = Playwright.create();
    }

    @Override
    protected BrowserName getBrowserName() {
        return BrowserName.WEBKIT;
    }

    @Override
    protected BrowserContext launchBrowser() {
        var launchoptions = new BrowserType.LaunchOptions()
                .setHeadless(isHeadless());

        return this.browser.webkit().launch(launchoptions).newContext(getGeneralBrowserOptions());
    }
}

