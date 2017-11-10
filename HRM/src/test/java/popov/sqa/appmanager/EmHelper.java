package popov.sqa.appmanager;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import popov.sqa.model.EmData;

public class EmHelper {
   private ChromeDriver wd;

   public EmHelper(ChromeDriver wd) {
      this.wd = wd;
   }

   public void fillEmForm(EmData emData) {
       wd.findElement(By.id("firstName")).click();
       wd.findElement(By.id("firstName")).clear();
       wd.findElement(By.id("firstName")).sendKeys(emData.getFirstName());
       wd.findElement(By.id("lastName")).click();
       wd.findElement(By.id("lastName")).clear();
       wd.findElement(By.id("lastName")).sendKeys(emData.getLastName());
       wd.findElement(By.id("btnSave")).click();
   }

   public void initEmCreation() {
       wd.findElement(By.id("btnAdd")).click();
   }

   public void submitEmDeletion() {
       wd.findElement(By.id("dialogDeleteBtn")).click();
   }

   public void initEmDeletion() {
       wd.findElement(By.id("btnDelete")).click();
   }

   public void selectEm() {
       if (!wd.findElement(By.id("ohrmList_chkSelectRecord_3251")).isSelected()) {
           wd.findElement(By.id("ohrmList_chkSelectRecord_3251")).click();
       }
   }
}
