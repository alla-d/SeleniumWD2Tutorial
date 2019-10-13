package page.classes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
    WebDriver driver;

    @FindBy (id="tab-flight-tab-hp")
    WebElement flightsTab;

    @FindBy(id="flight-type-roundtrip-label-hp-flight")
    WebElement roundTrip;

    @FindBy (id="flight-type-multi-dest-label-hp-flight")
    WebElement multipleDestination;

    @FindBy (id="header-history")
    WebElement headerhistory;

    @FindBy(id="tab-flight-tab")
    WebElement flightTab;

    @FindBy(id="package-origin-hp-package")
    WebElement originCity;

    @FindBy(id="package-destination-hp-package")
    WebElement destinationCity;

    @FindBy(id="package-departing-hp-package")
    WebElement departureDate;

    @FindBy(id = "package-returning-hp-package")
    WebElement returnDate;

    @FindBy(id = "search-button-hp-package")
    WebElement searchButton;

    public SearchPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFlightsTab(){
        headerhistory.click();
        flightsTab.click();
    }

    public void setOriginCity(String origin){
        originCity.sendKeys(origin);
    }

    public void setDestinationCity(String destination){
        destinationCity.sendKeys(destination);
    }

    public void setDepartureDate(String departureFlight){
        departureDate.sendKeys(departureFlight);
    }

    public void setReturnDate(String returnFlight){
        returnDate.sendKeys(returnFlight);
    }

    public void clickSearchButton (){
        searchButton.click();
    }

    public void clickFlightTab() {
        flightTab.click();
    }

    public void clickRoundTrip(){
        roundTrip.click();
    }

    public void clickmultipleDestination() {
        multipleDestination.click();
    }

}
