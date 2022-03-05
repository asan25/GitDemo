package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
    public WebDriver driver;
    public OffersPage(WebDriver driver){
        this.driver=driver;
    }
    By search = By.cssSelector("[id='search-field']");
    By productName = By.xpath("//table[@class=\"table table-bordered\"]/tbody/tr/td[1]");

    public void searchItem(String name){
        driver.findElement(search).sendKeys(name);
    }

    public void getSearchText(String name){
        driver.findElement(search).getText();
    }

    public String productName(){
        return driver.findElement(productName).getText().split("-")[0].trim();
    }

}
