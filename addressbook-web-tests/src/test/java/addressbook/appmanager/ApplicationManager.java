package addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private final NavigationHelper gH = new NavigationHelper();
    public Map<String, Object> vars;
    JavascriptExecutor js;

    public void init() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\rid90\\IdeaProjects\\mavenProject\\drivers\\chromedriver\\chromedriver.exe");//запуск драйвера для браузера
        gH.driver = new ChromeDriver();//запуск браузера
        gH.driver.manage().window().setSize(new Dimension(1394, 816));
        gH.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Установка задержки для загрузки страницы
        gH.driver.get("https://account.mail.ru/login?page=https%3A%2F%2Fe.mail.ru%2Fmessages%2Finbox%3Futm_source%3Dportal%26utm_medium%3Dnew_portal_navigation%26utm_campaign%3De.mail.ru%26mt_sub5%3D74%26mt_sub1%3Dmail.ru%26mt_click_id%3Dmt-y7s979-1698903548-16138100&allow_external=1");//Открытие страницы сайта
        js = (JavascriptExecutor) gH.driver;
        vars = new HashMap<String, Object>();
    }
    public void click(){
        gH.click();
    }
    public void stop() {
        gH.driver.quit();
    }

    public  void authorization() {
       gH.authorization();
    }
public void goToContacts(){
        gH.goToContacts();
}
public void goToGroupTest(){
    gH.goToGroupTest();
}
public void GroupCreation(){
 gH.GroupCreation();
}
}
