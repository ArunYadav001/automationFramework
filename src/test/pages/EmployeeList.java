package pages;

import com.company.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeList extends BasePage {

    public EmployeeList(){

    }

    @FindBy(css="[class='btn-primary']")
    public WebElement btnCreate ;

}
