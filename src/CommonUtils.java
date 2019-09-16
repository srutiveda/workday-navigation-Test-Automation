import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {

    public static void explicitWait(WebDriver driver,int waitTime,String mXPath){
        WebDriverWait wait= new WebDriverWait(driver,waitTime);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mXPath)));
    }
}
