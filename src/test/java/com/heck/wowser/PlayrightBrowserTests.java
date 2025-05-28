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
        assertEquals(AbstractPlaywrightBrowser.BrowserName.CHROME, chromeBrowser.getBrowserName());

        Browser browser = chromeBrowser.launchBrowser();

        Page page = browser.newPage();
        page.navigate("https://amiunique.org/fingerprint");
        assertEquals("My Fingerprint- Am I Unique ?", page.title());
        browser.close();
    }

    @Test
    public void testFirefoxBrowser() {
        FirefoxPlaywrightBrowser firefoxBrowser = new FirefoxPlaywrightBrowser();
        assertFalse(firefoxBrowser.isHeadless());
        assertEquals(AbstractPlaywrightBrowser.BrowserName.FIREFOX, firefoxBrowser.getBrowserName());

        Browser browser = firefoxBrowser.launchBrowser();

        Page page = browser.newPage();
        page.navigate("https://amiunique.org/fingerprint");
        assertEquals("My Fingerprint- Am I Unique ?", page.title());
        browser.close();
    }

    @Test
    public void testWebkitBrowser() {
        WebkitPlaywrightBrowser webkitBrowser = new WebkitPlaywrightBrowser();
        assertFalse(webkitBrowser.isHeadless());
        assertEquals(AbstractPlaywrightBrowser.BrowserName.WEBKIT, webkitBrowser.getBrowserName());

        Browser browser = webkitBrowser.launchBrowser();
        Page page = browser.newPage();
        page.navigate("https://amiunique.org/fingerprint");
        assertEquals("My Fingerprint- Am I Unique ?", page.title());
        browser.close();
    }
}
