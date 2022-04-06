package com.company.base;

import org.openqa.selenium.WebDriver;

public class Browser {

    private WebDriver _driver;

    public Browser(WebDriver driver) {
        this._driver = driver;
    }

    public BrowserType Type;

    public void goToUrl(String url){
        _driver.get(url);
    }

    public void maximize(){
        _driver.manage().window().maximize();
    }

}

