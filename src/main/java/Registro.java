import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WebDriverSupliter.getChromeDriver;

public class Registro {

        public static void Registro(String email, String password){

            WebDriver driver = getChromeDriver();

            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("passwd")).sendKeys(password);
            driver.findElement(By.cssSelector("#SubmitLogin > span")).click();

        }

}
