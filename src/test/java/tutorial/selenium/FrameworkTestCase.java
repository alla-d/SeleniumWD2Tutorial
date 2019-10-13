package tutorial.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.SearchPageFactory;

import java.util.concurrent.TimeUnit;

public class FrameworkTestCase {
    private WebDriver driver;
    private String baseUrl;
    SearchPageFactory searchPage;


    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com/";

        searchPage = new SearchPageFactory(driver);

        //Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void test() throws Exception{
      //searchPage.clickFlightsTab();
      searchPage.setOriginCity("New York");
      searchPage.setDestinationCity("Chicago");
      searchPage.setDepartureDate("12/12/2019");
      searchPage.setReturnDate("15/12/2019");
      searchPage.clickSearchButton();
    }
}
