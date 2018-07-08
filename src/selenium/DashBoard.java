/*
package selenium;



import instance.WebDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// http://www.testautomationguru.com/selenium-webdriver-how-to-query-html-web-table/


public class DashBoard extends MainPage {

    @FindBy(xpath = "//table[@id = 'platetable']")
    WebElement plateTable;

    private WebDriver driver;

    public DashBoard() {
        this.driver = WebDrivers.WEBDRIVER.getWebDriver();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,3),this);
    }


    public DashBoard getPlates() {

        List<WebElement> elements = plateTable.findElements(By.xpath(".//tr"));

        List<String> list =
                elements.stream()
                        .map(element -> element.getText())
                        .filter(elem -> elem.contains("GSS")
                        ).collect(Collectors.toList());

        List<String> columnNames = plateTable.findElements(By.tagName("th"))
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());
        System.out.println(columnNames);

        Map<String, Integer> columnMap = IntStream.range(0, columnNames.size())
                .boxed()
                .collect(Collectors.toMap(columnNames::get,
                        Function.identity()));
        System.out.println(columnMap);

        List<WebElement> list1 = plateTable.findElements(By.tagName("tr"))
                .stream()
                .skip(1)
                .map(tr -> tr.findElements(By.tagName("td")))
                .filter(tds -> tds.get(columnMap.get("Site")).getText().equals("GSS"))
                .map(tds -> tds.get(columnMap.get("Plate Number")))
                .collect(Collectors.toList());

        list1.stream().forEach(element -> System.out.println(element.getText()));
        return this;


    }

    private DashBoard filterRows(Predicate<List<WebElement>> compositeCheck){

        List<String> columnNames = plateTable.findElements(By.tagName("th"))
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());
        System.out.println(columnNames);

        Map<String, Integer> columnMap = IntStream.range(0, columnNames.size())
                .boxed()
                .collect(Collectors.toMap(columnNames::get,
                        Function.identity()));
        System.out.println(columnMap);


        plateTable.findElements(By.tagName("tr"))
                .stream()
                .skip(1)
                .map(tr -> tr.findElements(By.tagName("td")))
                .filter(compositeCheck)
                .map(tds -> tds.get(columnMap.get("Plate Number")))
                .forEach(WebElement::getText);

        return this;

    }


}
*/
