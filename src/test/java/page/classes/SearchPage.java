package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;

    /**
     * Returns the flight origin text box element
     * @param driver
     * @return
     */
    public static WebElement originTextBox(WebDriver driver){
        element = driver.findElement(By.id("package-origin-hp-package"));
        return element;
    }

    public static void fillOriginTextBox(WebDriver driver, String origin){
        element = originTextBox(driver);
        element.sendKeys(origin);
    }

    /**
     * Returns the flight destination text box element
     * @param driver
     * @return
     */
    public static WebElement destinationTextBox(WebDriver driver){
        element = driver.findElement(By.id("package-destination-hp-package"));
        return element;
    }

    public static void fillDestinationTextBox(WebDriver driver, String destination){
        element = destinationTextBox(driver);
        element.sendKeys(destination);
    }

    /**
     * Returns the departure date text box element
     * @param driver
     * @return
     */
    public static WebElement departureDateBox(WebDriver driver){
        element = driver.findElement(By.id("package-departing-hp-package"));
        return element;
    }

    public static void fillDepartureDateBox(WebDriver driver, String departureDate){
        element = departureDateBox(driver);
        element.sendKeys(departureDate);
    }


    /**
     * Returns the return date text box element
     * @param driver
     * @return
     */
    public static WebElement returnDateBox(WebDriver driver){
        element = driver.findElement(By.id("package-returning-hp-package"));
        return element;
    }

    public static void fillReturnDateBox(WebDriver driver, String returnDate){
        element = returnDateBox(driver);
        element.sendKeys(returnDate);
    }


    /**
     * Returns the search button box element
     * @param driver
     * @return
     */
    public static WebElement searchButton(WebDriver driver){
        element = driver.findElement(By.id("search-button-hp-package"));
        return element;
    }

    /**
     * Click on search button
     * @param driver
     */
    public static void clickOnSearhButton (WebDriver driver){
        element = searchButton(driver);
        element.click();
    }

    /**
     * Navigate to flights tab
     * @param driver
     */
    public static void navigateToFlightTab(WebDriver driver){
       // driver.findElement(By.id("header-history")).click();
        element =driver.findElement(By.id("primary-header-flight"));
        element.click();
    }
}