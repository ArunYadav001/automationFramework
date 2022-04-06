package pages;

import com.company.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage() {
    }

    @FindBy(linkText="Login")
    public WebElement lnkLogin;

    @FindBy(linkText="Employee List")
    public WebElement lnkEmployeeList;


    public LoginPage clickLogin() {
        lnkLogin.click();
        return GetInstance(LoginPage.class);
    }
}
