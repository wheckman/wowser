package com.heck.wowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PlayrightBrowserTests {
    @Test
    public void testCromeBrowser() {
        ChromePlaywrightBrowser chromeBrowser = new ChromePlaywrightBrowser();
        assertFalse(chromeBrowser.isHeadless());

        Browser browser = chromeBrowser.launchBrowser();

        Page page = browser.newPage();
        page.navigate("https://www.google.com");
        assertEquals("Google", page.title());
        browser.close();
    }

    @Test
    public void testFirefoxBrowser() {
        FirefoxPlaywrightBrowser firefoxBrowser = new FirefoxPlaywrightBrowser();
        assertFalse(firefoxBrowser.isHeadless());

        Browser browser = firefoxBrowser.launchBrowser();

        Page page = browser.newPage();
        page.navigate("https://www.google.com");
        assertEquals("Google", page.title());
        browser.close();
    }

    @Test
    public void testWebkitBrowser() {
        WebkitPlaywrightBrowser webkitBrowser = new WebkitPlaywrightBrowser();
        assertFalse(webkitBrowser.isHeadless());

        Browser browser = webkitBrowser.launchBrowser();
        Page page = browser.newPage();
        page.navigate("https://www.google.com");
        assertEquals("Google", page.title());
        browser.close();
    }
}
