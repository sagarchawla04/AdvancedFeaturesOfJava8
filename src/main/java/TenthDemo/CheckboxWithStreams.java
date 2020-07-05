package TenthDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxWithStreams {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
        List<WebElement> checkboxList = driver.findElements(By.cssSelector("td.select-checkbox"));
        checkboxList.stream().forEach(ele -> ele.click());
    }
}
