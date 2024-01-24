package addressbook.Tests;

import addressbook.model.GroupData;
import addressbook.model.Groups;
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
   /* before.remove(before.size() -1);
    before.add(group);
    //Сортировка списков
    Comparator<? super GroupData> byId = (g1,g2)-> integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    //Сравнение списков
    Assert.assertEquals(before, after);
*/

//Иная реализация
    /*@BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPsge();
        if (app.group() / all().size() == 0) {
            app.group().create(new GroupData().withName("test1"));
        }
    }

    @Test

    public void testGroupModification(){
        Groups before = app.group().all();
        GroupData modifiedGroup =before.iterator.next();
        GroupData group = new GroupData()
                .withId(modifiedGroup.getId()).withName("test1").withHeader("test2").withFooter("test3");
        app.group().modify(group);
        assertThat(app.group().count(), equalTo(before.size()));
        Groups after = app.group().all();
        assertThat(after, equalTo(before.without(modifiedGroup).withAdded(group)));

    }*/
}


