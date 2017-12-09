package com.popov.sqa.tests;

import com.popov.sqa.model.Group;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

   @Test
   public void testGroupCreation() {
      app.gotoGroupPage();
      app.initGroupCreation();
      app.fillGroupForm(new Group("Test1", "Test1", "Test1"));
      app.gotoGroupPage();
   }
}
