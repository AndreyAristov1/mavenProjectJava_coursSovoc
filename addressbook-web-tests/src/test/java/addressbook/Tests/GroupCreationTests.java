package addressbook.Tests;

import addressbook.model.GroupData;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Comparator;

public class GroupCreationTests extends TestBase {

    public WebDriver driver;

    @Test
    public void testGroupCreation() {
        app.authorization();
        app.goToContacts();
        app.goToGroupTest();

      /*  int before = app.getGroupHelper().getGroupCount();//Количество групп до добавление новой
        app.GroupCreation();
        int after = app.getGroupHelper().getGroupCount();//Количество групп после добавления
        Assert.assertEquals(after, before +1);//Проверка что количество групп равно имеющемуся количеству +1
    }*/

        //Поиск элемента с максимальным идентефекатором
        /*int max =0;
        for(GroupDatag g : after){
            if(g.getId() > max){
             max = g.getId();
            }
        }*/

       // int max = after.stream().max((o1, o2) -> integer.compare(o1.getId(), o2.getId())).get().getId();

/*
    //Получение количества выбранных элементов на странице
    int getGroupCount(){
    return driver.findElements(By.xpath("#root > div > span > div.sc-brqgnP.ibGAc > div.sc-dxgOiQ.hQlqMq > a:nth-child(5) > div > svg > path")).size();
    */
    }
}