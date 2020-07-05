package main.java.TenthDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverWithJava8 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in");

        List<WebElement> linkslist = driver.findElements(By.tagName("a"));
        System.out.println(linkslist.size());

        //1. print all link text from the page
        //linkslist.forEach(ele -> System.out.println(ele.getText()));

        //2. remove links from list having no text
       // linkslist.stream().filter(ele -> !ele.getText().equals("")).map(ele -> ele.getText()).forEach(System.out::println);

        //3. first text
        String firstlink = linkslist.stream().filter(ele -> !ele.getText().equals("")).findFirst().get().getText();
        System.out.println(firstlink);

        //4. find any element
        String findany = linkslist.stream().filter(ele -> !ele.getText().equals("")).findAny().get().getText();
        System.out.println(findany);

        //5. Exclude all blank text links and print those links starting with amazon
        linkslist.stream().filter(ele -> !ele.getText().equals("") && ele.getText().startsWith("Amazon"))
                .map(ele -> ele.getText())
                .forEach(System.out::println);

        //6. Trim text in filter
        linkslist.stream().filter(ele -> !ele.getText().equals("") && ele.getText().startsWith("Amazon"))
                .map(ele -> ele.getText().trim())
                .forEach(System.out::println);

        driver.quit();

    }
}
