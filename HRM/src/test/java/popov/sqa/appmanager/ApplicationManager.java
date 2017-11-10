package popov.sqa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class ApplicationManager {
   ChromeDriver wd; // 'ChromeDriver' is a type of attribute, // 'wd' is a name of attribute of the object 'EmCreationTest'

   private SessionHelper sessionHelper;
   private NavigationHelper navigationHelper;
   private EmHelper emHelper;

   public void init() {
      wd = new ChromeDriver(); // initialization attribute of the object 'EmCreationTest'. DW is an attribute of the object
      wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      wd.get("http://local.school.portnov.com:9595/symfony/web/index.php/auth/login");
      emHelper = new EmHelper(wd);
      navigationHelper = new NavigationHelper(wd);
      sessionHelper = new SessionHelper(wd);
      sessionHelper.login("admin", "password");
   }



   public void stop() {
      wd.quit();
   }

   public EmHelper getEmHelper() {
      return emHelper;
   }

   public NavigationHelper getNavigationHelper() {
      return navigationHelper;
   }
}
