package pages;

import com.company.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage() {
        super();
    }

    @FindBy(name="UserName")
    public WebElement txtUserName;

    @FindBy(name="Password")
    public WebElement txtPassword;

    @FindBy(css="input[class*='btn-default']")
    public WebElement btnLogin;

    public HomePage Login(String userName , String password){
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.submit();

        return GetInstance(HomePage.class);
    }


}
