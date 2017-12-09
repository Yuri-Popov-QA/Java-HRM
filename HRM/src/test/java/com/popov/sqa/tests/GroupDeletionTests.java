package com.popov.sqa.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

   @Test
   public void testGroupDeletion() {
      app.gotoGroupPage();
      app.chooseGroup();
      app.deleteGroup();
      app.gotoGroupPage();
   }










}
