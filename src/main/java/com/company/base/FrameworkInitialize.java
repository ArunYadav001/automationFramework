package com.company.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static com.company.base.DriverContext.Driver;

public class FrameworkInitialize extends Base {

    public void initializeBrowser(BrowserType browserType){
       WebDriver driver = null;
        switch (browserType){
            case Chrome:{
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\arun.y\\chromeDriver\\chromedriver.exe");
                 driver = new ChromeDriver();
                break;
            }
            case Edge:{
                driver = new EdgeDriver();
                break;
            }

        }
        DriverContext.setDriver(driver);

        DriverContext.Browser = new Browser(driver);

    }

}
