package com.popov.sqa;


import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
   @Test
   public void testContactCreation() {
      initContactCreation();
      fillGroupPage(new Contact("Ivan", "Test", "Test", "Test", "Test"));
      submitContactCreation();
      gotoHomePage();
   }




}
