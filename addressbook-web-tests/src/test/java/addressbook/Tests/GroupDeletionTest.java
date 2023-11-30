package addressbook.Tests;

import addressbook.model.GroupData;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

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

       /* List<GroupData> before = app.getGroupHelper().getGroupList();//Получение массива с элементами
        app.getGroupHelper().selectGrou(before.size() -1); //Вычерание еденицы из колличества элементов в массиве , запись результата в переменную
        app.getGroupHelper().deleteSelectedGroups();//Удаление выбранной группы
        app.getGroupHelper().returnToGroupPage();//Переход на страницу групп
        List<GroupData> after = app.getGroupHelper().getGroupList();//Получение массива с элементами
        Assert.assertEquals(after.size(), before.size() -1);//проверка что количество элементов полученных в массиве после удаления равна количеству элементов в массиве до удаления -1

        before.remove(before.size()-1);//Удаление элемента из списка
        Assert.assertEquals(before, after);//Проверка что элемент старого списка равен элементу нового списка
*/


    }
}