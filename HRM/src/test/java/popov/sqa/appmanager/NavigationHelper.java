package popov.sqa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {

   private ChromeDriver wd;

   public NavigationHelper(ChromeDriver wd) {
      this.wd = wd;
   }

   public void gotoPIMPage() {
       wd.findElement(By.id("menu_pim_viewPimModule")).click();
   }
}
