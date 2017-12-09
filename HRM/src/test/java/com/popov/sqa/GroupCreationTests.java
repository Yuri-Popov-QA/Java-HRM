package com.popov.sqa;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

   @Test
   public void testGroupCreation() {
      gotoGroupPage();
      initGroupCreation();
      fillGroupForm(new Group("Test1", "Test1", "Test1"));
      gotoGroupPage();
   }
}
