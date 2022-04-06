package seleniumtest;

import com.company.base.Base;
import com.company.base.BrowserType;
import com.company.base.DriverContext;
import com.company.base.FrameworkInitialize;
import com.company.utilities.ExcelUtil;
import com.company.utilities.LogUtil;
import pages.HomePage;
import pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.company.base.Base.CurrentPage;
import static com.company.base.DriverContext.Driver;

public class LoginTest extends FrameworkInitialize {



    @Before
    public  void Initialize(){
        LogUtil logUtil = new LogUtil();

        logUtil.createLogFile();
        logUtil.write("Framework initialized");

        initializeBrowser(BrowserType.Chrome);
        DriverContext.Browser.goToUrl("http://eaapp.somee.com/");
         try {
             ExcelUtil util = new ExcelUtil("C:\\Users\\arun.y\\IdeaProjects\\EaFramworkJava\\data.xls");
         }catch(Exception e){

         }
    }

   @Test
    public void Login(){

//        driver.findElement(By.name("UserName")).sendKeys("admin");
//        driver.findElement(By.name("Password")).sendKeys("admin");
//        driver.findElement(By.name("Login")).submit();

       CurrentPage = GetInstance(HomePage.class);

      CurrentPage = CurrentPage.As(HomePage.class).clickLogin();

     //  CurrentPage.As(LoginPage.class).Login("admin","password");
     // DDT from excel
       CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell(ExcelUtil.GetCell("UserName"),1),ExcelUtil.ReadCell(ExcelUtil.GetCell("Password"),1));

   }

}

/** Page Object model involves these three steps
 * Creating our first Page object class
 * Creating objects for the page UI
 * Initialize the pageFactory()
 *
 * Page Object model with simplicity
 * Instead of initializing page in each class lets try to create a Base abstract class
 *
 * Page navigation  > using page navigation we can establish relationship betweem
 *
 * Page Navigation without generics >
 * Generic way of pageNavigation
 * Generics allows us to abstract over types i.e generics enables types to be parameters when
 * defining classes , interfaces and methods
 *
 * Handling different browsers types
 * Its important how we configure and use those browsers in our framework
 * We create browser types with enum and call them with its own class
 *
 * Our base package is now complete and it contains some industry standard code
 *
 * Intro to utilities
 *First we will develop Excel utilities (Data driven testing)
 * We will use Java Excel API for that (jxl)
 *
 *
 *
 */