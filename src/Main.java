import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import java.sql.Time;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/akshatdhaka/Downloads/chromedriver/chromedriver");

        // Open Chrome browser
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));

        // Navigate to Expedia website
        try {
            driver.get("https://www.expedia.com/");

            //Maximise browser window
            driver.manage().window().maximize();

            //Verify landing on the correct page
            String expectedTitle = "Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More";
            if (driver.getTitle().equals(expectedTitle)) {
                System.out.println("Landed on the correct page!");
            } else {
                System.out.println("Unexpected page title: " + driver.getTitle());
            }

            // Print the URL and Title of the Page
            System.out.println("Current URL: " + driver.getCurrentUrl());
            System.out.println("Current Title: " + driver.getTitle());

            // Click on "English"
            WebElement englishLink = driver.findElement(By.xpath("//button[contains(text(),'English')]"));
            englishLink.click();

            // Choose the Region as "India"

            WebElement dropdownRegion = wait.until(ExpectedConditions.elementToBeClickable(By.id("site-selector")));
            Thread.sleep(4000);
            Select selectRegion = new Select(dropdownRegion);
            Thread.sleep(4000);
            String optionValueToSelectRegion = "27";
            Thread.sleep(4000);
            selectRegion.selectByValue(optionValueToSelectRegion);
            Thread.sleep(4000);



            // Choose the Language as "English"
//        WebElement dropdownLanguage = driver.findElement(By.id("language-selector"));
//        WebElement dropdownLanguage = wait.until(ExpectedConditions.elementToBeClickable(By.id("language-selector")));
//        Thread.sleep(4000);
//        Select selectLanguage = new Select(dropdownLanguage);
//        String optionValueToSelectLanguage = "2057";
//            Thread.sleep(4000);
//        selectRegion.selectByValue(optionValueToSelectLanguage);


            // Click on save
        WebElement saveLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Save')]"))) ;
        Thread.sleep(4000);
        saveLink.click();
        Thread.sleep(4000);


            // Click on "Flights"
            WebElement flightsTab = driver.findElement(By.linkText("Flights"));
            Thread.sleep(2000);
            flightsTab.click();
            Thread.sleep(2000);

            //Changing trip to "one way"
            WebElement tripChange = driver.findElement(By.xpath("//*[@id=\"search_form_product_selector_flights\"]/div/div[1]/div/ul/li[2]/a"));
            Thread.sleep(2000);
            tripChange.click();
            Thread.sleep(2000);


            // Enter the departure city: Kolkata
            WebElement departureCityInput = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ONE_WAY\"]/div/div[1]/div/div[1]/div/div/div[2]/div[1]/button"));
            Thread.sleep(2000);
            departureCityInput.click();
            Thread.sleep(2000);
            WebElement departureInput = driver.findElement(By.xpath("//*[@id=\"origin_select\"]"));
            Thread.sleep(2000);
            departureInput.click();
            Thread.sleep(2000);
            departureInput.sendKeys("Kolkata");
            Thread.sleep(2000);
            WebElement departureCity = driver.findElement(By.xpath("//*[@id=\"origin_select-menu\"]/section/div/div[2]/div/ul/li[1]/div/div/button"));
            Thread.sleep(2000);
            departureCity.click();
            Thread.sleep(2000);

            // Enter the destination city: Hyderabad
            WebElement destinationCityInput = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ONE_WAY\"]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/button"));
            Thread.sleep(2000);
            destinationCityInput.click();
            Thread.sleep(2000);
            WebElement destinationInput = driver.findElement(By.xpath("//*[@id=\"destination_select\"]"));
            Thread.sleep(2000);
            destinationInput.click();
            Thread.sleep(2000);
            destinationInput.sendKeys("Hyderabad");
            Thread.sleep(2000);
            WebElement destinationCity = driver.findElement(By.xpath("//*[@id=\"destination_select-menu\"]/section/div/div[2]/div/ul/li[1]/div/div/button"));
            Thread.sleep(2000);
            destinationCity.click();
            Thread.sleep(2000);


            // Click on the departure date
            WebElement departureDateInput = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ONE_WAY\"]/div/div[2]/div/div[1]/div/div/button"));
            Thread.sleep(2000);
            departureDateInput.click();
            Thread.sleep(2000);
            WebElement pickDate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@role='button' and div[@aria-label='Saturday, 17 February 2024']]//div[contains(@class, 'uitk-date-number') and text()='17']")));
            System.out.println(pickDate);
            pickDate.click();
            Thread.sleep(2000);
            WebElement selectDate = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ONE_WAY\"]/div/div[2]/div/section/footer/div/button"));
            Thread.sleep(2000);
            selectDate.click();
            Thread.sleep(2000);


            // Click on "Travellers"
            WebElement selectTraveller = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ONE_WAY\"]/div/div[3]/div/div[1]/button"));
            Thread.sleep(2000);
            selectTraveller.click();
            Thread.sleep(2000);
            WebElement incAdult = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[4]/div[1]/div/div/div/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/section/div[1]/div/div/button[2]"));
            Thread.sleep(2000);
            incAdult.click();
            Thread.sleep(2000);
            WebElement doneTraveller = driver.findElement(By.xpath("//*[@id=\"travelers_selector_done_button\"]"));
            Thread.sleep(2000);
            doneTraveller.click();
            Thread.sleep(2000);

            //Click on Search Button
            WebElement searchFlight = driver.findElement(By.id("search_button"));
            Thread.sleep(2000);
            searchFlight.click();
            Thread.sleep(2000);

            //Selecting first flight that appears
            WebElement firstFlight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[3]/div/div/div/main/ul/li[1]")));
            Thread.sleep(2000);
            firstFlight.click();
            Thread.sleep(2000);
            WebElement selectFlight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Select')]")));
            selectFlight.click();

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
             //Close the browser
            driver.quit();
        }
    }
}