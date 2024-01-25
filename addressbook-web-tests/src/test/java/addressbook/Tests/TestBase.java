package addressbook.Tests;

import addressbook.appmanager.ApplicationManager;
import addressbook.model.GroupData;
import addressbook.model.Groups;
import org.junit.After;
import org.junit.Before;
//import org.junit.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;

public class TestBase {

Logger logger = LoggerFactory.getLogger(TestBase.class);
    protected final ApplicationManager app = new ApplicationManager();

    public  void login() {
        app.authorization();
    }



    @Before
    public void setUp()   {
         app.init();
    }

    @After
    public void tearDown() {app.stop();
    }

  /*  public void GroupCreation() {
        app.click();
    }*/

    /*@BeforeMethod
//Выведение в консоль информации о старте теста
    public void logTestStart(Method m){
        logger.info("Start test" + m.getName());
    }

    @AfterMethod
//Выведение в консоль информации о завершение теста
    public void logTestStop(Method m) {
        logger.info("Stop test" + m.getName());
    }*/
    //Проверка на сравнение списка групп из БД и из пользовательского интерфейса
   /* public void  verifyGroupListUI() {
        if(Boolean.getBoolean("verifyUI")) {
            Groups dbGroups = app.db().groups();
            Groups uiGroups = app.group().all();
            sssertThat(uiGroups, equalTo(dbGroups.stream()
                    .map((g)-> new GroupData().withId(g.getId()).withName(g.getName()))
                    .collect(Collectors.toSet())));
        }
    }*/
}
