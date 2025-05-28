package com.heck.wowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractPlaywrightBrowser {
    @Getter
    @Setter
    protected boolean headless = false;

    BrowserType browser;

    protected enum BrowserName {CHROME, FIREFOX, WEBKIT}

    protected abstract BrowserName getBrowserName();

    protected abstract Browser launchBrowser();
}
