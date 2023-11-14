package addressbook.Tests;

import org.junit.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        login();
   app.goToContacts();
   app.goToGroupTest();
   app.ModificationTest();


    }



}
