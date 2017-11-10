package popov.sqa.tests;

import org.testng.annotations.Test;

public class EmDeletionTests extends TestBase { // create object of the class 'EmDeletionTests'

    
    @Test
    public void testEmDeletion() {
        app.getNavigationHelper().gotoPIMPage();
        app.getEmHelper().selectEm();
        app.getEmHelper().initEmDeletion();
        app.getEmHelper().submitEmDeletion();
    }

}
