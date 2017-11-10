package popov.sqa.tests;


import org.testng.annotations.Test;
import popov.sqa.model.EmData;

public class EmCreationTest extends TestBase { // create object of the class 'EmCreationTest'

    @Test
    public void testEmCreation() {
        app.getNavigationHelper().gotoPIMPage();
        app.getEmHelper().initEmCreation();
        app.getEmHelper().fillEmForm(new EmData("wsdf", "gfde"));
        app.getNavigationHelper().gotoPIMPage();
    }


}
