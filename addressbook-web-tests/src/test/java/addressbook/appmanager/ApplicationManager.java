package addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

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
        gH.driver.get("https://habr.com/ru/articles/");//Открытие страницы сайта
        js = (JavascriptExecutor) gH.driver;
        vars = new HashMap<String, Object>();
    }
    public void click(){
        gH.click();
    }
    public void stop() {
        gH.driver.quit();
    }

}
