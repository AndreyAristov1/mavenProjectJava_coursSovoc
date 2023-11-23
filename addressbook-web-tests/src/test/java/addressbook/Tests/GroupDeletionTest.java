package addressbook.Tests;

import org.junit.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.authorization();
        app.goToContacts();
        app.goToGroupTest();
        if (!app.isThereAGroup()) {
            app.GroupCreation();

        }
        app.SelectGroup();
        //Добавить метод удаления группы
    }
}