package addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;

public class NavigationHelper {
    public WebDriver driver;

    public void click() {
        {
            WebElement element = driver.findElement(By.linkText("Разработка"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("Разработка")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.linkText("Администрирование"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("Администрирование")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.linkText("Дизайн"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("Дизайн")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.linkText("Менеджмент"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("Менеджмент")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.linkText("Маркетинг"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.linkText("Маркетинг")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }

        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".tm-navigation-filters-spoiler__button"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }


    }

    public  void authorization() {


        driver.findElement(By.name("username")).click();

       //Пример проверки перед заполением поля
        /*if (text != null){
            String existingText = driver.findElement("username").getAttribute("value");
            if(! text.equals(existingText)){
                driver.findElement(By.name("username")).sendKeys("rid90@inbox.ru");

            }
        }*/

        driver.findElement(By.name("username")).sendKeys("rid90@inbox.ru");
        driver.findElement(By.xpath("//span[text() = \"Ввести пароль\"]")).click();
        driver.findElement(By.name("password")).sendKeys("Russia88!");
        driver.findElement(By.cssSelector(".innerTextWrapper-0-2-90:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".innerTextWrapper-0-2-90:nth-child(1)")).click();



    }

    public  void goToContacts(){
        //Проверка нахождения на нужной странице перед кликом
       /* if(isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Контакты")
                && isElementPresent(By.xpath("//span[text()=\"Добавить контакт\"]"))){

            return;//Если не нашлось выходим
        }
//Если нашлось тапаем*/
        driver.findElement(By.xpath("//a[text()= \"Контакты\"]")).click();
    }

    /*private boolean isElementPresent(By h1) {
        return true;
    }*/

    public void goToGroupTest(){
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/span/div[1]/div[2]/a[4]")).click();

    }
//Проверка на наличие кнопки редактировать группу
    public void ModificationTest(){
//Наведение курсора на элемент
        WebElement link = driver.findElement(By.xpath("//*[@id=\"root\"]/div/span/div[1]/div[2]/a[4]/div"));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();
        //Проверка на налицие всплывающего элемента
        WebElement Edite = null;
        try {
            Edite = driver.findElement(By.xpath("//*[@id=\"root\"]/div/span/div[1]/div[2]/a[4]/div/div\n"));
        }catch (TimeoutException e){
            assertTrue(false);
        }
        assertTrue(Edite != null );
    }
    //Переключение на алерт
    public  boolean isAlertPresent(){
        try{ // Переключись на алерт и верни тру
            try{ //Задержка перед тапом на ок
                Thread.sleep(3000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }driver.switchTo().alert().accept();
            return true;
        }catch (NoAlertPresentException e){//А если не получится верни фолс
            return false;
        }

    }

}