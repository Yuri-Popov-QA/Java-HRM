package popov.sqa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
   ChromeDriver wd; // 'ChromeDriver' is a type of attribute, // 'wd' is a name of attribute of the object 'EmCreationTest'

   @BeforeMethod
   public void setUp() throws Exception {
       wd = new ChromeDriver(); // initialization attribute of the object 'EmCreationTest'. DW is an attribute of the object
       wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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

   @AfterMethod
   public void tearDown() {
       wd.quit();
   }

   protected void fillEmForm(EmData emData) {
       wd.findElement(By.id("firstName")).click();
       wd.findElement(By.id("firstName")).clear();
       wd.findElement(By.id("firstName")).sendKeys(emData.getFirstName());
       wd.findElement(By.id("lastName")).click();
       wd.findElement(By.id("lastName")).clear();
       wd.findElement(By.id("lastName")).sendKeys(emData.getLastName());
       wd.findElement(By.id("btnSave")).click();
   }

   protected void gotoPIMPage() {
       wd.findElement(By.id("menu_pim_viewPimModule")).click();
   }

   protected void initEmCreation() {
       wd.findElement(By.id("btnAdd")).click();
   }

   protected void submitEmDeletion() {
       wd.findElement(By.id("dialogDeleteBtn")).click();
   }

   protected void initEmDeletion() {
       wd.findElement(By.id("btnDelete")).click();
   }

   protected void selectEm() {
       if (!wd.findElement(By.id("ohrmList_chkSelectRecord_3251")).isSelected()) {
           wd.findElement(By.id("ohrmList_chkSelectRecord_3251")).click();
       }
   }
}
