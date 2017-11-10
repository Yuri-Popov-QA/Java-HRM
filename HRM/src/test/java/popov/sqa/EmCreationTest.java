package popov.sqa;


import org.testng.annotations.Test;

public class EmCreationTest extends TestBase { // create object of the class 'EmCreationTest'

    @Test
    public void testEmCreation() {
        gotoPIMPage();
        initEmCreation();
        fillEmForm(new EmData("wsdf", "gfde"));
        gotoPIMPage();
    }


}
