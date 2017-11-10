package popov.sqa;

import org.testng.annotations.Test;

public class EmDeletionTests extends TestBase { // create object of the class 'EmDeletionTests'

    
    @Test
    public void testEmDeletion() {
        gotoPIMPage();
        selectEm();
        initEmDeletion();
        submitEmDeletion();
    }

}
