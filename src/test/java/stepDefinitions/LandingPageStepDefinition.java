package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LandingPage;
import utils.TextContextSetup;
import java.time.Duration;


public class LandingPageStepDefinition {
    TextContextSetup textContextSetup;
   public LandingPageStepDefinition(TextContextSetup textContextSetup){
        this.textContextSetup=textContextSetup;
    }


    @Given("User is on GreenCart Landing page")
    public void user_is_on_green_cart_landing_page() {
        System.setProperty("webdriver.chrome.driver","C:/Users/asena/Downloads/Compressed/chromedriver.exe");
        textContextSetup.driver = new ChromeDriver();
        textContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        textContextSetup.driver.manage().window().maximize();
        textContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @When("user searched with Shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
        LandingPage landingPage = textContextSetup.pageObjectManager.getLandingPage();
        landingPage.searchItem(shortName);

        //textContextSetup.driver.findElement(By.cssSelector(".search-keyword")).sendKeys(shortName);
        Thread.sleep(2000);
        textContextSetup.landingPageProductName = landingPage.productName();
        System.out.println(textContextSetup.landingPageProductName+" is extracted from the homepage");
    }


}
