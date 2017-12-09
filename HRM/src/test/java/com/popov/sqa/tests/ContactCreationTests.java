package com.popov.sqa.tests;


import com.popov.sqa.model.Contact;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
   @Test
   public void testContactCreation() {
      app.initContactCreation();
      app.fillGroupPage(new Contact("Ivan", "Test", "Test", "Test", "Test"));
      app.submitContactCreation();
      app.gotoHomePage();
   }




}
