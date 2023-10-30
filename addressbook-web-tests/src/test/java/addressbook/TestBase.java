package addressbook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestBase {

    private Map<String, Object> vars;
    JavascriptExecutor js;
    public WebDriver driver;


    @Before
    public void setUp()   {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\rid90\\IdeaProjects\\mavenProject\\drivers\\chromedriver\\chromedriver.exe");//запуск драйвера для браузера
        driver = new ChromeDriver();//запуск браузера
        driver.manage().window().setSize(new Dimension(1394, 816));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Установка задержки для загрузки страницы
        driver.get("https://habr.com/ru/articles/");//Открытие страницы сайта
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
