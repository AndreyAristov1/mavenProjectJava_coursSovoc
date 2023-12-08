package addressbook.Tests;

import addressbook.appmanager.ApplicationManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestBase {


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


}
