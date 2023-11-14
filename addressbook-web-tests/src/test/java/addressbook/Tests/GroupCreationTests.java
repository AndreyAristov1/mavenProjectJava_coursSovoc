package addressbook.Tests;

import org.junit.Test;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation(){
        app.authorization();
        app.goToContacts();
        app.goToGroupTest();
        app.GroupCreation();
    }
}
