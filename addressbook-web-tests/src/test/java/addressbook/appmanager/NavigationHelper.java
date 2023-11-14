package addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

    //Переключение на алерт
    public  boolean isAlertPresent(){
        try{ // Переключись на алерт и верни тру
            driver.switchTo().alert();
            return true;
        }catch (NoAlertPresentException e){//А если не получится верни фолс
            return false;
        }

    }
    public void  GroupCreation(){
        driver.findElement(By.cssSelector(".secondary-2-2-18 > .innerTextWrapper-2-2-4")).click();
        isAlertPresent();
        driver.findElement(By.cssSelector(".focus-2-2-37 .input-2-2-47")).sendKeys("Test");
        driver.findElement(By.cssSelector(".primary-2-2-15 > .inner-2-2-3")).click();
    }
}