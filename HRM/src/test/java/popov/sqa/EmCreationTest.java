import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import popov.sqa.EmData;

public class EmCreationTest { // create object of the class 'EmCreationTest'
    ChromeDriver wd; // WD is an attribute of the object 'EmCreationTest'
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver(); // initialization attribute of the object 'EmCreationTest'. DW is an attribute of the object
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://local.school.portnov.com:9595/symfony/web/index.php/auth/login");
        login("admin", "password");
    }

    private void login(String username, String password) {
        wd.findElement(By.id("txtUsername")).click();
        wd.findElement(By.id("txtUsername")).clear();
        wd.findElement(By.id("txtUsername")).sendKeys(username);
        wd.findElement(By.id("txtPassword")).click();
        wd.findElement(By.id("txtPassword")).clear();
        wd.findElement(By.id("txtPassword")).sendKeys(password);
        wd.findElement(By.id("btnLogin")).click();
    }

    @Test
    public void testEmCreation() {
        gotoPIMPage();
        initEmCreation();
        fillEmForm(new EmData("wsdf", "gfde"));
        gotoPIMPage();
    }
    

    private void fillEmForm(EmData emData) {
        wd.findElement(By.id("firstName")).click();
        wd.findElement(By.id("firstName")).clear();
        wd.findElement(By.id("firstName")).sendKeys(emData.getFirstName());
        wd.findElement(By.id("lastName")).click();
        wd.findElement(By.id("lastName")).clear();
        wd.findElement(By.id("lastName")).sendKeys(emData.getLastName());
        wd.findElement(By.id("btnSave")).click();
    }

    private void gotoPIMPage() {
        wd.findElement(By.id("menu_pim_viewPimModule")).click();
    }

    private void initEmCreation() {
        wd.findElement(By.id("btnAdd")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
