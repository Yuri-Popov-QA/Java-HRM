package com.popov.sqa.model;

public class Contact {
   public String firstname;
   public String lastname;
   public String address;
   public String homeNumber;
   public String email;

   public Contact(String firstname, String lastname, String address, String homeNumber, String email){
      this.firstname=firstname;
      this.lastname=lastname;
      this.address=address;
      this.homeNumber=homeNumber;
      this.email=email;
   }
}
