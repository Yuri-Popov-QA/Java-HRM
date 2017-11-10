package popov.sqa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import popov.sqa.appmanager.ApplicationManager;

public class TestBase {

   protected final ApplicationManager app = new ApplicationManager(); // create new object 'app' type of 'ApplicationManager' (name of class)

   @BeforeMethod
   public void setUp() throws Exception {
      app.init();
   }

   @AfterMethod
   public void tearDown() {
      app.stop();
   }
}
