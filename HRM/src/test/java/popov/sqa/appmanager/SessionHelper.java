package popov.sqa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper {
   private ChromeDriver wd;

   public SessionHelper(ChromeDriver wd) {
      this.wd = wd;
   }

   public void login(String username, String password) {
      wd.findElement(By.id("txtUsername")).click();
      wd.findElement(By.id("txtUsername")).clear();
      wd.findElement(By.id("txtUsername")).sendKeys(username);
      wd.findElement(By.id("txtPassword")).click();
      wd.findElement(By.id("txtPassword")).clear();
      wd.findElement(By.id("txtPassword")).sendKeys(password);
      wd.findElement(By.id("btnLogin")).click();
   }
}
