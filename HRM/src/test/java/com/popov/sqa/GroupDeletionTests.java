package com.popov.sqa;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

   @Test
   public void testGroupDeletion() {
      gotoGroupPage();
      chooseGroup();
      deleteGroup();
      gotoGroupPage();
   }










}
