package com.popov.sqa;


import org.testng.annotations.Test;


public class ContactDeletionTests extends TestBase{

   @Test
   public void testContactDeletion() {
      gotoHomePage();
      selectDeleteContact();
      deleteContact();
      gotoHomePage();
   }






}
