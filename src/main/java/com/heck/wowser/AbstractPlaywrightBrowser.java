package com.heck.wowser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import lombok.Getter;
import lombok.Setter;

/**
 * Abstract class for Playwright browser implementations.
 * Provides a common structure for launching different browsers.
 */
public abstract class AbstractPlaywrightBrowser {

    /**
     * Indicates whether the browser should run in headless mode.
     * Default is false, meaning the browser will run with a visible UI.
     * <p>
     * This variable can be set to true to run the browser in headless mode,
     * which is useful for automated testing or when a UI is not required.
     */
    @Getter
    @Setter
    protected boolean headless = false;

    /**
     * Instance of the Playwright class used to interact with and manage browser operations.
     * This variable serves as the primary entry point for creating browser instances
     * in specific implementations of the AbstractPlaywrightBrowser class.
     * <p>
     * The `browser` variable is initialized differently depending on the concrete implementation
     * (e.g., ChromePlaywrightBrowser, FirefoxPlaywrightBrowser, or WebkitPlaywrightBrowser) to support
     * the desired browser type.
     * <p>
     * It provides access to various browser types available through the Playwright API, such as
     * Chromium, Webkit, and Firefox.
     * The configuration and launch options are applied
     * based on the respective subclass logic.
     */
    Playwright browser;

    /**
     * The name of the browser being used.
     * This method is abstract and must be implemented by subclasses to return the specific browser type.
     */
    protected enum BrowserName {CHROME, FIREFOX, WEBKIT}

    /**
     * Returns the name of the browser being used.
     * This method must be implemented by subclasses to provide the specific browser name.
     *
     * @return The name of the browser as a BrowserName enum value.
     */
    protected abstract BrowserName getBrowserName();

    /**
     * Launches the browser instance.
     * This method is abstract
     * and must be implemented by subclasses to provide the specific browser launch logic.
     *
     * @return An instance of the Browser class representing the launched browser.
     */
    protected abstract Browser launchBrowser();
}
