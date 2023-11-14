
package addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertTrue;

public class GroupHelper {
    private final NavigationHelper nH = new NavigationHelper();
    public WebDriver driver;

    public void GroupCreation() {
        driver.findElement(By.cssSelector(".secondary-2-2-18 > .innerTextWrapper-2-2-4")).click();
        nH.isAlertPresent();
        driver.findElement(By.cssSelector(".focus-2-2-37 .input-2-2-47")).sendKeys("Test");
        driver.findElement(By.cssSelector(".primary-2-2-15 > .inner-2-2-3")).click();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.xpath("//*[@id=\"root\"]/div/span/div[1]/div[2]/a[4]/div"));
    }

    private boolean isElementPresent(By xpath) {
        try { // Переключись на алерт и верни тру
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/span/div[1]/div[2]/a[4]/div"));

            return true;
        } catch (NoAlertPresentException e) {//А если не получится верни фолс
            return false;
        }
    }
}
