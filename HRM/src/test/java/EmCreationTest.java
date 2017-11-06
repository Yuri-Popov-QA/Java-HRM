import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class EmCreationTest {
    ChromeDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://local.school.portnov.com:9595/symfony/web/index.php/auth/login");
        wd.findElement(By.id("txtUsername")).click();
        wd.findElement(By.id("txtUsername")).clear();
        wd.findElement(By.id("txtUsername")).sendKeys("admin");
        wd.findElement(By.id("txtPassword")).click();
        wd.findElement(By.id("txtPassword")).clear();
        wd.findElement(By.id("txtPassword")).sendKeys("password");
        wd.findElement(By.id("btnLogin")).click();
    }
    
    @Test
    public void testEmCreation() {
        wd.findElement(By.id("btnAdd")).click();
        wd.findElement(By.id("firstName")).click();
        wd.findElement(By.id("firstName")).clear();
        wd.findElement(By.id("firstName")).sendKeys("wsdf");
        wd.findElement(By.id("lastName")).click();
        wd.findElement(By.id("lastName")).clear();
        wd.findElement(By.id("lastName")).sendKeys("gfde");
        wd.findElement(By.id("btnSave")).click();
        wd.findElement(By.linkText("PIM")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
