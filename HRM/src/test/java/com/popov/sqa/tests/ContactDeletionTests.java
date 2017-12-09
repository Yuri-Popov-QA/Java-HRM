package com.popov.sqa.tests;


import org.testng.annotations.Test;


public class ContactDeletionTests extends TestBase {

   @Test
   public void testContactDeletion() {
      app.gotoHomePage();
      app.selectDeleteContact();
      app.deleteContact();
      app.gotoHomePage();
   }






}
