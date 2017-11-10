package popov.sqa.model;

public class EmData {
   private final String firstName;
   private final String lastName;

   public EmData(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }
}
