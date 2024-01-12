package addressbook.Tests;

import addressbook.model.GroupData;
import org.junit.Test;
import sandbox.Collections;

import java.util.Comparator;
public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        login();
   app.goToContacts();
   app.goToGroupTest();
   app.ModificationTest();


    }
    before.remove(before.size() -1);
    before.add(group);
    //Сортировка списков
    Comparator<? super GroupData> byId = (g1,g2)-> integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    //Сравнение списков
    Assert.assertEquals(before, after);




}


